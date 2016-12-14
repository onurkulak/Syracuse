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
public abstract class Unit {
    //for land units wage is for a single soldier
    //for ships for whole crew
    private final int proletariatRequirement, aristoiRequirement,
            moneyCost, trainingTime, monthlyWage, basePower;
    private boolean unlocked;
    private final String name;

    public Unit(int proletariatRequirement, int aristoiRequirement, int moneyCost, int trainingTime, int monthlyWage, int basePower, String name) {
        this.proletariatRequirement = proletariatRequirement;
        this.aristoiRequirement = aristoiRequirement;
        this.moneyCost = moneyCost;
        this.trainingTime = trainingTime;
        this.monthlyWage = monthlyWage;
        this.basePower = basePower;
        this.unlocked = false;
        this.name = name;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public int getProletariatRequirement() {
        return proletariatRequirement;
    }

    public int getAristoiRequirement() {
        return aristoiRequirement;
    }

    public int getMoneyCost() {
        return moneyCost;
    }

    public int getTrainingTime() {
        return trainingTime;
    }

    public int getMonthlyWage() {
        return monthlyWage;
    }

    public int getBasePower() {
        return basePower;
    }

    public String getName() {
        return name;
    }
    
    
}
