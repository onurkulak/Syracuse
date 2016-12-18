/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

/**
 *
 * @author onur
 */
public class CityStatus {
    private int anarchyLeft;
    private boolean festivalHappening;
    private int lastFestivalSince;
    private int firstAgeDeadlineLeft;
    private int expeditionDeadlineLeft;
    private int happinessFromWar;
    private int defeatedShipCount;
    
    public CityStatus() {
        anarchyLeft=0;
        festivalHappening=false;
        lastFestivalSince=12;
    }
    
    public boolean isThereAnarchy(){
        return 0!=anarchyLeft;
    }
    
    public void passTurn(){
        lastFestivalSince++;
        if(anarchyLeft>0)
            anarchyLeft--;
        festivalHappening=false;
        decreaseTheWarHappiness();
    }
    
    public void newFestival(){
        lastFestivalSince=0;
        festivalHappening=true;
    }
    
    public boolean isFestivalPossible(){
        return lastFestivalSince>11;
    }

    public int getAnarchyLeft() {
        return anarchyLeft;
    }

    public boolean isFestivalHappening() {
        return festivalHappening;
    }

    public void setAnarchyLeft(int anarchyLeft) {
        this.anarchyLeft = anarchyLeft;
    }

    public int getFirstAgeDeadlineLeft() {
        return firstAgeDeadlineLeft;
    }

    public void setFirstAgeDeadlineLeft(int firstAgeDeadlineLeft) {
        this.firstAgeDeadlineLeft = firstAgeDeadlineLeft;
    }

    public int getExpeditionDeadlineLeft() {
        return expeditionDeadlineLeft;
    }

    public void setExpeditionDeadlineLeft(int expeditionDeadlineLeft) {
        this.expeditionDeadlineLeft = expeditionDeadlineLeft;
    }

    public int getLastFestivalSince() {
        return lastFestivalSince;
    }

    public int getHappinessFromWar() {
        return happinessFromWar;
    }

    public int getDefeatedShipCount() {
        return defeatedShipCount;
    }
    
    public void decreaseTheWarHappiness(){
        happinessFromWar=happinessFromWar*2/3;
    }
    
    public void addWarHappiness(int amount){
        happinessFromWar+=amount;
    }
    
    public void addDefeatedShipCount(int amount){
        defeatedShipCount+=amount;
    }
    
    public boolean isColossusUnblocked(){
        return defeatedShipCount>=200;
    }
}
