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
public class Monument extends Building{
    //cost will be decided later
    private final int MARBLE_COST=0;
    private final ArrayList<GovernmentCivic> associatedCivics;

    public Monument(int cost, int width, int height, int constructionDuration, int id, int upgradeCost1, int upgradeCost2, int maximumAvailableLevel, String name, int[] requiredBuildings, int[] requirementsRange, boolean canBuiltOnlyOnce) {
        super(cost, width, height, constructionDuration, id, upgradeCost1, upgradeCost2, maximumAvailableLevel, name, requiredBuildings, requirementsRange, canBuiltOnlyOnce);
        associatedCivics=new ArrayList();
    }

    
    public void build(int x, int y, boolean alignment, GovernmentCivic currentCivic) {
        associatedCivics.add(currentCivic);
        super.build(x, y, alignment); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int x, int y) {
        int p=findInstance(x,y);
        associatedCivics.remove(p);
        super.delete(x, y); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getHappinessForCivic(GovernmentCivic civic){
        int h=0;
        for(int i=0; i<associatedCivics.size();i++)
            if(civic==associatedCivics.get(i))
                h++;
        return h;
    }
}
