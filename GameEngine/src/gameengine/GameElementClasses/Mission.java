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
public abstract class Mission {
    private final AIFaction sender;
    private final String title;
    private final String textBody;
    private final Reward reward;
    private final int penalty;
    private int duration;

    public Mission(AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        this.sender = sender;
        this.title = title;
        this.textBody = textBody;
        this.reward = reward;
        this.penalty = penalty;
        this.duration = duration;
    }
    
    
    public void applyReward(Game game){
        sender.increaseRelation(reward.getRelationBonus());
        reward.apply(game);
    }
    public abstract boolean isAccomplished(Game game);
    public void applyPenalty(){
        sender.increaseRelation(-penalty);
    }

    public String getTitle() {
        return title;
    }

    public String getTextBody() {
        return textBody;
    }

    public int getDuration() {
        return duration;
    }
    
    
}
