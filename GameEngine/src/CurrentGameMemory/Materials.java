/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

import gameengine.GameElementClasses.ManufacturedMaterial;
import gameengine.GameElementClasses.Material;
import gameengine.GameElementClasses.RawMaterial;

/**
 *
 * @author onur
 */
public class Materials {

    private final RawMaterial sheep, wheat, barley, olive, grape,
            flax, marble, dye, gold, silver, slave,
            ivory, ironOre, copper, timber, wool, cheese, salt;

    private final ManufacturedMaterial fish, pot, glass, flour, bread, meat, saltedMeat, saltedFish, pig,
            oliveOil, fabric, dyedFabric, cloth, dyedCloth, grapeJuice, lumber,
            accessory, armour, processedMarble, iron, spearArrow, sword, horse;
    
    private final Material[] allMaterials;

    public Materials() {
        sheep = new RawMaterial(0, 0, false, false, false, "Sheep", false, false, 0, 1);
        barley = new RawMaterial(1, 30000, true, true, true, "Barley", false, true, 1, 25);
        wheat = new RawMaterial(3, 30000, true, false, true, "Wheat", false, true, 2, 12);
        olive = new RawMaterial(0, 0, false, false, false, "Olive", false, true, 3, 8);
        grape = new RawMaterial(0, 0, false, false, false, "Grape", false, true, 2, 10);
        flax = new RawMaterial(0, 0, true, false, false, "Flax", true, false, 0, 3);
        marble = new RawMaterial(0, 0, true, false, false, "Marble", true, false, 0, 1);
        dye = new RawMaterial(35, 7500, true, false, true, "Dye", true, false, 0, 3);
        gold = new RawMaterial(40, 15000, true, false, true, "Gold", true, false, 0, 0);
        silver = new RawMaterial(10, 15000, true, false, true, "Slver", true, false, 0, 5);
        slave = new RawMaterial(150, 1000, true, false, true, "Slave", false, false, 0, 0);
        ivory = new RawMaterial(35, 15000, true, false, true, "Ivory", true, false, 0, 0);
        ironOre = new RawMaterial(0, 0, true, false, false, "Iron Ore", true, false, 0, 6);
        copper = new RawMaterial(2, 15000, true, false, true, "Copper", true, false, 0, 7);
        timber = new RawMaterial(0, 0, true, false, false, "Timber", false, false, 0, 1);
        wool = new RawMaterial(0, 0, true, false, false, "Wool", false, false, 0, 0);
        cheese = new RawMaterial(6, 3000, true, true, true, "Cheese", false, false, 0, 0);
        salt = new RawMaterial(2, 10000, true, false, true, "Salt", true, false, 0, 8);

        Material[] fishCost = new Material[]{};
        Material[] potCost = new Material[]{};
        Material[] glassCost = new Material[]{};
        Material[] flourCost = new Material[]{wheat};

        double[] fishCostAmount = new double[]{};
        double[] potCostAmount = new double[]{};
        double[] glassCostAmount = new double[]{};
        double[] flourCostAmount = new double[]{1};

        fish = new ManufacturedMaterial(
            fishCost, fishCostAmount, 0, 0, false, true, false, "fish"
        );
        
        flour=new ManufacturedMaterial(
        flourCost,flourCostAmount,0,0,true,false,false,"Flour");
        
        Material[] breadCost = new Material[]{flour};
        double[] breadCostAmount = new double[]{1};
        
        bread = new ManufacturedMaterial(
        breadCost,breadCostAmount,0,0,false,true,false,"Bread");
        
        
        double[] pigCostAmount = new double[]{5};
        Material[] pigCost = new Material[]{barley};
        
        pig=new ManufacturedMaterial(
        pigCost,pigCostAmount,0,0,true,false,false,"Pig");
        
        Material[] meatCost = new Material[]{pig};
        double[] meatCostAmount = new double[]{1};
        
        meat = new ManufacturedMaterial(
        meatCost,meatCostAmount,0,0,false,true,false,"Meat");
        
        Material[] saltedMeatCost = new Material[]{meat, salt};
        Material[] saltedFishCost = new Material[]{fish, salt};
        Material[] oliveOilCost = new Material[]{olive};
        
        Material[] fabricCost = new Material[]{wool, flax};
        double[] fabricCostAmount = new double[]{1,1};
        
        fabric = new ManufacturedMaterial(
        fabricCost,fabricCostAmount,0,0,true,false,false,"Fabric");
        
        Material[] dyedFabricCost = new Material[]{fabric, dye};
        double[] dyedFabricCostAmount = new double[]{1,1};
        
        dyedFabric = new ManufacturedMaterial(
        dyedFabricCost,dyedFabricCostAmount,0,0,true,false,false,"Dyed Fabric");
        
        Material[] ironCost = new Material[]{ironOre};
        double[] ironCostAmount = new double[]{1};
        
        iron = new ManufacturedMaterial(
        ironCost,ironCostAmount,4,10000,true,false,true,"Iron");
        
        Material[] clothCost = new Material[]{fabric};
        Material[] dyedClothCost = new Material[]{dyedFabric};
        Material[] grapeJuiceCost = new Material[]{grape};
        Material[] lumberCost = new Material[]{timber};
        Material[] accessoryCost = new Material[]{gold, silver, ivory};
        Material[] armourCost = new Material[]{copper};
        Material[] processedMarbleCost = new Material[]{marble};
        Material[] spearArrowCost = new Material[]{iron};
        Material[] swordCost = new Material[]{iron};
        Material[] horseCost = new Material[]{barley};
        double[] saltedMeatCostAmount = new double[]{1,1};
        double[] saltedFishCostAmount = new double[]{1,1};
        double[] oliveOilCostAmount = new double[]{1};
        double[] clothCostAmount = new double[]{1};
        double[] dyedClothCostAmount = new double[]{1};
        double[] grapeJuiceCostAmount = new double[]{1};
        double[] lumberCostAmount = new double[]{1};
        double[] accessoryCostAmount = new double[]{1,1,1};
        double[] armourCostAmount = new double[]{1};
        double[] processedMarbleCostAmount = new double[]{1};
        double[] spearArrowCostAmount = new double[]{};
        double[] swordCostAmount = new double[]{2};
        double[] horseCostAmount = new double[]{1};

        
        pot=new ManufacturedMaterial(
        potCost,potCostAmount,7,2000,true,false,true,"Pot");
        
        glass = new ManufacturedMaterial(
        glassCost,glassCostAmount,30,2000,true,false,true,"Glass");
        
        saltedMeat = new ManufacturedMaterial(
        saltedMeatCost,saltedMeatCostAmount,10,2000,true,true,true,"Salted Meat");
        
        saltedFish= new ManufacturedMaterial(
        saltedFishCost,saltedFishCostAmount,8,2000,true,true,true,"Salted Fish");
        
        oliveOil= new ManufacturedMaterial(
        oliveOilCost,oliveOilCostAmount,20,10000,true,false,true,"Olive Oil");
        
        cloth = new ManufacturedMaterial(
        clothCost,clothCostAmount,16,6000,true,false,true,"Cloth");
        
        dyedCloth = new ManufacturedMaterial(
        dyedClothCost,dyedClothCostAmount,60,4000,true,false,true,"Dyed Cloth");
        
        grapeJuice = new ManufacturedMaterial(
        grapeJuiceCost,grapeJuiceCostAmount,14,9000,true,false,true,"Grape Juice"); 
    
        lumber = new ManufacturedMaterial(
        lumberCost,lumberCostAmount, 15, 4000,true,false,true,"Lumber");
        
        accessory = new ManufacturedMaterial(
        accessoryCost,accessoryCostAmount,120,1000,true,false,true,"Accessory");
        
        armour = new ManufacturedMaterial(
        armourCost,armourCostAmount,0,0,true,false,true,"Armour");
        
        processedMarble = new ManufacturedMaterial(
        processedMarbleCost,processedMarbleCostAmount,15,4000,true,false,true,"Processed Marble");
        
        spearArrow=new ManufacturedMaterial(
        spearArrowCost,spearArrowCostAmount,0,0,true,false,false,"Spear&Arrow");
        
        sword = new ManufacturedMaterial(
        swordCost,swordCostAmount,0,0,true,false,false,"Sword");
        
        horse = new ManufacturedMaterial(
        horseCost,horseCostAmount,0,0,true,false,false,"Horse");
        
        allMaterials = new Material[]{sheep, wheat, barley, olive, grape,
            flax, marble, dye, gold, silver, slave,
            ivory, ironOre, copper, timber, wool, cheese, salt,
            fish, pot, glass, flour, bread, meat, saltedMeat, saltedFish, pig,
            oliveOil, fabric, dyedFabric, cloth, dyedCloth, grapeJuice, lumber,
            accessory, armour, processedMarble, iron, spearArrow, sword, horse};
    }

