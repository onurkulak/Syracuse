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
public class ResourceDemandMission extends Mission{
    //faciton must push this trade offer after giving the mission
    //we need a way to handle this, it's not possible currently
    private final TradeOffer demand;
    private int lastDuration;

    public ResourceDemandMission(TradeOffer demand, AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        super(sender, title, textBody, reward, penalty, duration);
        this.demand = demand;
        lastDuration=
    }

    @Override //returns true if trade offer's duration is same as before
    //meaning trade offer is no longer listed and its duration is not being reduced
    
    public boolean isAccomplished(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
