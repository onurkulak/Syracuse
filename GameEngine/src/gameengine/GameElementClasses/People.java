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
public abstract class People {
    private final String name;
    private int countInCounties, countInForces, 
            //count in forces does not include syracuse garrison
            //count in forces should be updated during merges
            countInCity, unemployed;
    private Material[] food;
    //consume also starves people and makes them die
    //but these changes need to be assured by population manager in counties
    //if unemployed becomes minus i.e. people starve and player cannot afford running buildings
    //there should be some punishment, maybe decrease in overall city production
    //if there's a starvation in county, or unemployed goes minus consume returns true
    public abstract boolean consume(boolean isBesieged);
    
    protected int getPopulationToFeed(boolean isBesieged){
        if(isBesieged)
            return getCountInCity();
        else return getTotalPopulation();
    }
    
    
    
    protected boolean starvePeople(int availableFood, boolean isBesieged){
        if(getPopulationToFeed(isBesieged)<availableFood)
            return false;
        
        if(getPopulationToFeed(isBesieged)-unemployed<=availableFood){
            int starvingCount=availableFood-getPopulationToFeed(isBesieged);
            adjustUnemployedPopulation(starvingCount);
            adjustCityPopulation(starvingCount);
            return false;
        }
        else{
            adjustCityPopulation(-getUnemployed());
            setUnemployed(0);
        }
        
        if(isBesieged){
            int populationNeedToDie=getPopulationToFeed(isBesieged)-availableFood;
            adjustCityPopulation(-populationNeedToDie);
            adjustUnemployedPopulation(-populationNeedToDie);
            return true;
        }
        else{
            if(getPopulationToFeed(isBesieged)-getCountInCounties()<=availableFood){
                int starvingCount=availableFood-getPopulationToFeed(isBesieged);
                adjustCountyPopulation(-starvingCount);
                return true;
            }
            else{
                setCountInCounties(0);
                int populationNeedToDie=getPopulationToFeed(isBesieged)-availableFood;
                adjustCityPopulation(-populationNeedToDie);
                adjustUnemployedPopulation(-populationNeedToDie);
                if(getCountInCity()<0)
                    setCountInCity(0);
                return true;
            }
        }
    }
    
    protected int getTotalFood(Material[] material, ArrayList<Material> ediblesList){
        int totalFood=0;
        for(int i=0;i<material.length;i++){
            Material sample=material[i];
            if(sample.isAllowedToConsume()&&sample.isEdible()&&sample.getAmount()!=0){
                ediblesList.add(sample);
                totalFood+=sample.getAmount();
            }
        }
        return totalFood;
    }
    
    public int getTotalPopulation(){
        return getCountInCounties()+
                getCountInForces()+
                getCountInCity();
    }
    
    public void adjustCountyPopulation(int i){
        countInCounties+=i;
    }
    
    public void adjustForcesPopulation(int i){
        countInForces+=i;
    }
    
    public void adjustCityPopulation(int i){
        countInCity+=i;
    }
    
    public void adjustUnemployedPopulation(int i){
        unemployed+=i;
    }

    public void setCountInCounties(int countInCounties) {
        this.countInCounties = countInCounties;
    }

    public void setCountInForces(int countInForces) {
        this.countInForces = countInForces;
    }

    public void setCountInCity(int countInCity) {
        this.countInCity = countInCity;
    }

    public void setUnemployed(int unemployed) {
        this.unemployed = unemployed;
    }
    
    
    
    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountInCounties() {
        return countInCounties;
    }

    public int getCountInForces() {
        return countInForces;
    }

    public int getCountInCity() {
        return countInCity;
    }

    public int getUnemployed() {
        return unemployed;
    }

    protected Material[] getFood() {
        return food;
    }

    public void setFood(Material[] food) {
        this.food = food;
    }
    
}
