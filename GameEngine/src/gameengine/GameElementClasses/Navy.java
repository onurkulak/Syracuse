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
public class Navy extends Force{
    private SeaProvince location;
    private final ArrayList<Ship> ships;
    private final ArrayList<Integer> shipCounts;

    public Navy() {
        ships=new ArrayList();
        shipCounts=new ArrayList();
    }

    @Override
    public int getApproximatePower() {
        return 0;
    }

    public int getTotalManPower() {
        int total=0;
            for(int i=0;i<ships.size();i++){
                int totalMan=ships.get(i).getAristoiRequirement();
                totalMan+=ships.get(i).getProletariatRequirement();
                totalMan+=ships.get(i).getSlaveRequirement();
                total+=totalMan*shipCounts.get(i);
            }
        return total;
    }

    @Override
    public int getTotalWage() {
        int total=0;
            for(int i=0;i<ships.size();i++)
                total+=ships.get(i).getMonthlyWage()*shipCounts.get(i);
            
        return total;
    }

    @Override
    public void mergeGarrison(Garrison garrison) {
        for(int i=0;i<ships.size();i++){
            boolean match =false;
            for(int j=0;j<garrison.getShips().size();j++)
                if(ships.get(i)==garrison.getShips().get(j)){
                    match=true;
                    garrison.getShipCounts().set(j, garrison.getShipCounts().get(j)+shipCounts.get(i));
                    break;
                }
            if(!match){
                garrison.getShips().add(ships.get(i));
                garrison.getShipCounts().add(shipCounts.get(i));
            }
        }
        ships.clear();
        shipCounts.clear();
    }

    public SeaProvince getLocation() {
        return location;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }

    public ArrayList<Integer> getShipCounts() {
        return shipCounts;
    }

    public void setLocation(SeaProvince location) {
        this.location = location;
    }
    
    
    
    
}
