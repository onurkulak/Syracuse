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
public class PlayerFaction extends Faction{
    private final ArrayList<CityProvince> cities;
    private final ArrayList<Garrison> garrisons;
    private CityProvince syracuse;
    private final ArrayList<County> counties;
    private final ArrayList<Army> armies;
    private final ArrayList<Navy> navies;

    public PlayerFaction(String name) {
        super(name);
        cities=new ArrayList();
        garrisons=new ArrayList();
        counties=new ArrayList();
        armies=new ArrayList();
        navies=new ArrayList();
    }

    public ArrayList<CityProvince> getCities() {
        return cities;
    }

    public ArrayList<Garrison> getGarrisons() {
        return garrisons;
    }

    public CityProvince getSyracuse() {
        return syracuse;
    }

    public ArrayList<County> getCounties() {
        return counties;
    }

    public ArrayList<Army> getArmies() {
        return armies;
    }

    public ArrayList<Navy> getNavies() {
        return navies;
    }

    public void setSyracuse(CityProvince syracuse) {
        this.syracuse = syracuse;
    }
    
    
}
