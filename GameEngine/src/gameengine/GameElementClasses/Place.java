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
public abstract class Place {
    private final String name;
    private final int[][] pixelsOnTheMap; 
    //pixels on the map corresponds to a [x][2] int matrix
    //which holds coordinates every different land piece for this place
    //like islands etc.
    public Place(String name, int[][] pixelsOnTheMap) {
        this.name = name;
        this.pixelsOnTheMap = pixelsOnTheMap;
    }

    public String getName() {
        return name;
    }

    public int[][] getPixelsOnTheMap() {
        return pixelsOnTheMap;
    }
    
    
    
}
