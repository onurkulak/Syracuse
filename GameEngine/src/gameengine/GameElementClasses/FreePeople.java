/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine.GameElementClasses;

import java.util.ArrayList;

/**
 *
 * @author onur
 */
public abstract class FreePeople extends People{
    private int[] foodHappiness;
    protected int happiness;
    private int previousTurnPopulationIncrease;
    private final double goodNeedFrequency=0;
    
    //this modifier needs to be decided
    private final double foodHappinessModifier=0;
    protected final double goodsHappinessModifier=0;
    protected Material[] goodsNeeds;
    protected int[] goodsHappiness;
    
    private Material oil,grapeJuice;
    private int oilHappiness,grapeJuiceHappiness;

    public FreePeople(String name) {
        super(name);
        previousTurnPopulationIncrease=0;
        happiness=0;
    }

    public int getPreviousTurnPopulationIncrease() {
        return previousTurnPopulationIncrease;
    }

    public void setPreviousTurnPopulationIncrease(int previousTurnPopulationIncrease) {
        this.previousTurnPopulationIncrease = previousTurnPopulationIncrease;
    }

    private int getScarcestAmount(ArrayList<Material> resources){
        int smallestIndex=resources.get(0).getAmount();
        for(int i=1;i<resources.size();i++)
            if(resources.get(i).getAmount()<resources.get(smallestIndex).getAmount())
                smallestIndex=i;
        return resources.get(smallestIndex).getAmount();
    }
    
    private int getHappinessMultiplierTotal(ArrayList<Material> foods){
        int total=0;
        for(int i=0;i<foods.size();i++)
            for(int j=0;j<getFood().length;j++)
                if(foods.get(i)==getFood()[j]){
                    total+=foodHappiness[j];
                    break;
                }
        return total;
    }
    
    @Override
    public boolean consume(boolean isBesieged) {
        boolean returnValue;
        ArrayList<Material> consumables=new ArrayList();
        int totalFood=getTotalFood(getFood(), consumables);
        returnValue=starvePeople(totalFood, isBesieged);
        int populationToFeed=getPopulationToFeed(isBesieged);
        
        double newHappiness=0;
        while(populationToFeed!=0){
            int foodAmount=getScarcestAmount(consumables);
            int foodPerShare=populationToFeed/consumables.size();
            int foodRemaining=populationToFeed%consumables.size();
            
            if(foodPerShare>=foodAmount){
                newHappiness+=getHappinessMultiplierTotal(consumables)*foodAmount*foodHappinessModifier/foodPerShare;
                populationToFeed-=foodAmount*consumables.size();
                for(int i=0;i<consumables.size();i++){
                    consumables.get(i).consume(foodAmount);
                    if(consumables.get(i).getAmount()==0)
                    {
                        consumables.remove(i);
                        i--;
                    }
                }
                if(foodRemaining<=consumables.size()){
                    for(int i=0;i<foodRemaining;i++)
                        consumables.get(i).consume(1);
                populationToFeed=0;
                }
            }
            else{
                newHappiness+=getHappinessMultiplierTotal(consumables)*foodHappinessModifier;
                populationToFeed=0;
                for(int i=0;i<consumables.size();i++){
                    consumables.get(i).consume(foodPerShare);
                }
            }
        }
        
        //if people have starved happiness is halved
        if(returnValue)
            happiness=(int)(newHappiness/2);
        else happiness=(int)newHappiness;
        
        
        int drinkers=getPopulationToFeed(isBesieged)/10;
        if(oil.isAllowedToConsume())
        if(oil.consume(drinkers))
            happiness+=oilHappiness*foodHappinessModifier;
        else{
            happiness+=oil.getAmount()/(drinkers)*oilHappiness*foodHappinessModifier;
            oil.setAmount(0);
        }
        if(grapeJuice.isAllowedToConsume());
        if(grapeJuice.consume(drinkers))
            happiness+=grapeJuiceHappiness*foodHappinessModifier;
        else{
            happiness+=grapeJuice.getAmount()/(drinkers)*grapeJuiceHappiness*foodHappinessModifier;
            grapeJuice.setAmount(0);
        }
        
        
        consumeGoods();
        return returnValue;
    }
    
    protected void consumeGoods(){
        int peopleInNeed=getPreviousTurnPopulationIncrease()+
            (int)(getGoodNeedFrequency()*getTotalPopulation());
        double happinessFromGoods=0;
        for(int i=0;i<goodsNeeds.length;i++)
            if(goodsNeeds[i].isAllowedToConsume())
                if(goodsNeeds[i].getAmount()<peopleInNeed){
                    happinessFromGoods+=goodsHappinessModifier*goodsNeeds[i].getAmount()/peopleInNeed*goodsHappiness[i];
                    goodsNeeds[i].setAmount(0);
                }
                else{
                    happinessFromGoods+=goodsHappinessModifier*goodsHappiness[i];
                    goodsNeeds[i].consume(peopleInNeed);
                }
        
        happiness+=happinessFromGoods;
    }

    public void setFoodHappiness(int[] foodHappiness) {
        this.foodHappiness = foodHappiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return happiness;
    }

    public double getGoodNeedFrequency() {
        return goodNeedFrequency;
    }

    public double getGoodsHappinessModifier() {
        return goodsHappinessModifier;
    }

    public void setGoodsNeeds(Material[] goodsNeeds) {
        this.goodsNeeds = goodsNeeds;
    }

    public void setGoodsHappiness(int[] goodsHappiness) {
        this.goodsHappiness = goodsHappiness;
    }

    public void setOil(Material oil) {
        this.oil = oil;
    }

    public void setGrapeJuice(Material grapeJuice) {
        this.grapeJuice = grapeJuice;
    }

    public void setOilHappiness(int oilHappiness) {
        this.oilHappiness = oilHappiness;
    }

    public void setGrapeJuiceHappiness(int grapeJuiceHappiness) {
        this.grapeJuiceHappiness = grapeJuiceHappiness;
    }
    
    
}
