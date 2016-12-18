/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameengine.GameManagers;

/**
 *
 * @author onur
 */
public class AgeManager extends Manager{
    public void checkAge(){
        if(game.getAge()==1&&checkFirstAge())
            unlockSecondAge();
        else if(game.getAge()==2&&checkSecondAge())
            unlockThirdAge();
    }
    
    private boolean checkFirstAge(){
        if(game.getBuildings().getTemple().doesExist())
            return true;
        else return false;
    }
    
    private boolean checkSecondAge(){
        return game.getCityStatus().getExpeditionDeadlineLeft()<1&&!game.getFaction().getSyracuse().isBesieged();
    }
    
    //unlocker methods needs to be written
    private void unlockSecondAge(){
        
    }
    
    private void unlockThirdAge(){
        
    }
}
