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
public class Shipyard extends WorkBuilding{

    public Shipyard(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
    }
    
    public int getTotalParallelProduction(){
        return getInstances().size();
    }
    /*
    
    method will be implemented after the ship class is introduced
    public int getProducitonTime(Ship ship, )
    */
    private int getLevelThreeInstances(){
        int t=0;
        for(int i=0; i<getInstances().size();i++)
            if(getInstances().get(i).getLevel()==2)
                t++;
        return t;
    }
}
