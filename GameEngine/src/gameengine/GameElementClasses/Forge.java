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

public class Forge extends ProductionBuilding{
    private final ArrayList<Integer> mansionsNearby;
    private final ArrayList<Integer> forgesNearby;
    
    //amounts will be decided later
    private final double unhappinessForMansion=0;
    
    
    public Forge(ManufacturedMaterial[] manufacturedMaterials, Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(manufacturedMaterials, storedResources, capacities, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        forgesNearby=new ArrayList();
        mansionsNearby=new ArrayList();
    }

    @Override
    protected int getProductionCapacity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBonuses(int[][] cityMap, Building caller, int buildingInstance) {
        super.updateBonuses(cityMap, caller, buildingInstance); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getUnappinessProduced(){
        double total=0;
        for(int i=0; i<mansionsNearby.size();i++)
            total+=mansionsNearby.get(i);
        return (int)(unhappinessForMansion*total);
    }
    
    
    //will be implemented later
    public int getTotalIronUsed(int productionAmount){
        
        return 0;
    }

    @Override
    public void delete(int x, int y) {
        int i =findInstance(x,y);
        mansionsNearby.remove(i);
        forgesNearby.remove(i);
        super.delete(x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
}
