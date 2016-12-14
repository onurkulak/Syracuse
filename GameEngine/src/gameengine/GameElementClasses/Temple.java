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
public class Temple extends WorkBuilding{
    //values will be given later
    private final int RANGE=0, MARBLE_COST=0, 
            MARBLE_UPGRADE_COST1=0, MARBLE_UPGRADE_COST2=0,
            HAPPINESS_FROM_MONUMENT=0, HAPPINESS_FROM_SHRINE=0;
    private final ArrayList<Integer> monumentNumberCovered, shrineNumberCovered;

    public Temple(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        monumentNumberCovered=new ArrayList();
        shrineNumberCovered=new ArrayList();
    }

    public int getTotalHappıness(){
        int total=0;
        for(int i=0; i<getInstances().size();i++)
            if(getInstances().get(i).getLevel()==3){
                total+=monumentNumberCovered.get(i)*HAPPINESS_FROM_MONUMENT+
                        shrineNumberCovered.get(i)*HAPPINESS_FROM_SHRINE;
            }
            else if(getInstances().get(i).getLevel()==2)
                total+=shrineNumberCovered.get(i)*HAPPINESS_FROM_SHRINE;
        return total;
    }
    
    @Override
    public void delete(int x, int y){
        int p=findInstance(x,y);
        monumentNumberCovered.remove(p);
        shrineNumberCovered.remove(p);
        super.delete(x, y);
    }
    
    
    public int getMARBLE_COST() {
        return MARBLE_COST;
    }

    public int getMARBLE_UPGRADE_COST1() {
        return MARBLE_UPGRADE_COST1;
    }

    public int getMARBLE_UPGRADE_COST2() {
        return MARBLE_UPGRADE_COST2;
    }

    @Override //will be implemented
    public void updateBonuses(int[][][] cityMap, Building caller, int buildingInstance) {
        super.updateBonuses(cityMap, caller, buildingInstance); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
