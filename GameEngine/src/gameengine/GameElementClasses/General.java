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
public class General {
    private int age, popularity, strategicAbility,
            navalUnderstanding,tacticalAbility;
    private boolean tyrant, previouslyServed;
    private final double LEVEL_UP_POSSIBILITY=0.25;

    public General() {
        tyrant=false;
        previouslyServed=false;
        age=(int)(Math.random()*20)+30;
        navalUnderstanding=(int)(Math.random()*7);
        popularity=(int)(Math.random()*7);
        strategicAbility=(int)(Math.random()*7);
        tacticalAbility=(int)(Math.random()*7);
    }
    
    public void upgradeGeneral(){
        double possibility = LEVEL_UP_POSSIBILITY+popularity*0.1;
        if(age<40)
            possibility*=2;
        if(Math.random()<possibility){
            int attribute;
            if(age<40)
                attribute=(int)(Math.random()*5);
            else
                attribute=(int)(Math.random()*4);
            if(attribute==0&&navalUnderstanding!=10)
                navalUnderstanding++;
            else if(attribute==1&&strategicAbility!=10)
                strategicAbility++;
            else if(attribute==2&&tacticalAbility!=10)
                tacticalAbility++;
            else if(popularity!=10)
                popularity++;
        }
    }
    //returns a double between 1 and 0
    //will be implemented and manager class needs to care about 
    //happiness too
    public double overThrowPossibility(Army[] playersArmies){
        if(tyrant)
            return 0;
    }

    public void setTyrant(boolean tyrant) {
        this.tyrant = tyrant;
    }

    public void setPreviouslyServed(boolean previouslyServed) {
        this.previouslyServed = previouslyServed;
    }
    
    public void ageUp(int month){
        if(month%12==0)
            age++;
    }

    public int getAge() {
        return age;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getStrategicAbility() {
        return strategicAbility;
    }

    public int getNavalUnderstanding() {
        return navalUnderstanding;
    }

    public int getTacticalAbility() {
        return tacticalAbility;
    }

    public boolean isTyrant() {
        return tyrant;
    }

    public boolean isPreviouslyServed() {
        return previouslyServed;
    }
    
    
}
