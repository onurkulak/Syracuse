/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

/**
 *
 * @author onur
 */
public class RawMaterial extends Material {
    private final boolean gathererSlave;
    public RawMaterial(int baseTradeCost, int requiredAmountToFillShip, boolean storable, 
            boolean consumable, boolean edible, boolean tradable, String name, boolean gathererSlave) {
        super(baseTradeCost, requiredAmountToFillShip, storable, consumable, edible, tradable, name);
        this.gathererSlave=gathererSlave;
    }

    public boolean isGathererSlave() {
        return gathererSlave;
    }
    
    
    
}
