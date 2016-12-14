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
public abstract class Province extends Place{
    private Faction owner;
    private Province[] neighbors;
    //this design might need to change
    //not sure how will handle ship movements
    
    public Province(String name, int[][] pixelsOnTheMap) {
        super(name, pixelsOnTheMap);
    }

    public Faction getOwner() {
        return owner;
    }

    public void setOwner(Faction owner) {
        this.owner = owner;
    }

    public Province[] getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Province[] neighbors) {
        this.neighbors = neighbors;
    }
    
    
}
