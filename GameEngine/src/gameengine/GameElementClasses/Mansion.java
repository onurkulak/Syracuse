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
public class Mansion extends HousingBuilding {
    private final ArrayList<Integer> mansionsCoveredByTemples;
    
    //happiness constant granted to a mansion by a temple
    private final int TEMPLE_HAPPINESS=0;

    public Mansion(int[] housingPerLevel, int[] housingHappinessPerLevel, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce) {
        super(housingPerLevel, housingHappinessPerLevel, cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
        mansionsCoveredByTemples=new ArrayList();
    }
    
    public int getHappinessFromTemples(){
        return mansionsCoveredByTemples.size()*TEMPLE_HAPPINESS;
    }
    
    @Override
    public void delete (int x, int y){
        int p=findInstance(x,y);
        for(int i=0;i<mansionsCoveredByTemples.size();i++){
            if(mansionsCoveredByTemples.get(i)==p){
                mansionsCoveredByTemples.remove(i);
                i--;
            }
            else if(mansionsCoveredByTemples.get(i)>p)
                mansionsCoveredByTemples.set(i,mansionsCoveredByTemples.get(i)-1);
        super.delete(x, y);
        }
    }
}
