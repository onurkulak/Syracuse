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
public class Theatre extends WorkBuilding{
    //range will be given later
    private final int RANGE=0;
    
    private int numberOfHousesInRange, numberOfMansionsInRange;
    private boolean usingDye;

    public Theatre(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        usingDye=true;
        numberOfHousesInRange=0;
        numberOfMansionsInRange=0;
    }
    
    public int getProletariatHappiness(){
        if(usingDye)
            return (int)(numberOfHousesInRange*1.3);
        else 
            return numberOfHousesInRange;
    }
    
    public int getAristoiHappiness(){
        if(usingDye)
            return (int)(numberOfMansionsInRange*1.4);
        else 
            return (int)(numberOfMansionsInRange*1.1);
    }

    public boolean isUsingDye() {
        return usingDye;
    }

    public void setUsingDye(boolean usingDye) {
        this.usingDye = usingDye;
    }

    
    //needs to be implemented
    @Override
    public void updateBonuses(int[][][] cityMap, Building caller, int buildingInstance) {
        super.updateBonuses(cityMap, caller, buildingInstance); //To change body of generated methods, choose Tools | Templates.
    }

}
