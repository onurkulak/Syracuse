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
import java.util.ArrayList;
public class Garrison extends Force{
    private final ArrayList<Ship> ships;
    private final ArrayList<Integer> shipCounts;
    private final ArrayList<LandUnit> units;
    private final ArrayList<Integer> unitCounts;
    private final CityProvince location;

    public Garrison(CityProvince location) {
        this.location=location;
        ships=new ArrayList();
        shipCounts=new ArrayList();
        units=new ArrayList();
        unitCounts=new ArrayList();
    }

    @Override
    public int getTotalManPower() {
            int total=0;
            for(int i=0;i<ships.size();i++){
                int totalMan=ships.get(i).getAristoiRequirement();
                totalMan+=ships.get(i).getProletariatRequirement();
                totalMan+=ships.get(i).getSlaveRequirement();
                total+=totalMan*shipCounts.get(i);
            }
            
            for(int i=0; i<unitCounts.size();i++)
                total+=unitCounts.get(i);
            return total;
    }

    @Override //will be implemented
    //garrisons have less wages than normal armies-navies
    public int getTotalWage() {
        int total=0;
        for(int i=0;i<ships.size();i++)
            total+=ships.get(i).getMonthlyWage()*shipCounts.get(i);
        total=total/2;
        for(int i=0; i<units.size();i++)
            total+=units.get(i).getMonthlyWage()*unitCounts.get(i);
        return total/2;
    }

    @Override
    //will be implemented
    public int getApproximatePower() {
        int total=0;
        for(int i=0; i<unitCounts.size();i++)
            total+=unitCounts.get(i)*units.get(i).getBasePower();
        return total;
    }

    
    @Override//not possible anyway
    public void mergeGarrison(Garrison garrison) {
    }
    
    

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public ArrayList<Integer> getShipCounts() {
        return shipCounts;
    }

    public ArrayList<LandUnit> getUnits() {
        return units;
    }

    public ArrayList<Integer> getUnitCounts() {
        return unitCounts;
    }

    public CityProvince getLocation() {
        return location;
    }
    
    
}
