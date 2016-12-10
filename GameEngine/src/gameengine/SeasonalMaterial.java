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
public class SeasonalMaterial extends RawMaterial{
    private final int season;

    public SeasonalMaterial(int season, int baseTradeCost, int requiredAmountToFillShip, 
            boolean storable, boolean consumable, boolean edible, 
            boolean tradable, String name, boolean gathererSlave) {
        super(baseTradeCost, requiredAmountToFillShip, storable, consumable, edible, tradable, name, gathererSlave);
        this.season = season;
    }

    public int getSeason() {
        return season;
    }
    
}