    public RawMaterial getSheep() {
        return sheep;
    }

    public RawMaterial getWheat() {
        return wheat;
    }

    public RawMaterial getBarley() {
        return barley;
    }

    public RawMaterial getOlive() {
        return olive;
    }

    public RawMaterial getGrape() {
        return grape;
    }

    public RawMaterial getFlax() {
        return flax;
    }

    public RawMaterial getMarble() {
        return marble;
    }

    public RawMaterial getDye() {
        return dye;
    }

    public RawMaterial getGold() {
        return gold;
    }

    public RawMaterial getSilver() {
        return silver;
    }

    public RawMaterial getSlave() {
        return slave;
    }

    public RawMaterial getIvory() {
        return ivory;
    }

    public RawMaterial getIronOre() {
        return ironOre;
    }

    public RawMaterial getCopper() {
        return copper;
    }

    public RawMaterial getTimber() {
        return timber;
    }

    public RawMaterial getWool() {
        return wool;
    }

    public RawMaterial getCheese() {
        return cheese;
    }

    public RawMaterial getSalt() {
        return salt;
    }

    public ManufacturedMaterial getFish() {
        return fish;
    }

    public ManufacturedMaterial getPot() {
        return pot;
    }

    public ManufacturedMaterial getGlass() {
        return glass;
    }

