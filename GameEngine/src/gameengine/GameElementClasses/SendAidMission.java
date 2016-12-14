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
public class SendAidMission extends Mission{
    private final CtyProvince gondor;

    public SendAidMission(CtyProvince gondor, AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        super(sender, title, textBody, reward, penalty, duration);
        this.gondor = gondor;
    }

    @Override //if city is no longer besieged returns true
    public boolean isAccomplished(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
