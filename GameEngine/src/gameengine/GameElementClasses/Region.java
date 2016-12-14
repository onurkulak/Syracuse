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
public class Region extends Place{
    private ThirdAgeFaction owner;
    private Material tradeResource;
    private Region[] neighbors;

    public Region(Material tradeResource, String name, int[][] pixelsOnTheMap) {
        super(name, pixelsOnTheMap);
        this.tradeResource = tradeResource;
    }

    public ThirdAgeFaction getOwner() {
        return owner;
    }

    public void setOwner(ThirdAgeFaction owner) {
        this.owner = owner;
    }

    public Material getTradeResource() {
        return tradeResource;
    }

    public void setTradeResource(Material tradeResource) {
        this.tradeResource = tradeResource;
    }

    public Region[] getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(Region[] neighbors) {
        this.neighbors = neighbors;
    }
    
    
}
