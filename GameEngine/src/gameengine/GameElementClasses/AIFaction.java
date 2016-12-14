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
public class AIFaction extends Faction{
    private final Civic[] favoriteCivics;
    private int currentAttitude;
    private final Material[] tradables;
    //this constants will be decided later
    private final int SAME_CIVIC_BONUS=0;
    private final int DIFFERENT_CIVIC_PENALTY=0;
    private AIFaction[] otherFactions;
    //50 is starting attitude
    public AIFaction(Civic[] favoriteCivics,Material[] tradables, String name) {
        super(name);
        this.favoriteCivics = favoriteCivics;
        this.tradables=tradables;
        currentAttitude=50;
    }
    //province is not cared in this one, but needs to be overridden in subclasses
    //checks civ similarities
    protected int getPassiveRelation(Civic[] civics, Province[] playerProvinces){
        int relation=50;
        for(int i=0;i<favoriteCivics.length;i++){
            boolean foundSimilarity = false;
            for(int j=0; j<civics.length;j++)
                if(favoriteCivics[i]==civics[j])
                    foundSimilarity=true;
            if(foundSimilarity)
                relation+=SAME_CIVIC_BONUS;
            else
                relation-=DIFFERENT_CIVIC_PENALTY;
        }
        
        return relation;
    }
    
    public void updateRelation(Civic[] civics, Province[] playerProvinces){
        int passive=getPassiveRelation(civics,playerProvinces);
        currentAttitude=(currentAttitude*3+passive)/4;
    }
    
    //needs to be implemented, returns a mission from this faction to the player
    public Mission createMission(){
        
    }
    
    //needs to be implemented, returns a trade offer
    public TradeOffer createTradeOffer{
        
    }

    public int getCurrentAttitude() {
        return currentAttitude;
    }
    
    public void increaseRelation(int i){
        currentAttitude+=i;
        checkRelationConstraint();
    }
    
    protected void checkRelationConstraint(){
    if(currentAttitude>100)
        currentAttitude=100;
    else if(currentAttitude<0)
        currentAttitude=0;
    }

    public void setOtherFactions(AIFaction[] otherFactions) {
        this.otherFactions = otherFactions;
    }
    
}
