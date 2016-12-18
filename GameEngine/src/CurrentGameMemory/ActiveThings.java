/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;
import gameengine.GameElementClasses.DiplomaticOffer;
import gameengine.GameElementClasses.General;
import gameengine.GameElementClasses.LandUnit;
import gameengine.GameElementClasses.MercenaryArmy;
import gameengine.GameElementClasses.Mission;
import gameengine.GameElementClasses.Ship;
import gameengine.GameElementClasses.TradeOffer;
import gameengine.GameElementClasses.TradeShipment;
import java.util.ArrayList;


/**
 *
 * @author onur
 */
public class ActiveThings {
    private final ArrayList<Mission> missions;
    private final ArrayList<TradeOffer> tradeOffers;
    private final ArrayList<TradeShipment> shipments;
    private final ArrayList<General> availableGenerals;
    private final ArrayList<MercenaryArmy> availableMercenaries;
    private final ArrayList<LandUnit> landQueue;
    private final ArrayList<Integer> landQueueTimes;
    private final ArrayList<Ship> shipQueue;
    private final ArrayList<Integer> shipQueueTimes;
    private DiplomaticOffer diplomaticOffer;

    public ActiveThings(){
        this.missions = new ArrayList();
        this.tradeOffers = new ArrayList();
        this.shipments = new ArrayList();
        this.availableGenerals = new ArrayList();
        this.availableMercenaries = new ArrayList();
        this.landQueue = new ArrayList();
        this.landQueueTimes = new ArrayList();
        this.shipQueue = new ArrayList();
        this.shipQueueTimes = new ArrayList();
        diplomaticOffer=null;
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public ArrayList<TradeOffer> getTradeOffers() {
        return tradeOffers;
    }

    public ArrayList<TradeShipment> getShipments() {
        return shipments;
    }

    public ArrayList<General> getAvailableGenerals() {
        return availableGenerals;
    }

    public ArrayList<MercenaryArmy> getAvailableMercenaries() {
        return availableMercenaries;
    }

    public ArrayList<LandUnit> getLandQueue() {
        return landQueue;
    }

    public ArrayList<Integer> getLandQueueTimes() {
        return landQueueTimes;
    }

    public ArrayList<Ship> getShipQueue() {
        return shipQueue;
    }

    public ArrayList<Integer> getShipQueueTimes() {
        return shipQueueTimes;
    }

    public DiplomaticOffer getDiplomaticOffer() {
        return diplomaticOffer;
    }

    public void setDiplomaticOffer(DiplomaticOffer diplomaticOffer) {
        this.diplomaticOffer = diplomaticOffer;
    }
    
    
}
