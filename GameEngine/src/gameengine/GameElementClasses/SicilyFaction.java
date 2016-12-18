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
public class SicilyFaction extends ThirdAgeFaction{
    private final ArrayList<Province> provinces;
    private final ArrayList<Army> armies;
    private final ArrayList<Navy> navies;
    private int lastExpeditionSince;
    private final Army averageArmyComposition;
    private final Navy averageNavyComposition;
    private final Region capital;
    private boolean rebel;
    private int tradeExceptionToThePlayerLeft,
            tradeExceptionFromThePlayerLeft,
            tradePromiseLeft;

    public SicilyFaction(ArrayList<Province> provinces, ArrayList<Army> armies, ArrayList<Navy> navies, int lastExpeditionSince, Army averageArmyComposition, Navy averageNavyComposition, Region capital, boolean atWarWithPlayer, boolean revel, ArrayList<Faction> atWar, ArrayList<Region> regions, int atThisStateSince, double warSuccessModifier, Civic[] favoriteCivics, Material[] tradables, String name) {
        super(atWar, regions, atThisStateSince, warSuccessModifier, favoriteCivics, tradables, name);
        this.provinces = provinces;
        this.armies = armies;
        this.navies = navies;
        this.lastExpeditionSince = lastExpeditionSince;
        this.averageArmyComposition = averageArmyComposition;
        this.averageNavyComposition = averageNavyComposition;
        this.capital = capital;
        this.rebel = revel;
        tradeExceptionToThePlayerLeft=0;
        tradeExceptionFromThePlayerLeft=0;
        tradePromiseLeft=0;
    }
    
    private Army createArmy(){
        
    }
    
    private Navy createNavy(){
        
    }

    @Override
    public void playPseudoTurn() {
        super.playPseudoTurn(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mission createMission() {
        return super.createMission(); //To change body of generated methods, choose Tools | Templates.
    }
    //needs to be implemented
    public void playRealTurn(){
        
    }
    //creates a diplomatic offer to player, might get additional parameters
    private DiplomaticOffer createDiplomaticOffer(){
        
    }
    //will grade an offer
    public boolean gradeDplomaticOffer(DiplomaticOffer offer){
        
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }

    public ArrayList<Army> getArmies() {
        return armies;
    }

    public ArrayList<Navy> getNavies() {
        return navies;
    }

    public boolean isAtWarWithPlayer() {
        return atWarWithPlayer;
    }
    
    
}


