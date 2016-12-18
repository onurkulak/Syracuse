/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

import gameengine.GameElementClasses.Aristoi;
import gameengine.GameElementClasses.Proletariat;
import gameengine.GameElementClasses.Slave;

/**
 *
 * @author onur
 */
public class PeopleOfSyracuse {
    private final Proletariat proletariat;
    private final Aristoi aristoi;
    private final Slave slaves;

    public PeopleOfSyracuse(Proletariat proletariat, Aristoi aristoi, Slave slaves) {
        this.proletariat = proletariat;
        this.aristoi = aristoi;
        this.slaves = slaves;
    }

    public Proletariat getProletariat() {
        return proletariat;
    }

    public Aristoi getAristoi() {
        return aristoi;
    }

    public Slave getSlaves() {
        return slaves;
    }
    
    
}
