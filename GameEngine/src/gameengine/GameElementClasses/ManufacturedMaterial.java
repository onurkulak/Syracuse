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
public class ManufacturedMaterial extends Material{
    private final Material[] costType;
    private final double[] costAmount;
    private int productionLevel;

    public ManufacturedMaterial(Material[] costType, double[] costAmount, int baseTradeCost, int requiredAmountToFillShip, 
            boolean storable, boolean consumable, boolean edible, boolean tradable, String name) {
        super(baseTradeCost, requiredAmountToFillShip, storable, consumable, edible, tradable, name);
        this.costType = costType;
        this.costAmount = costAmount;
        productionLevel=2;
    }

    public Material[] getCostType() {
        return costType;
    }

    public double[] getCostAmount() {
        return costAmount;
    }

    public int getProductionLevel() {
        return productionLevel;
    }

    public void setProductionLevel(int productionLevel) {
        this.productionLevel = productionLevel;
    }
    
    
}
