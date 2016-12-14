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
public class Army extends Force{
    private LandProvince location;
    private final ArrayList<LandUnit> units;
    private final ArrayList<Integer> unitCounts;
    private boolean besieging;

    public Army() {
        besieging=false;
        units=new ArrayList();
        unitCounts=new ArrayList();
    }

    @Override
    public int getApproximatePower() {
        int total=0;
        for(int i=0; i<unitCounts.size();i++)
            total+=unitCounts.get(i)*units.get(i).getBasePower();
        return total;
    }

    @Override
    public int getTotalManPower() {
        int total=0;
        for(int i=0; i<unitCounts.size();i++)
            total+=unitCounts.get(i);
        return total;
    }

    @Override
    public int getTotalWage() {
        int total=0;
        for(int i=0; i<units.size();i++)
            total+=units.get(i).getMonthlyWage()*unitCounts.get(i);
        if(besieging)
            return total*3/2;
        else return total;
    }

    @Override
    public void mergeGarrison(Garrison garrison) {
        for(int i=0;i<units.size();i++){
            boolean match =false;
            for(int j=0;j<garrison.getUnits().size();j++)
                if(units.get(i)==garrison.getUnits().get(j)){
                    match=true;
                    garrison.getUnitCounts().set(j, garrison.getUnitCounts().get(j)+unitCounts.get(i));
                    break;
                }
            if(!match){
                garrison.getUnits().add(units.get(i));
                garrison.getUnitCounts().add(unitCounts.get(i));
            }
        }
        units.clear();
        unitCounts.clear();
    }
    
    

    public LandProvince getLocation() {
        return location;
    }

    public ArrayList<LandUnit> getUnits() {
        return units;
    }

    public ArrayList<Integer> getUnitCounts() {
        return unitCounts;
    }

    public boolean isBesieging() {
        return besieging;
    }

    public void setLocation(LandProvince location) {
        this.location = location;
    }

    public void setBesieging(boolean besieging) {
        this.besieging = besieging;
    }
    
    
}
