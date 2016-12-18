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
public class County extends LandProvince{
    private final RawMaterial producedMaterial;
    private int workerPeople;
    private final int[] workerNumbersLastMonths;
    private int pointer=0;
    public County(RawMaterial producedMaterial, String name, int[][] pixelsOnTheMap) {
        super(name, pixelsOnTheMap);
        this.producedMaterial = producedMaterial;
        workerNumbersLastMonths=new int[11];
    }
    
    public void passTurn(){
        if(producedMaterial.isSeasonalMaterial()){
            workerNumbersLastMonths[pointer]=workerPeople;
            pointer=(pointer+1)%workerNumbersLastMonths.length;
        }
    }
    
    //turn is assumed 0+12n for december
    public int getResource(int turn,boolean isThereObservatory){
        
        if(producedMaterial.isSeasonalMaterial()){
            boolean seasonMatches=producedMaterial.getSeason()==((turn%12)/4);
            if(seasonMatches){
                double workerTotal=workerPeople;
                for(int i=0;i<workerNumbersLastMonths.length;i++)
                    workerTotal+=workerNumbersLastMonths[i];
                return (int)(workerTotal*producedMaterial.getProductionConstant()/12);
            }
            else
                return 0;
        }
        else{
            return (int)(producedMaterial.getProductionConstant()*workerPeople);
        }
    }
}
