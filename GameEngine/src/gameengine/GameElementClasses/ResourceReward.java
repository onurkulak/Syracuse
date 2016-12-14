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
public class ResourceReward extends Reward{
    private final Material type;
    private final int amount;

    public ResourceReward(Material type, int amount, int relationBonus) {
        super(relationBonus);
        this.type = type;
        this.amount = amount;
    }

    @Override
    public void apply(Game game) {
        type.increase(amount);
    }
    
}
