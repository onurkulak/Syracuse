/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;
import gameengine.GameElementClasses.LandUnit;
import gameengine.GameElementClasses.Ship;
import java.util.ArrayList;
/**
 *
 * @author onur
 */
public class AllUnits {
    private final ArrayList<LandUnit> availableLandUnits;
    private final ArrayList<Ship> availableNavalUnits;

    public AllUnits() {
        this.availableLandUnits = new ArrayList();
        this.availableNavalUnits = new ArrayList();
    }
    
    
}
