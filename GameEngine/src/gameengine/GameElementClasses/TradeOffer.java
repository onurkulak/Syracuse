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
public class TradeOffer {
    private final AIFaction sender;
    private final Material resource;
    private final int amount;
    private final boolean factionExporting;
    private final int cost;
    private final boolean fullShipment;
    private int duration;

    
    //faction exporting means player is buying theresource
    //cost is always positive
    public TradeOffer(AIFaction sender, Material resource, int amount, boolean factionExporting, int cost, boolean fullShipment, int duration) {
        this.sender = sender;
        this.resource = resource;
        this.amount = amount;
        this.factionExporting = factionExporting;
        this.cost = cost;
        this.fullShipment = fullShipment;
        this.duration = duration;
    }
    public boolean isOfferPassed(){
        return duration==0;
    }
    
    public void timePasses(){
        duration--;
    }

    public AIFaction getSender() {
        return sender;
    }

    public Material getResource() {
        return resource;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isFactionExporting() {
        return factionExporting;
    }

    public int getCost() {
        return cost;
    }

    public boolean isFullShipment() {
        return fullShipment;
    }

    public int getDuration() {
        return duration;
    }
    
    
}
