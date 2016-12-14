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
public class DeadlineReward extends Reward{
    private final int months;

    public DeadlineReward(int months, int relationBonus) {
        super(relationBonus);
        this.months = months;
    }

    @Override//increases deadline
    public void apply(Game game) {

    }
    
}
