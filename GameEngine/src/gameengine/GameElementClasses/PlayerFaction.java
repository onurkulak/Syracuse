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
    private final ArrayList<Province> provinces;

    public PlayerFaction(String name) {
        super(name);
        provinces = new ArrayList();
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }
    
}
