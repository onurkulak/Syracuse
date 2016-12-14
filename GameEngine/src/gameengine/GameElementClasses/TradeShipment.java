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
//reduction of materials handled when constructing a shipment, except the money
//relations can be handled in there too
//arriving ships handled again, except the money
public class TradeShipment {
    private final Material[] exportedMaterial, importedMaterial;
    private final int[] exportAmount,importAmount;
    private final int totalMoneyChange;
    private int monthsLeft;
    private final boolean longDistanceShipment;
    private final AIFaction destination;

    
    //initial resource changes handled there
    public TradeShipment(Material[] exportedMaterial, Material[] importedMaterial, int[] exportAmount, int[] importAmount, int totalMoneyChange, boolean longDistanceShipment,AIFaction target) {
        this.exportedMaterial = exportedMaterial;
        this.importedMaterial = importedMaterial;
        this.exportAmount = exportAmount;
        this.importAmount = importAmount;
        this.totalMoneyChange = totalMoneyChange;
        this.longDistanceShipment = longDistanceShipment;
        if(longDistanceShipment)
            monthsLeft=4;
        else 
            monthsLeft=2;
        this.destination=target;
        depart();
    }

    public TradeShipment(TradeOffer[] offers) {
        int importSize=0, exportSize=0;
        for(int i=0; i<offers.length;i++)
            if(offers[i].isFactionExporting())
                importSize++;
            else exportSize++;
        Material[] exportedMaterial=new Material[exportSize];
        Material[] importedMaterial=new Material[importSize];
        int[] exportAmount=new int[exportSize];
        int[] importAmount=new int[importSize];
        int j=0,k=0;
        int totalMoneyChange=0;
        for(int i=0; i<offers.length;i++){
            if(offers[i].isFactionExporting()){
                totalMoneyChange-=offers[i].getCost();
                importedMaterial[j]=offers[i].getResource();
                importAmount[j]=offers[i].getAmount();
                j++;
            }
            else{
                totalMoneyChange+=offers[i].getCost();
                importedMaterial[k]=offers[i].getResource();
                importAmount[k]=offers[i].getAmount(); 
                k++;
            }
        }
        boolean longDistanceShipment=(offers[0].getSender().getName().equals("Seleucid Empire")||
        offers[0].getSender().getName().equals("Ptolemaic Kingdom")||
        offers[0].getSender().getName().equals("Antigonid Dynasty")        );
        
        this.exportedMaterial = exportedMaterial;
        this.importedMaterial = importedMaterial;
        this.exportAmount = exportAmount;
        this.importAmount = importAmount;
        this.totalMoneyChange = totalMoneyChange;
        this.longDistanceShipment = longDistanceShipment;
        if(longDistanceShipment)
            monthsLeft=4;
        else 
            monthsLeft=2;
        this.destination=offers[0].getSender();
        depart();
    }
    
    private void depart(){
        for(int i=0;i<exportedMaterial.length;i++){
            exportedMaterial[i].consume(exportAmount[i]);
        }
    }
       
    public void moveShipment(boolean portBlockaded){
        if(portBlockaded){
            if(longDistanceShipment){
                if(monthsLeft>2)
                    monthsLeft--;
                else if(monthsLeft<2)
                    monthsLeft++;
            }
            else if(monthsLeft==2)
                monthsLeft--;
        }
        else
            monthsLeft--;
        if(monthsLeft==0)
            for(int i=0;i<importedMaterial.length;i++){
                importedMaterial[i].increase(importAmount[i]);
            }
    }
    
    public boolean isReturned(){
        return monthsLeft==0;
    }
}
