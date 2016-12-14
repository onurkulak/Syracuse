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
public class SoldierReward extends Reward{
    private final Unit unit;

    public SoldierReward(Unit unit, int relationBonus) {
        super(relationBonus);
        this.unit = unit;
    }

    @Override//give free soldier to the garrison
    public void apply(Game game) {
    }
    
}
