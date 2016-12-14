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
public class ThirdAgeFaction extends AIFaction{
    private final ArrayList<Faction> atWar;
    private final ArrayList<Region> regions;
    private int atThisStateSince;
    private double warSuccessModifier;
    //mapcolor will be added
    //graphic stuff thrown for now
    public ThirdAgeFaction(ArrayList<Faction> atWar, ArrayList<Region> regions, int atThisStateSince, double warSuccessModifier, Civic[] favoriteCivics, Material[] tradables, String name) {
        super(favoriteCivics, tradables, name);
        this.atWar = atWar;
        this.regions = regions;
        this.atThisStateSince = atThisStateSince;
        this.warSuccessModifier = warSuccessModifier;
    }

    @Override//different types of missions are given
    public Mission createMission() {
        return super.createMission(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override //also gives penalty from producing same trade resources, addiitonal to super
    protected int getPassiveRelation(Civic[] civics, Province[] playerProvinces) {
        return super.getPassiveRelation(civics, playerProvinces); //To change body of generated methods, choose Tools | Templates.
    }

    //will be implemented
    public void playPseudoTurn(){
        
    }
    
}
