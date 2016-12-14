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
public abstract class StorageBuilding extends WorkBuilding{
    private final Material[] storedResources;
    
    //capacities has row size equivalent to the material types
    //and column size equivalent to 3 for every level
    //capacity[1][2] stores the type one resource 
    //capacity can be stored by a level 3 instance
    private final int[][] capacities;
    private final ArrayList<Integer> nearAgoraInstances;

    public StorageBuilding(Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        this.storedResources = storedResources;
        this.capacities = capacities;
        nearAgoraInstances= new ArrayList();
    }
    
    
    public int[] getTotalStorageCapacities(){
        int[] totalStorage= new int[capacities.length];
        int[] levels=new int[3];
        for(int i=0;i<getInstances().size();i++)
            levels[getInstances().get(i).getLevel()-1]++;
        for(int i=0;i<totalStorage.length;i++)
            for(int j=0;j<3;j++)
                totalStorage[i]+=levels[j]*capacities[i][j];
        
        levels=new int[3];
        for(int i=0;i<nearAgoraInstances.size();i++)
            levels[getInstances().get(nearAgoraInstances.get(i)).getLevel()-1]++;
        for(int i=0;i<totalStorage.length;i++)
            for(int j=0;j<3;j++)
                totalStorage[i]+=levels[j]*capacities[i][j];
        return totalStorage;
    }
    
    @Override
    public void delete(int x, int y){
        int p=findInstance(x,y);
        for(int i=0;i<nearAgoraInstances.size();i++)
            if(nearAgoraInstances.get(i)==p){
                nearAgoraInstances.remove(i);
                i--;
            }
            else if(nearAgoraInstances.get(i)>p)
                nearAgoraInstances.set(i, nearAgoraInstances.get(i)-1);
        super.delete(x, y);
    }

    @Override //should check for agora
    public void updateBonuses(int[][][] cityMap, Building caller, int buildingInstance) {
        super.updateBonuses(cityMap, caller, buildingInstance); //To change body of generated methods, choose Tools | Templates.
    }    
}
