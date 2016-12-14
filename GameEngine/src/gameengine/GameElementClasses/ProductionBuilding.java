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
public abstract class ProductionBuilding extends StorageBuilding{
    protected final ManufacturedMaterial[] manufacturedMaterials;

    public ProductionBuilding(ManufacturedMaterial[] manufacturedMaterials, Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(storedResources, capacities, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        this.manufacturedMaterials = manufacturedMaterials;
    }
    
    public int getTotalProductionCapacity(){
        int total=0;
        for(int i=0;i<getInstances().size();i++)
            total+=getProductionCapacity(i);
        return total;
    }
    public int getInstanceProductionCapacity(int x, int y){
        int i=findInstance(x,y);
        return getProductionCapacity(i);
    }
    
    //this one will be written for every subclass specially
    //i means the i'th specification of the building
    protected abstract int getProductionCapacity(int i);
}
