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
public class Parthenon extends Wonder{
    //decided later
    private final int MARBLE_COST=0;

    public Parthenon(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
    }

    public int getMARBLE_COST() {
        return MARBLE_COST;
    }
    
    
}
