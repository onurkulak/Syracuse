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
public class RawMaterial extends Material {
    private final boolean gathererSlave;
    private final boolean seasonalMaterial;
    private final int season;
    
    //production constant is used when harvesting season but not multiplied by 4
    private final double productionConstant;
    public RawMaterial(int baseTradeCost, int requiredAmountToFillShip, 
            boolean storable, boolean edible, boolean tradable, String name, 
            boolean gathererSlave, boolean isSeason, int season,
            double productionConstant) 
    {
        super(baseTradeCost, requiredAmountToFillShip, storable, edible, tradable, name);
        this.gathererSlave=gathererSlave;
        seasonalMaterial=isSeason;
        this.season=season;
        this.productionConstant=productionConstant;
    }

    public boolean isGathererSlave() {
        return gathererSlave;
    }

    public boolean isSeasonalMaterial() {
        return seasonalMaterial;
    }

    public int getSeason() {
        return season;
    }

    public double getProductionConstant() {
        return productionConstant;
    }
    
    
    
}
