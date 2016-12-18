/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

import gameengine.GameElementClasses.EconomicCivic;
import gameengine.GameElementClasses.GovernmentCivic;
import gameengine.GameElementClasses.MilitaryCivic;
import gameengine.GameElementClasses.Civic;
/**
 *
 * @author onur
 */
public class PlayerCivics {
    private GovernmentCivic govCiv;
    private MilitaryCivic milCiv;
    private EconomicCivic ecoCiv;

    public PlayerCivics(GovernmentCivic govCiv, MilitaryCivic milCiv, EconomicCivic ecoCiv) {
        this.govCiv = govCiv;
        this.milCiv = milCiv;
        this.ecoCiv = ecoCiv;
    }

    public GovernmentCivic getGovCiv() {
        return govCiv;
    }

    public void setGovCiv(GovernmentCivic govCiv) {
        this.govCiv = govCiv;
    }

    public MilitaryCivic getMilCiv() {
        return milCiv;
    }

    public void setMilCiv(MilitaryCivic milCiv) {
        this.milCiv = milCiv;
    }

    public EconomicCivic getEcoCiv() {
        return ecoCiv;
    }

    public void setEcoCiv(EconomicCivic ecoCiv) {
        this.ecoCiv = ecoCiv;
    }
    
    public Civic[] getCivics(){
        Civic[] civics = {govCiv,milCiv,ecoCiv};
        return civics;
    }
}
