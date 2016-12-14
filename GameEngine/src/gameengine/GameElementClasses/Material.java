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
public abstract class Material {
    private final int baseTradeCost, requiredAmountToFillShip;
    private final boolean storable, consumable, edible, tradable;
    private final String name;
    private int amount;  private boolean allowedToConsume;
    
    public Material(int baseTradeCost, int requiredAmountToFillShip, boolean storable, boolean consumable, boolean edible, boolean tradable, String name) {
        this.baseTradeCost = baseTradeCost;
        this.requiredAmountToFillShip = requiredAmountToFillShip;
        this.storable = storable;
        this.consumable = consumable;
        this.edible = edible;
        this.tradable = tradable;
        this.name = name;
        amount=0;
        allowedToConsume=true;
    }
    
    public void increase(int amount){
        this.amount+=amount;
    }
    
    
    //returns false and does not reduce the amount if 
    //demanded amount is greater than stock
    public boolean consume(int amount){
        if(this.amount<amount)
            return false;
        this.amount-=amount;
        return true;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBaseTradeCost() {
        return baseTradeCost;
    }

    public int getRequiredAmountToFillShip() {
        return requiredAmountToFillShip;
    }
    
    public boolean isStorable() {
        return storable;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public boolean isEdible() {
        return edible;
    }

    public boolean isTradable() {
        return tradable;
    }

    public boolean isAllowedToConsume() {
        return allowedToConsume;
    }

    public void setAllowedToConsume(boolean allowedToConsume) {
        this.allowedToConsume = allowedToConsume;
    }

    public String getName() {
        return name;
    }

}
