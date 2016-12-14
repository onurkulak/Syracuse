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
public class DiplomaticOffer {
    private final SicilyFaction side;
    private final int moneyPlayerGains, moneyPlayerReceivesPerMonth,receivingMonths,
            moneyPlayerGivesPerMonth,givingMonths,tradeExceptionDurationFromPlayer,
            tradeExceptionDurationToPlayer,cancelTradePlayer,cancelTradeAI;
    private final boolean declareWar, declareWarPlayer, declareWarAI, sendAidToPlayer,
            sendAidToAI,adaptGovernmentalCivic, adaptEconomicCivic,adaptMilitaryCivic;

    public DiplomaticOffer(SicilyFaction side, int moneyPlayerGains, int moneyPlayerReceivesPerMonth, int receivingMonths, int moneyPlayerGivesPerMonth, int givingMonths, int tradeExceptionDurationFromPlayer, int tradeExceptionDurationToPlayer, int cancelTradePlayer, int cancelTradeAI, boolean declareWar, boolean declareWarPlayer, boolean declareWarAI, boolean sendAidToPlayer, boolean sendAidToAI, boolean adaptGovernmentalCivic, boolean adaptEconomicCivic, boolean adaptMilitaryCivic) {
        this.side = side;
        this.moneyPlayerGains = moneyPlayerGains;
        this.moneyPlayerReceivesPerMonth = moneyPlayerReceivesPerMonth;
        this.receivingMonths = receivingMonths;
        this.moneyPlayerGivesPerMonth = moneyPlayerGivesPerMonth;
        this.givingMonths = givingMonths;
        this.tradeExceptionDurationFromPlayer = tradeExceptionDurationFromPlayer;
        this.tradeExceptionDurationToPlayer = tradeExceptionDurationToPlayer;
        this.cancelTradePlayer = cancelTradePlayer;
        this.cancelTradeAI = cancelTradeAI;
        this.declareWar = declareWar;
        this.declareWarPlayer = declareWarPlayer;
        this.declareWarAI = declareWarAI;
        this.sendAidToPlayer = sendAidToPlayer;
        this.sendAidToAI = sendAidToAI;
        this.adaptGovernmentalCivic = adaptGovernmentalCivic;
        this.adaptEconomicCivic = adaptEconomicCivic;
        this.adaptMilitaryCivic = adaptMilitaryCivic;
    }
    //done necessary changes 
    public void approve(Game game){
        
    }
    
    //returns a value between 0 and 100 depends on the likeliness to agree for offer
    //regardles of the other faction
    //needs to be implemented
    int public getEstimateResult(){
        
    }
}
