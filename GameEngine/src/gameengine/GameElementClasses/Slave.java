/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine.GameElementClasses;

/**
 *
 * @author onur
 */
import java.util.ArrayList;
public class Slave extends People{

    public Slave(String name) {
        super(name);
    }

    @Override //slaves eat frist the non storable foods, then eat the cheapest ones
    public boolean consume(boolean isBesieged) {
        boolean returnValue;
        ArrayList<Material> consumables=new ArrayList();
        int totalFood=getTotalFood(getFood(), consumables);
        returnValue=starvePeople(totalFood, isBesieged);
        int populationToFeed=getPopulationToFeed(isBesieged);
        
        for(int i=0;i<consumables.size()&&populationToFeed!=0;i++){
            Material food=consumables.get(i);
            if(!food.isStorable())
                if(populationToFeed>food.getAmount()){
                    populationToFeed-=food.getAmount();
                    food.setAmount(0);
                    consumables.remove(i);
                    i--;
                }
                else{
                    food.consume(populationToFeed);
                    populationToFeed=0;
                }
        }
        while(populationToFeed!=0){
            int cheapestFoodIndex=0;
            for(int i=1;i<consumables.size();i++){
                Material food=consumables.get(i);
                if(food.getBaseTradeCost()
                   <consumables.get(cheapestFoodIndex).getBaseTradeCost())
                    cheapestFoodIndex=i;
            }
            Material food=consumables.get(cheapestFoodIndex);
            if(food.getAmount()>=populationToFeed){
                food.consume(populationToFeed);
                populationToFeed=0;
            }
            else{
                populationToFeed=food.getAmount();
                food.setAmount(0);
                consumables.remove(cheapestFoodIndex);
            }
        }
        return returnValue;
    }
}
