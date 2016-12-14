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
public class Reward {
    private final int relationBonus;

    public Reward(int relationBonus) {
        this.relationBonus = relationBonus;
    }
    
    public void apply(Game game){
        
    }

    public int getRelationBonus() {
        return relationBonus;
    }
    
}
