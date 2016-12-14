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
public class Ship extends Unit{
    private final int lumberRequirement;
    private final int slaveRequirement;
    private final boolean corvus;
    private final boolean polyreme;
    private final boolean trireme;
    private final boolean rammingShip;

    public Ship(int lumberRequirement, int slaveRequirement, boolean corvus, boolean polyreme, boolean trireme, boolean rammingShip, int proletariatRequirement, int aristoiRequirement, int moneyCost, int trainingTime, int monthlyWage, int basePower, String name) {
        super(proletariatRequirement, aristoiRequirement, moneyCost, trainingTime, monthlyWage, basePower, name);
        this.lumberRequirement = lumberRequirement;
        this.slaveRequirement = slaveRequirement;
        this.corvus = corvus;
        this.polyreme = polyreme;
        this.trireme = trireme;
        this.rammingShip = rammingShip;
    }
    
    //will be implemented, returns the power with bonuses
    //needs to be multiplied by ship number for a unit
    public double getPowerAfterBonusesApplied(Navy enemyNavy){
        
    }

    public int getLumberRequirement() {
        return lumberRequirement;
    }

    public int getSlaveRequirement() {
        return slaveRequirement;
    }

    public boolean isCorvus() {
        return corvus;
    }

    public boolean isPolyreme() {
        return polyreme;
    }

    public boolean isTrireme() {
        return trireme;
    }

    public boolean isRammingShip() {
        return rammingShip;
    }
    
    
}
