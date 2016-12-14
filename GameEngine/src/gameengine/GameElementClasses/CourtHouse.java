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
public class CourtHouse extends WorkBuilding{
    private int housesInRange, mansionsInRange, militaryBuildingsInRange;
    
    //values needs to be decided
    private final int happinessPerHouse=0, happinessPerMansion=0, happinessPerMilitary=0;  
    
    public CourtHouse(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        housesInRange=0; mansionsInRange=0; militaryBuildingsInRange=0;
    }
    
    public int getHappiness(GovernmentCivic civic){
        if(civic.getName().equals("Tyranny"))
            return militaryBuildingsInRange*happinessPerMilitary;
        else if(civic.getName().equals("Democracy"))
            return housesInRange*happinessPerHouse;
        else return happinessPerMansion*mansionsInRange;
    }

    @Override
    public void updateBonuses(int[][][] cityMap, Building caller, int buildingInstance) {
        super.updateBonuses(cityMap, caller, buildingInstance); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
