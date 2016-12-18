package gameengine.GameElementClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onur
 */
public abstract class WorkBuilding extends Building {
    
    //worker counts is a 2*3 array
    //first row holds proletariat requirements, second aristoi
    //[0][1] means second level building proletariat requirements
    private final int[][] WORKER_COUNTS;
    
    public WorkBuilding(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(cost, width, height, constructionDuration, id, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
        WORKER_COUNTS= workerCounts;
    }
    
    public  int getRequiredProletariat(int x,int y){
        int p=findInstance(x,y);
        return WORKER_COUNTS[0][getInstances().get(p).getLevel()-1];
    }
    public  int getRequiredAristoi(int x,int y){
        int p=findInstance(x,y);
        return WORKER_COUNTS[1][getInstances().get(p).getLevel()-1];
    }
}
