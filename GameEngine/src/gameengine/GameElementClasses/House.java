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
import java.util.ArrayList;
public class House extends HousingBuilding{
    private final ArrayList<Integer>[] housesCoveredByShrines;
    
    //happiness gained from shrine levels each
    private final int[] SHRINE_HAPPINESS={0,0,0};

    public House(int[] housingPerLevel, int[] housingHappinessPerLevel, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce) {
        super(housingPerLevel, housingHappinessPerLevel, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
    housesCoveredByShrines=new ArrayList[2];
    housesCoveredByShrines[0]=(new ArrayList<>());
    housesCoveredByShrines[1]=(new ArrayList<>());
    }
    
    @Override
    public void delete (int x, int y){
        int p=findInstance(x,y);
        for(int i=0;i<housesCoveredByShrines[0].size();i++)
            if(housesCoveredByShrines[0].get(i)==p){
                housesCoveredByShrines[0].remove(i);
                housesCoveredByShrines[1].remove(i);
                i--;
            }
            else if(housesCoveredByShrines[0].get(i)>p)
                housesCoveredByShrines[0].set(i,housesCoveredByShrines[0].get(i)-1);
        super.delete(x, y);
    }
    
    public int getHappinessFromShrines(){
        int total=0;
        for (Integer housesCoveredByShrine : housesCoveredByShrines[1]) {
            total+=SHRINE_HAPPINESS[housesCoveredByShrine-1];
        }
        return total;     
    }
}
