/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine.GameElementClasses;

import java.util.ArrayList;

/**
 *
 * @author onur
 */
public class Armory extends ProductionBuilding{
    private final ArrayList<Integer> ArmoriesAndWaponMakersNearby;
    
    public Armory(ManufacturedMaterial[] manufacturedMaterials, Material[] storedResources, int[][] capacities, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce, int[][] workerCounts) {
        super(manufacturedMaterials, storedResources, capacities, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce, workerCounts);
        ArmoriesAndWaponMakersNearby=new ArrayList();
    }

    @Override
    protected int getProductionCapacity(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override //will be implemented
    public void updateBonuses(int[][] cityMap, Building caller, int buildingInstance){
        super.updateBonuses(cityMap, caller, buildingInstance);
    }
    
    @Override
    public void delete(int x, int y){
        int i =findInstance(x,y);
        ArmoriesAndWaponMakersNearby.remove(i);
        super.delete(x,y);
    }
    
}
