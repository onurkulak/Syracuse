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
public class StopTradingMission extends Mission{
    private final AIFaction target;
    private boolean doneTrade;

    public StopTradingMission(AIFaction target, AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        super(sender, title, textBody, reward, penalty, duration);
        this.target = target;
        doneTrade=false;
    }

    @Override //if there's a shipment that destination is the target
    //makes doneTrade true 
    //if doneTrade is false when duration left is 1, returns mission accomplished
    //penalty is not instantly applied but when the mission ends as regular
    //we need to find a way to know this mission can't be given if there's already a shipment
    public boolean isAccomplished(Game game) {
        
    }
    
}
