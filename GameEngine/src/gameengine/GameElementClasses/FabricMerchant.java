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
public class FabricMerchant extends ProductionBuilding{

    public FabricMerchant(ManufacturedMaterial[] manufacturedMaterials, Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(manufacturedMaterials, storedResources, capacities, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
    }

    @Override
    protected int getProductionCapacity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getTotalDyedFabricProductionCapacity(){
        int total=0;
        for(int i=0;i<getInstances().size();i++)
            if(getInstances().get(i).getLevel()!=1)
                total+=getProductionCapacity(i);
        return total;
    }
    
    public int getTotalDyeUse(int dyedFabricAmount){
        double total=0; double cost=manufacturedMaterials[1].getCostAmount()[1];
        int[] levels=new int[2]; int[] productionCapacities=new int[2];
        for(int i=0;i<getInstances().size();i++){
            int level=getInstances().get(i).getLevel();
            if(level>1){
                levels[level-2]++;
                productionCapacities[level-2]+=getProductionCapacity(i);
            }
        }
        
        if(productionCapacities[1]>dyedFabricAmount)
            total+=cost*dyedFabricAmount*4/5;
        else{
            total+=cost*productionCapacities[1]*4/5;
            total+=cost*(dyedFabricAmount-productionCapacities[1]);
        }
        
        return (int)total;
    }
}
