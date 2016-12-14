package gameengine.GameElementClasses;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onur
 */
public class Specification {
    private final int xCoordinate, yCoordinate;
    private final boolean horizontal;
    private int level, durationLeft;
    private boolean finished; 

    public Specification(int xCoordinate, int yCoordinate, int durationLeft, boolean horizontal) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.durationLeft = durationLeft;
        this.horizontal = horizontal;
        finished=false;
        level=1;
    }
    
    public void levelUp(){
        level++;
    }
    
    //builds appropriate buildings
    public boolean construct(){
        if(!finished){
            durationLeft--;
            if(durationLeft==0){
                finished=true;
                return true;
            }
        }
        return false;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public int getLevel() {
        return level;
    }

    public int getDurationLeft() {
        return durationLeft;
    }

    public boolean isFinished() {
        return finished;
    }

    public boolean isHorizontal() {
        return horizontal;
    }
    
    
}
