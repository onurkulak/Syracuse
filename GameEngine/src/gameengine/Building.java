package gameengine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onur
 */

import java.util.ArrayList;
public abstract class Building {
    private final int cost, width, height, constructionDuration, id,
            upgradeCost1, upgradeCost2, maximumAvailableLevel;
    private final String name;
    private final int[] requiredBuildings, requirementsRange;
    private final boolean canBuiltOnlyOnce;
    private boolean unlocked;
    private final ArrayList<Building> relatedBuildings;
    private final ArrayList<Specification> instances;

    public Building(int cost, int width, int height, int constructionDuration,
            int id, int upgradeCost1, int upgradeCost2,
            int maximumAvailableLevel, String name, int[] requiredBuildings,
            int[] requirementsRange, boolean canBuiltOnlyOnce) {
        this.cost = cost;
        this.width = width;
        this.height = height;
        this.constructionDuration = constructionDuration;
        this.id = id;
        this.upgradeCost1 = upgradeCost1;
        this.upgradeCost2 = upgradeCost2;
        this.maximumAvailableLevel = maximumAvailableLevel;
        this.name = name;
        this.requiredBuildings = requiredBuildings;
        this.requirementsRange = requirementsRange;
        this.canBuiltOnlyOnce = canBuiltOnlyOnce;
        relatedBuildings=new ArrayList<>();
        instances=new ArrayList<>();
        unlocked=false;
    }
    
    
    //returns the instance of the building in the given coordinates
    protected int findInstance(int x, int y){
        for(int i=0;i<instances.size();i++){
            Specification instance=instances.get(i);
            if(instance.getxCoordinate()<=x&&
               instance.getyCoordinate()<=y)
                
                if(instance.isHorizontal()){
                    if(instance.getxCoordinate()+width>x&&
                       instance.getyCoordinate()+height>y)
                        return i;
                }
            
                else if(instance.getxCoordinate()+height>x&&
                       instance.getyCoordinate()+width>y)
                        return i;
        }
        
        return -1;
    }
    
    public void passTurn(int[][][] cityMap){
        for(int i=0; i<instances.size();i++)
            if(instances.get(i).construct()){
                updateBonuses(cityMap, this,i);
            for (Building relatedBuilding : relatedBuildings) {
                relatedBuilding.updateBonuses(cityMap, this, i);
            }
            }
    }
    
    
    //needs to be implemented in subclasses separately
    public void updateBonuses(int[][][] cityMap, Building caller, int buildingInstance){
        
    }
    
    //needs to be implemented, returns true if there is an instance nearby
    private boolean isThereInstanceNearby
        (int x, int y, int targetId, int[][][] cityMap){
            return true;
        }
    
    //returns number of target building instances around the building 
    //instance given by x y coordinates ; needs to be implemented
    private int numberOfInstancesAroundAnInstance
        (int x, int y, int[][][] cityMap, Building targetBuilding ){
            return 0;
        }
        
    //basic deletion, needs to be overwiritten in some subclasses    
    public void delete(int x, int y){
        int i=findInstance(x,y);
        instances.remove(i);
    }
    
    //basic upgrade, needs to be overwiritten in some subclasses 
    public int upgrade(int x, int y){
        int i=findInstance(x,y);
        instances.get(i).levelUp();
        return i;
    }
    
    //basic build, probably there is no need to overwrite
    public void build(int x, int y, boolean alignment){
        Specification spec=new Specification(x,y,constructionDuration,alignment);
        instances.add(spec);
    }
    

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }
    
    public boolean doesExist(){
        return instances.isEmpty();
    }

    public int getCost() {
        return cost;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getConstructionDuration() {
        return constructionDuration;
    }

    public int getId() {
        return id;
    }

    public int getUpgradeCost1() {
        return upgradeCost1;
    }

    public int getUpgradeCost2() {
        return upgradeCost2;
    }

    public int getMaximumAvailableLevel() {
        return maximumAvailableLevel;
    }

    public String getName() {
        return name;
    }

    public int[] getRequiredBuildings() {
        return requiredBuildings;
    }

    public int[] getRequirementsRange() {
        return requirementsRange;
    }

    public boolean isCanBuiltOnlyOnce() {
        return canBuiltOnlyOnce;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public ArrayList<Building> getRelatedBuildings() {
        return relatedBuildings;
    }

    public ArrayList<Specification> getInstances() {
        return instances;
    }
    
    
}
