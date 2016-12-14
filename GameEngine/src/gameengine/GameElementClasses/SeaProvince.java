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
public class SeaProvince extends Province{
    private Navy navy;

    public SeaProvince(String name, int[][] pixelsOnTheMap) {
        super(name, pixelsOnTheMap);
    }

    public Navy getNavy() {
        return navy;
    }

    public void setNavy(Navy navy) {
        this.navy = navy;
    }
    
}