    public ManufacturedMaterial getFlour() {
        return flour;
    }

    public ManufacturedMaterial getBread() {
        return bread;
    }

    public ManufacturedMaterial getMeat() {
        return meat;
    }

    public ManufacturedMaterial getSaltedMeat() {
        return saltedMeat;
    }

    public ManufacturedMaterial getSaltedFish() {
        return saltedFish;
    }

    public ManufacturedMaterial getPig() {
        return pig;
    }

    public ManufacturedMaterial getOliveOil() {
        return oliveOil;
    }

    public ManufacturedMaterial getFabric() {
        return fabric;
    }

    public ManufacturedMaterial getDyedFabric() {
        return dyedFabric;
    }

    public ManufacturedMaterial getCloth() {
        return cloth;
    }

    public ManufacturedMaterial getDyedCloth() {
        return dyedCloth;
    }

    public ManufacturedMaterial getGrapeJuice() {
        return grapeJuice;
    }

    public ManufacturedMaterial getLumber() {
        return lumber;
    }

    public ManufacturedMaterial getAccessory() {
        return accessory;
    }

    public ManufacturedMaterial getArmour() {
        return armour;
    }

    public ManufacturedMaterial getProcessedMarble() {
        return processedMarble;
    }

    public ManufacturedMaterial getIron() {
        return iron;
    }

    public ManufacturedMaterial getSpearArrow() {
        return spearArrow;
    }

    public ManufacturedMaterial getSword() {
        return sword;
    }

    public ManufacturedMaterial getHorse() {
        return horse;
    }

    public Material[] getAllMaterials() {
        return allMaterials;
    }
    
    
}
