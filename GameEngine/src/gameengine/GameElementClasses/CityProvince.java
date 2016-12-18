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
public class CityProvince extends LandProvince{
    private Garrison garrison;
    private int inSiegeForMonth;
    private boolean isSiegeBattleOccurred;
    private SeaProvince portProvince;

    public CityProvince(String name, int[][] pixelsOnTheMap) {
        super(name, pixelsOnTheMap);
        inSiegeForMonth=0;
        isSiegeBattleOccurred=false;
    }
    
    public boolean isBesieged(){
        Faction faction=getArmy().getFaction();
        for(int i=0;i<faction.getAtWarList().size();i++)
            if(faction.getAtWarList().get(i)==getOwner())
                return true;
        return false;
    }
    
    public boolean isBlockaded(){
        Faction faction=portProvince.getNavy().getFaction();
        for(int i=0;i<faction.getAtWarList().size();i++)
            if(faction.getAtWarList().get(i)==getOwner())
                return true;
        return false;
    }

    public Garrison getGarrison() {
        return garrison;
    }

    public void setGarrison(Garrison garrison) {
        this.garrison = garrison;
    }

    public SeaProvince getPortProvince() {
        return portProvince;
    }

    public void setPortProvince(SeaProvince portProvince) {
        this.portProvince = portProvince;
    }
    
    
    
}
