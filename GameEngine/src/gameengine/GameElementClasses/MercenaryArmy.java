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
public class MercenaryArmy extends Army{
    public int getInitialCost(){
        return getTotalWage()*5;
    }

    @Override
    public int getTotalWage() {
        return 3*super.getTotalWage();
    }
}
