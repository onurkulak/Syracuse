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
public class Tailor extends ProductionBuilding{
    private final ArrayList<Integer> nearbyTailors;

    public Tailor(ManufacturedMaterial[] manufacturedMaterials, Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(manufacturedMaterials, storedResources, capacities, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        nearbyTailors=new ArrayList();
    }
    
    //works same for dyed and the normal fabric
    public int[] getTotalFabricUse(int productionAmountFabric, int productionAmountDyedFabric){
        double total2=0; //dyed fabric counter
        double cost2=manufacturedMaterials[1].getCostAmount()[0]; //dyed fabric cost
        double total1=0; //fabric counter
        double cost1=manufacturedMaterials[0].getCostAmount()[0]; //fabric cost
        
        int[] productionCapacities=new int[3];
        for(int i=0;i<getInstances().size();i++){
            int level=getInstances().get(i).getLevel();
            productionCapacities[level-1]+=getProductionCapacity(i);
        }
        
        for(int i=2;productionAmountDyedFabric!=0;i--){
            if(productionCapacities[i]>productionAmountDyedFabric){
                total2+= productionAmountDyedFabric*cost2*(8-i)/8;
                productionCapacities[i]-=total2;
                productionAmountDyedFabric=0;
                for(;0!=productionAmountFabric;i--){
                    if(productionCapacities[i]>productionAmountFabric){
                    total1+= productionAmountFabric*cost1*(8-i)/8;
                    productionCapacities[i]-=total1;
                    productionAmountFabric=0;
                    }
                    else{
                        productionAmountFabric=productionAmountFabric-productionCapacities[i];
                        total1+= productionCapacities[i]*cost1*(8-i)/8;
                    }
                }
            }
            else{
            productionAmountDyedFabric=productionAmountDyedFabric-productionCapacities[i];
            total2+= productionCapacities[i]*cost2*(8-i)/8;
            }
        }
        
        int[] result= {(int)total1,(int) total2};
        return result;
    }

    @Override
    protected int getProductionCapacity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBonuses(int[][] cityMap, Building caller, int buildingInstance) {
        super.updateBonuses(cityMap, caller, buildingInstance); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int x, int y) {
        int i=findInstance(x,y);
        nearbyTailors.remove(i);
        super.delete(x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
