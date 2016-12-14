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
public class Bakery extends ProductionBuilding{

    public Bakery(ManufacturedMaterial[] manufacturedMaterials, Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(manufacturedMaterials, storedResources, capacities, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
    }

    @Override
    protected int getProductionCapacity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //returns the total flour use 
    public int getTotalFlourUse(int productionAmount){
        double total=0; double cost=manufacturedMaterials[0].getCostAmount()[0];
        int[] productionCapacities=new int[3];
        for(int i=0;i<getInstances().size();i++){
            int level=getInstances().get(i).getLevel();
            productionCapacities[level-1]+=getProductionCapacity(i);
        }
        for(int i=2;productionAmount!=0;i--){
            if(productionCapacities[i]>productionAmount){
                total+= productionAmount*cost/Math.sqrt(i+1);
                productionAmount=0;
            }
            else{
            productionAmount=productionAmount-productionCapacities[i];
            total+= productionCapacities[i]*cost/Math.sqrt(i+1);
            }
        }
        return (int)total;
    }
}
