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
public class DeclareWarMission extends Mission{
    private final PeloponnesianFaction target;

    public DeclareWarMission(PeloponnesianFaction target, AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        super(sender, title, textBody, reward, penalty, duration);
        this.target = target;
    }

    @Override // we don't have a tool to declare war to peloponnesians, I don't know how this will be handled
    //maybe we should remove this mission type
    public boolean isAccomplished(Game game) {
        
    }
    
    
}
