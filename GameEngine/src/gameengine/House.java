/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine;

/**
 *
 * @author onur
 */
import java.util.ArrayList;
public class House extends HousingBuilding{
    private final ArrayList<Integer> housesCoveredByShrines;

    public House(int[] housingPerLevel, int[] housingHappinessPerLevel, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce) {
        super(housingPerLevel, housingHappinessPerLevel, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
    housesCoveredByShrines=new ArrayList();
    }
    
    
}
