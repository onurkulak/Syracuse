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
public abstract class Civic {
    private final String name;

    public Civic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
