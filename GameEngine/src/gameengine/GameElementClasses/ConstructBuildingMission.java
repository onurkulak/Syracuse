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
public class ConstructBuildingMission extends Mission{
    private final Building building;

    public ConstructBuildingMission(Building building, AIFaction sender, String title, String textBody, Reward reward, int penalty, int duration) {
        super(sender, title, textBody, reward, penalty, duration);
        this.building = building;
    }

    @Override//already implemented!!
    public boolean isAccomplished(Game game) {
        for(int i=0;i<building.getInstances().size();i++)
            if(building.getInstances().get(i).getDurationLeft()==1)
                return true;
        return false;
    }
    
}
