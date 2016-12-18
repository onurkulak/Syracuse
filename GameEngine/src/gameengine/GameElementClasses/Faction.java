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
public class Faction {
    private final String name;
    private final ArrayList<Faction> atWarList;
    public Faction(String name) {
        this.name = name;
        atWarList= new ArrayList();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Faction> getAtWarList() {
        return atWarList;
    }
    
    
}
