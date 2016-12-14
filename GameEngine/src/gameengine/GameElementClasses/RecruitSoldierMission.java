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
public class RecruitSoldierMission extends Mission{
    private final Unit unit;

    public RecruitSoldierMission(Unit unit, AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        super(sender, title, textBody, reward, penalty, duration);
        this.unit = unit;
    }

    @Override //checks the players recruitment queue
    //if there's the unit that left duration time is 1
    //returns true
    public boolean isAccomplished(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
