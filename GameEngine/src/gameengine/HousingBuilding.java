package gameengine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onur
 */
import java.util.ArrayList;
public abstract class HousingBuilding extends Building {
    private final ArrayList<Integer> instancesCoveredByBaths;
    private final int[] housingPerLevel;
    private final int[] housingHappinessPerLevel;
    private final int BATH_HAPPINESS=0;

    public HousingBuilding(int[] housingPerLevel, int[] housingHappinessPerLevel, int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
        this.instancesCoveredByBaths = new ArrayList();
        this.housingPerLevel = housingPerLevel;
        this.housingHappinessPerLevel = housingHappinessPerLevel;
    }
    
    @Override
    public void delete(int x, int y){
        int p=findInstance(x,y);
        for(int i=0; i<instancesCoveredByBaths.size();i++)
            if(instancesCoveredByBaths.get(i)==p){
                instancesCoveredByBaths.remove(i);
                i--;
            }
            else if(instancesCoveredByBaths.get(i)>p)
                instancesCoveredByBaths.set(i, instancesCoveredByBaths.get(i)-1 );
        super.delete(x,y);
    }
    
    //returns the housing provided by instance specified by coordinates
    public int getInstanceHousing(int x, int y){
        int i=findInstance(x,y);
        return housingPerLevel[getInstances().get(i).getLevel()];
    }
    
    public int getTotalHousing(){
        int total=0;
        for(int i=0;i<getInstances().size();i++)
            total +=housingPerLevel[getInstances().get(i).getLevel()];
        return total;
    }
    
    
    public int getHappinessFromHousing(){
        int total=0;
        for(int i=0;i<getInstances().size();i++)
            total +=housingHappinessPerLevel[getInstances().get(i).getLevel()];
        return total;
    }
    
    public int getHappinessFromBaths(){
        return instancesCoveredByBaths.size()*BATH_HAPPINESS;
    }
}
