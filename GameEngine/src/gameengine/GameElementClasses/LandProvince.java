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
public abstract class LandProvince extends Province{
    private Army army;

    public LandProvince(String name, int[][] pixelsOnTheMap) {
        super(name, pixelsOnTheMap);
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }
    
}
