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
public class PeloponnesianFaction extends AIFaction{
    private final Army expeditionArmy;
    private final Navy expeditionNavy;

    public PeloponnesianFaction(Army expeditionArmy, Navy expeditionNavy, Civic[] favoriteCivics, Material[] tradables, String name) {
        super(favoriteCivics, tradables, name);
        this.expeditionArmy = expeditionArmy;
        this.expeditionNavy = expeditionNavy;
    }

    public Army getExpeditionArmy() {
        return expeditionArmy;
    }

    public Navy getExpeditionNavy() {
        return expeditionNavy;
    }

    @Override
    public Mission createMission() {
        return super.createMission(); //To change body of generated methods, choose Tools | Templates.
    }
}
