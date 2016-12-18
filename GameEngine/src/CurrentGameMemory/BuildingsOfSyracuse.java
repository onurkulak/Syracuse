/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

import gameengine.GameElementClasses.*;

/**
 *
 * @author onur
 */
public class BuildingsOfSyracuse {

    private final Academy academy;
    private final Agora agora;
    private final ArcheryRange archeryRange;
    private final Armory armory;
    private final Bakery bakery;
    private final Barrack barrack;
    private final Butchery butchery;
    private final CheeseMerchant cheeseMerchant;
    private final ClawOfArchimedes clawOfArchimedes;
    private final Colossus colossus;
    private final Courthouse courthouse;
    private final Dock dock;
    private final FabricMerchant fabricMerchant;
    private final Fishery fishery;
    private final Forge forge;
    private final GeneralHeadquarter generalHeadquarter;
    private final GlassMaker glassMaker;
    private final Granary granary;
    private final GrapeJuiceDistillery grapeJuiceDistillery;
    private final GrapeJuiceMerchant grapeJuiceMerchant;
    private final GreatLighthouse greatLighthouse;
    private final House house;
    private final Jeweler jeweler;
    private final Library library;
    private final LightHouse lightHouse;
    private final LumberMerchant lumberMerchant;
    private final Mansion mansion;
    private final MarbleCutter marbleCutter;
    private final MetalMerchant metalMerchant;
    private final Mill mill;
    private final Monument monument;
    private final Observatory observatory;
    private final OilMerchant oilMerchant;
    private final OilPresser oilPresser;
    private final Palace palace;
    private final Parthenon parthenon;
    private final PigFarm pigFarm;
    private final PotteryMaker potteryMaker;
    private final PublicBath publicBath;
    private final Road road;
    private final SaltMerchant saltMerchant;
    private final Shipyard shipyard;
    private final Shrine shrine;
    private final SiegeWorkshop siegeWorkshop;
    private final SlaveTrader slaveTrader;
    private final Stable stable;
    private final StatueOfZeus statueOfZeus;
    private final Tailor tailor;
    private final Temple temple;
    private final Theatre theatre;
    private final WeaponMaker weaponMaker;

    private final int ROAD_LEVEL_CAP = 1, ROAD_WIDTH = 1, ROAD_HEIGHT = 1, ROAD_CONSTRUCTION_DURATION = 0, ROAD_COST = 20,
            HOUSE_LEVEL_CAP = 3, HOUSE_WIDTH = 3, HOUSE_HEIGHT = 2, HOUSE_CONSTRUCTION_DURATION = 1, HOUSE_COST = 500,
            MANSION_LEVEL_CAP = 3, MANSION_WIDTH = 4, MANSION_HEIGHT = 3, MANSION_CONSTRUCTION_DURATION = 2, MANSION_COST = 1200,
            GRANARY_LEVEL_CAP = 3, GRANARY_WIDTH = 5, GRANARY_HEIGHT = 4, GRANARY_CONSTRUCTION_DURATION = 3, GRANARY_COST = 1600,
            PALACE_LEVEL_CAP = 3, PALACE_WIDTH = 8, PALACE_HEIGHT = 4, PALACE_CONSTRUCTION_DURATION = 5, PALACE_COST = 10000,
            DOCK_LEVEL_CAP = 3, DOCK_WIDTH = 12, DOCK_HEIGHT = 3, DOCK_CONSTRUCTION_DURATION = 5, DOCK_COST = 10000,
            FISHERY_LEVEL_CAP = 3, FISHERY_WIDTH = 3, FISHERY_HEIGHT = 2, FISHERY_CONSTRUCTION_DURATION = 2, FISHERY_COST = 10000,
            SHRINE_LEVEL_CAP = 3, SHRINE_WIDTH = 3, SHRINE_HEIGHT = 3, SHRINE_CONSTRUCTION_DURATION = 3, SHRINE_COST = 2000,
            TEMPLE_LEVEL_CAP = 3, TEMPLE_WIDTH = 6, TEMPLE_HEIGHT = 3, TEMPLE_CONSTRUCTION_DURATION = 6, TEMPLE_COST = 20000,
            THEATER_LEVEL_CAP = 2, THEATER_WIDTH = 9, THEATER_HEIGHT = 6, THEATER_CONSTRUCTION_DURATION = 7, THEATER_COST = 25000,
            LIBRARY_LEVEL_CAP = 1, LIBRARY_WIDTH = 8, LIBRARY_HEIGHT = 5, LIBRARY_CONSTRUCTION_DURATION = 6, LIBRARY_COST = 16000,
            ACADEMY_LEVEL_CAP = 1, ACADEMY_WIDTH = 4, ACADEMY_HEIGHT = 4, ACADEMY_CONSTRUCTION_DURATION = 3, ACADEMY_COST = 6000,
            OBSERVATORY_LEVEL_CAP = 1, OBSERVATORY_WIDTH = 4, OBSERVATORY_HEIGHT = 4, OBSERVATORY_CONSTRUCTION_DURATION = 6, OBSERVATORY_COST = 12000,
            MILL_LEVEL_CAP = 3, MILL_WIDTH = 3, MILL_HEIGHT = 3, MILL_CONSTRUCTION_DURATION = 3, MILL_COST = 2000,
            BAKERY_LEVEL_CAP = 3, BAKERY_WIDTH = 3, BAKERY_HEIGHT = 2, BAKERY_CONSTRUCTION_DURATION = 2, BAKERY_COST = 1600,
            SLAVE_TRADER_LEVEL_CAP = 3, SLAVE_TRADER_WIDTH = 2, SLAVE_TRADER_HEIGHT = 2, SLAVE_TRADER_CONSTRUCTION_DURATION = 1, SLAVE_TRADER_COST = 1000,
            SALT_MERCHANT_LEVEL_CAP = 3, SALT_MERCHANT_WIDTH = 2, SALT_MERCHANT_HEIGHT = 2, SALT_MERCHANT_CONSTRUCTION_DURATION = 1, SALT_MERCHANT_COST = 1000,
            FABRIC_WORKSHOP_LEVEL_CAP = 3, FABRIC_WORKSHOP_WIDTH = 4, FABRIC_WORKSHOP_HEIGHT = 3, FABRIC_WORKSHOP_CONSTRUCTION_DURATION = 2, FABRIC_WORKSHOP_COST = 7000,
            TAILOR_LEVEL_CAP = 3, TAILOR_WIDTH = 3, TAILOR_HEIGHT = 2, TAILOR_CONSTRUCTION_DURATION = 1, TAILOR_COST = 2000,
            JEWELER_LEVEL_CAP = 1, JEWELER_WIDTH = 3, JEWELER_HEIGHT = 2, JEWELER_CONSTRUCTION_DURATION = 1, JEWELER_COST = 3000,
            CHEESE_MERCHANT_LEVEL_CAP = 3, CHEESE_MERCHANT_WIDTH = 2, CHEESE_MERCHANT_HEIGHT = 2, CHEESE_MERCHANT_CONSTRUCTION_DURATION = 1, CHEESE_MERCHANT_COST = 800,
            PIG_FARM_LEVEL_CAP = 3, PIG_FARM_WIDTH = 6, PIG_FARM_HEIGHT = 4, PIG_FARM_CONSTRUCTION_DURATION = 3, PIG_FARM_COST = 8500,
            BUTCHERY_LEVEL_CAP = 3, BUTCHERY_WIDTH = 3, BUTCHERY_HEIGHT = 2, BUTCHERY_CONSTRUCTION_DURATION = 1, BUTCHERY_COST = 2000,
            MARBLE_CUTTER_LEVEL_CAP = 3, MARBLE_CUTTER_WIDTH = 5, MARBLE_CUTTER_HEIGHT = 3, MARBLE_CUTTER_CONSTRUCTION_DURATION = 3, MARBLE_CUTTER_COST = 7000,
            LUMBER_MERCHANT_LEVEL_CAP = 3, LUMBER_MERCHANT_WIDTH = 5, LUMBER_MERCHANT_HEIGHT = 3, LUMBER_MERCHANT_CONSTRUCTION_DURATION = 3, LUMBER_MERCHANT_COST = 7000,
            OLIVE_PRESSER_LEVEL_CAP = 3, OLIVE_PRESSER_WIDTH = 4, OLIVE_PRESSER_HEIGHT = 3, OLIVE_PRESSER_CONSTRUCTION_DURATION = 3, OLIVE_PRESSER_COST = 8500,
            OIL_MERCHANT_LEVEL_CAP = 3, OIL_MERCHANT_WIDTH = 2, OIL_MERCHANT_HEIGHT = 2, OIL_MERCHANT_CONSTRUCTION_DURATION = 1, OIL_MERCHANT_COST = 1200,
            GRAPE_JUICE_DISTILLERY_LEVEL_CAP = 3, GRAPE_JUICE_DISTILLERY_WIDTH = 4, GRAPE_JUICE_DISTILLERY_HEIGHT = 3, GRAPE_JUICE_DISTILLERY_CONSTRUCTION_DURATION = 3, GRAPE_JUICE_DISTILLERY_COST = 7000,
            GRAPE_JUICE_MERCHANT_LEVEL_CAP = 3, GRAPE_JUICE_MERCHANT_WIDTH = 2, GRAPE_JUICE_MERCHANT_HEIGHT = 2, GRAPE_JUICE_MERCHANT_CONSTRUCTION_DURATION = 1, GRAPE_JUICE_MERCHANT_COST = 1300,
            METAL_MERCHANT_LEVEL_CAP = 3, METAL_MERCHANT_WIDTH = 3, METAL_MERCHANT_HEIGHT = 2, METAL_MERCHANT_CONSTRUCTION_DURATION = 1, METAL_MERCHANT_COST = 1300,
            FORGE_LEVEL_CAP = 3, FORGE_WIDTH = 4, FORGE_HEIGHT = 3, FORGE_CONSTRUCTION_DURATION = 3, FORGE_COST = 5500,
            ARMORY_LEVEL_CAP = 2, ARMORY_WIDTH = 4, ARMORY_HEIGHT = 3, ARMORY_CONSTRUCTION_DURATION = 3, ARMORY_COST = 6000,
            WEAPON_MAKER_LEVEL_CAP = 2, WEAPON_MAKER_WIDTH = 4, WEAPON_MAKER_HEIGHT = 2, WEAPON_MAKER_CONSTRUCTION_DURATION = 3, WEAPON_MAKER_COST = 6500,
            GLASS_MAKER_LEVEL_CAP = 1, GLASS_MAKER_WIDTH = 4, GLASS_MAKER_HEIGHT = 3, GLASS_MAKER_CONSTRUCTION_DURATION = 2, GLASS_MAKER_COST = 11000,
            POTTERY_MAKER_LEVEL_CAP = 1, POTTERY_MAKER_WIDTH = 3, POTTERY_MAKER_HEIGHT = 2, POTTERY_MAKER_CONSTRUCTION_DURATION = 2, POTTERY_MAKER_COST = 6000,
            STABLE_LEVEL_CAP = 1, STABLE_WIDTH = 6, STABLE_HEIGHT = 3, STABLE_CONSTRUCTION_DURATION = 2, STABLE_COST = 5000,
            ARCHERY_RANGE_LEVEL_CAP = 1, ARCHERY_RANGE_WIDTH = 8, ARCHERY_RANGE_HEIGHT = 4, ARCHERY_RANGE_CONSTRUCTION_DURATION = 3, ARCHERY_RANGE_COST = 5500,
            SIEGE_WORKSHOP_LEVEL_CAP = 1, SIEGE_WORKSHOP_WIDTH = 4, SIEGE_WORKSHOP_HEIGHT = 4, SIEGE_WORKSHOP_CONSTRUCTION_DURATION = 4, SIEGE_WORKSHOP_COST = 7500,
            BARRACK_LEVEL_CAP = 2, BARRACK_WIDTH = 8, BARRACK_HEIGHT = 8, BARRACK_CONSTRUCTION_DURATION = 3, BARRACK_COST = 4500,
            GENERAL_HEADQUARTER_LEVEL_CAP = 1, GENERAL_HEADQUARTER_WIDTH = 5, GENERAL_HEADQUARTER_HEIGHT = 5, GENERAL_HEADQUARTER_CONSTRUCTION_DURATION = 3, GENERAL_HEADQUARTER_COST = 8000,
            SHIPYARD_LEVEL_CAP = 2, SHIPYARD_WIDTH = 7, SHIPYARD_HEIGHT = 3, SHIPYARD_CONSTRUCTION_DURATION = 3, SHIPYARD_COST = 11000,
            LIGHTHOUSE_LEVEL_CAP = 1, LIGHTHOUSE_WIDTH = 5, LIGHTHOUSE_HEIGHT = 5, LIGHTHOUSE_CONSTRUCTION_DURATION = 6, LIGHTHOUSE_COST = 12000,
            COURTHOUSE_LEVEL_CAP = 1, COURTHOUSE_WIDTH = 7, COURTHOUSE_HEIGHT = 4, COURTHOUSE_CONSTRUCTION_DURATION = 8, COURTHOUSE_COST = 10000,
            AGORA_LEVEL_CAP = 1, AGORA_WIDTH = 8, AGORA_HEIGHT = 5, AGORA_CONSTRUCTION_DURATION = 3, AGORA_COST = 4000,
            PUBLIC_BATH_LEVEL_CAP = 1, PUBLIC_BATH_WIDTH = 4, PUBLIC_BATH_HEIGHT = 3, PUBLIC_BATH_CONSTRUCTION_DURATION = 4, PUBLIC_BATH_COST = 8500,
            MONUMENT_LEVEL_CAP = 1, MONUMENT_WIDTH = 2, MONUMENT_HEIGHT = 1, MONUMENT_CONSTRUCTION_DURATION = 4, MONUMENT_COST = 3000,
            CLAW_OF_ARCHIMEDES_LEVEL_CAP = 1, CLAW_OF_ARCHIMEDES_WIDTH = 4, CLAW_OF_ARCHIMEDES_HEIGHT = 4, CLAW_OF_ARCHIMEDES_CONSTRUCTION_DURATION = 12, CLAW_OF_ARCHIMEDES_COST = 9500,
            GREAT_LIGHTHOUSE_LEVEL_CAP = 1, GREAT_LIGHTHOUSE_WIDTH = 10, GREAT_LIGHTHOUSE_HEIGHT = 10, GREAT_LIGHTHOUSE_CONSTRUCTION_DURATION = 30, GREAT_LIGHTHOUSE_COST = 250000,
            COLOSSUS_LEVEL_CAP = 1, COLOSSUS_WIDTH = 10, COLOSSUS_HEIGHT = 10, COLOSSUS_CONSTRUCTION_DURATION = 30, COLOSSUS_COST = 220000,
            PARTHENON_LEVEL_CAP = 1, PARTHENON_WIDTH = 12, PARTHENON_HEIGHT = 8, PARTHENON_CONSTRUCTION_DURATION = 30, PARTHENON_COST = 200000,
            STATUE_OF_ZEUS_LEVEL_CAP = 1, STATUE_OF_ZEUS_WIDTH = 10, STATUE_OF_ZEUS_HEIGHT = 7, STATUE_OF_ZEUS_CONSTRUCTION_DURATION = 30, STATUE_OF_ZEUS_COST = 180000;

    //building ids start from 1000, and goes alphabetically from there
    //related buildings takes these ids for each building
    //id 999 saved for empty places
    //id 998 saved for sea
    //id 997 saved for walls
    private final int[] academyRelated = new int[]{1023}, academyRelatedRanges = new int[]{30},
            agoraRelated = new int[]{}, agoraRelatedRanges = new int[]{},
            archeryRangeRelated = new int[]{1005}, archeryRangeRelatedRanges = new int[]{25},
            armoryRelated = new int[]{1028}, armoryRelatedRanges = new int[]{25},
            bakeryRelated = new int[]{1029}, bakeryRelatedRanges = new int[]{50},
            barrackRelated = new int[]{}, barrackRelatedRanges = new int[]{},
            butcheryRelated = new int[]{1040, 1036}, butcheryRelatedRanges = new int[]{30, 41},
            cheeseMerchantRelated = new int[]{}, cheeseMerchantRelatedRanges = new int[]{},
            clawOfArchmiedesRelated = new int[]{997}, clawOfArchmiedesRelatedRanges = new int[]{1},
            colossusRelated = new int[]{998}, colossusRelatedRanges = new int[]{1},
            courtHouseRelated = new int[]{1034}, courtHouseRelatedRanges = new int[]{20},
            dockRelated = new int[]{998}, dockRelatedRanges = new int[]{1},
            fabricMerchantRelated = new int[]{}, fabricMerchantRelatedRanges = new int[]{},
            fisheryRelated = new int[]{998, 1040}, fisheryRelatedRanges = new int[]{1, 40},
            forgeRelated = new int[]{1028}, forgeRelatedRanges = new int[]{25},
            generalHeadquarterRelated = new int[]{1034}, generalHeadquarterRelatedRanges = new int[]{20},
            glassMakerRelated = new int[]{}, glassMakerRelatedRanges = new int[]{},
            granaryRelated = new int[]{}, granaryRelatedRanges = new int[]{},
            grapeJuiceDistilleryRelated = new int[]{1019}, grapeJuiceDistilleryRelatedRanges = new int[]{25},
            grapeJuiceMerchantRelated = new int[]{}, grapeJuiceMerchantRelatedRanges = new int[]{},
            greatLighthouseRelated = new int[]{998}, greatLighthouseRelatedRanges = new int[]{1},
            houseRelated = new int[]{}, houseRelatedRanges = new int[]{},
            jewelerRelated = new int[]{}, jewelerRelatedRanges = new int[]{},
            libraryRelated = new int[]{}, libraryRelatedRanges = new int[]{},
            lightHouseRelated = new int[]{998}, lightHouseRelatedRanges = new int[]{1},
            lumberMerchantRelated = new int[]{}, lumberMerchantRelatedRanges = new int[]{},
            mansionRelated = new int[]{}, mansionRelatedRanges = new int[]{},
            marbleCutterRelated = new int[]{}, marbleCutterRelatedRanges = new int[]{},
            metalMerchantRelated = new int[]{}, metalMerchantRelatedRanges = new int[]{},
            millRelated = new int[]{1027}, millRelatedRanges = new int[]{30},
            monumentRelated = new int[]{1034}, monumentRelatedRanges = new int[]{30},
            observatoryRelated = new int[]{1000, 1023}, observatoryRelatedRanges = new int[]{30, 30},
            oilMerchantRelated = new int[]{}, oilMerchantRelatedRanges = new int[]{},
            oilPresserRelated = new int[]{1032}, oilPresserRelatedRanges = new int[]{25},
            palaceRelated = new int[]{}, palaceRelatedRanges = new int[]{},
            parthenonRelated = new int[]{}, parthenonRelatedRanges = new int[]{},
            pigFarmRelated = new int[]{1027}, pigFarmRelatedRanges = new int[]{35},
            potteryMaketRelated = new int[]{}, potteryMaketRelatedRanges = new int[]{},
            publicBathRelated = new int[]{}, publicBathRelatedRanges = new int[]{},
            roadRelated = new int[]{}, roadRelatedRanges = new int[]{},
            saltMerchantRelated = new int[]{}, saltMerchantRelatedRanges = new int[]{},
            shipyardRelated = new int[]{998, 1025}, shipyardRelatedRanges = new int[]{1, 25},
            shrineRelated = new int[]{}, shrineRelatedRanges = new int[]{},
            siegeWorkshopRelated = new int[]{1023}, siegeWorkshopRelatedRanges = new int[]{25},
            slaveTraderRelated = new int[]{}, slaveTraderRelatedRanges = new int[]{},
            stableRelated = new int[]{}, stableRelatedRanges = new int[]{},
            statueOfZeusRelated = new int[]{}, statueOfZeusRelatedRanges = new int[]{},
            tailorRelated = new int[]{1012}, tailorRelatedRanges = new int[]{50},
            templeRelated = new int[]{}, templeRelatedRanges = new int[]{},
            theatreRelated = new int[]{}, theatreRelatedRanges = new int[]{},
            weaponMakerRelated = new int[]{1028}, weaponMakerRelatedRanges = new int[]{25};

    private final int[][] academyWorkers = new int[][]{{0, 0, 0}, {25, 0, 0}},
            archeryRangeWorkers = new int[][]{{80, 0, 0}, {0, 0, 0}},
            armoryWorkers = new int[][]{{20, 45, 0}, {5, 10, 0}},
            bakeryWorkers = new int[][]{{15, 25, 60}, {3, 5, 10}},
            barrackWorkers = new int[][]{{130, 0, 0}, {0, 0, 0}},
            butcheryWorkers = new int[][]{{10, 20, 50}, {3, 7, 15}},
            cheeseMerchantWorkers = new int[][]{{20, 35, 60}, {0, 0, 0}},
            courtHouseWorkers = new int[][]{{0, 0, 0}, {35, 0, 0}},
            dockWorkers = new int[][]{{30, 80, 150}, {5, 20, 35}},
            fabricMerchantWorkers = new int[][]{{40, 75, 130}, {10, 20, 30}},
            fisheryWorkers = new int[][]{{150, 500, 1000}, {20, 50, 100}},
            forgeWorkers = new int[][]{{35, 60, 100}, {5, 10, 15}},
            generalHeadquarterWorkers = new int[][]{{0, 0, 0}, {25, 0, 0}},
            glassMakerWorkers = new int[][]{{30, 0, 0}, {5, 0, 0}},
            granaryWorkers = new int[][]{{0, 0, 0}, {5, 15, 30}},
            grapeJuiceDistilleryWorkers = new int[][]{{25, 60, 100}, {5, 10, 13}},
            grapeJuiceMerchantWorkers = new int[][]{{0, 0, 0}, {15, 25, 35}},
            jewelerWorkers = new int[][]{{20, 0, 0}, {10, 0, 0}},
            libraryWorkers = new int[][]{{0, 0, 0}, {30, 0, 0}},
            lightHouseWorkers = new int[][]{{10, 0, 0}, {0, 0, 0}},
            lumberMerchantWorkers = new int[][]{{35, 75, 140}, {10, 20, 30}},
            marbleCutterWorkers = new int[][]{{30, 70, 130}, {10, 25, 40}},
            metalMerchantWorkers = new int[][]{{0, 0, 0}, {10, 20, 30}},
            millWorkers = new int[][]{{25, 40, 80}, {5, 10, 15}},
            observatoryWorkers = new int[][]{{0, 0, 0}, {50, 0, 0}},
            oilMerchantWorkers = new int[][]{{0, 0, 0}, {15, 25, 40}},
            oilPresserWorkers = new int[][]{{20, 50, 90}, {3, 5, 10}},
            palaceWorkers = new int[][]{{0, 0, 0}, {30, 60, 100}},
            pigFarmWorkers = new int[][]{{25, 50, 100}, {5, 10, 25}},
            potteryMakerWorkers = new int[][]{{20, 50, 0}, {5, 20,}},
            publicBathWorkers = new int[][]{{20, 0, 0}, {5, 0, 0}},
            saltMerchantWorkers = new int[][]{{0, 0, 0}, {10, 20, 30}},
            shipyardWorkers = new int[][]{{60, 100, 0}, {25, 40, 0}},
            shrineWorkers = new int[][]{{10, 25, 50}, {0, 0, 0}},
            siegeWorkshopWorkers = new int[][]{{0, 0, 0}, {40, 0, 0}},
            slaveTraderWorkers = new int[][]{{0, 0, 0}, {10, 20, 30}},
            stableWorkers = new int[][]{{40, 0, 0}, {10, 0, 0}},
            tailorWorkers = new int[][]{{15, 25, 35}, {5, 10, 15}},
            templeWorkers = new int[][]{{0, 0, 0}, {25, 55, 110}},
            theatreWorkers = new int[][]{{0, 0, 0}, {50, 120, 0}},
            weaponMakerWorkers = new int[][]{{20, 45, 0}, {5, 10,}};

    private final Building[] allBuildings;
    private final WorkBuilding[] allWorkBuildings;
    private final StorageBuilding[] allStorageBuildings;
    private final ProductionBuilding[] allProductionBuildings;
    private final Wonder[] allWonders;
    private final HousingBuilding[] allHousingBuildings;

    public BuildingsOfSyracuse(Materials materials) {
        ManufacturedMaterial[] armoryManufacturedMaterials = new ManufacturedMaterial[]{materials.getArmour()},
                bakeryManufacturedMaterials = new ManufacturedMaterial[]{materials.getBread()},
                butcheryManufacturedMaterials = new ManufacturedMaterial[]{materials.getMeat(), materials.getSaltedMeat()},
                fabricMerchantManufacturedMaterials = new ManufacturedMaterial[]{materials.getFabric(), materials.getDyedFabric()},
                fisheryManufacturedMaterials = new ManufacturedMaterial[]{materials.getFish(), materials.getSaltedFish()},
                forgeManufacturedMaterials = new ManufacturedMaterial[]{materials.getIron()},
                glassMakerManufacturedMaterials = new ManufacturedMaterial[]{materials.getGlass()},
                grapeJuiceDistilleryManufacturedMaterials = new ManufacturedMaterial[]{materials.getGrapeJuice()},
                jewelerManufacturedMaterials = new ManufacturedMaterial[]{materials.getAccessory()},
                lumberMerchantManufacturedMaterials = new ManufacturedMaterial[]{materials.getLumber()},
                marbleCutterManufacturedMaterials = new ManufacturedMaterial[]{materials.getProcessedMarble()},
                millManufacturedMaterials = new ManufacturedMaterial[]{materials.getFlour()},
                oilPresserManufacturedMaterials = new ManufacturedMaterial[]{materials.getOliveOil()},
                pigFarmManufacturedMaterials = new ManufacturedMaterial[]{materials.getPig()},
                potteryMakerManufacturedMaterials = new ManufacturedMaterial[]{materials.getPot()},
                stableManufacturedMaterials = new ManufacturedMaterial[]{materials.getHorse()},
                tailorManufacturedMaterials = new ManufacturedMaterial[]{materials.getCloth(), materials.getDyedCloth()},
                weaponMakerManufacturedMaterials = new ManufacturedMaterial[]{materials.getSpearArrow(), materials.getSword()};

        Material[] 
                armoryStores = new Material[]{materials.getArmour()},
                bakeryStores = new Material[]{},
                butcheryStores = new Material[]{materials.getSaltedMeat()},
                fabricMerchantStores = new Material[]{materials.getWool(),materials.getFlax(),materials.getDye(),materials.getFabric(),materials.getDyedFabric()},
                fisheryStores = new Material[]{materials.getSaltedFish()},
                forgeStores = new Material[]{materials.getIronOre()},
                glassMakerStores = new Material[]{materials.getGlass()},
                grapeJuiceDistilleryStores = new Material[]{},
                jewelerStores = new Material[]{materials.getAccessory()},
                lumberMerchantStores = new Material[]{materials.getTimber(), materials.getLumber()},
                marbleCutterStores = new Material[]{materials.getMarble(), materials.getProcessedMarble()},
                millStores = new Material[]{materials.getFlour()},
                oilPresserStores = new Material[]{},
                pigFarmStores = new Material[]{materials.getPig()},
                potteryMakerStores = new Material[]{materials.getPig()},
                stableStores = new Material[]{materials.getHorse()},
                tailorStores = new Material[]{materials.getCloth(), materials.getDyedCloth()},
                weaponMakerStores = new Material[]{materials.getSpearArrow(), materials.getSword()},
                metalMerchantStores = new Material[]{materials.getCopper(), materials.getIron(), materials.getSilver(), materials.getGold(), materials.getIvory()},
                grapeJuiceMerchantStores = new Material[]{materials.getGrapeJuice()},
                granaryStores = new Material[]{materials.getWheat(), materials.getBarley()},
                oilMerchantStores = new Material[]{materials.getOliveOil()},
                saltMerchantStores = new Material[]{materials.getSalt()},
                cheeseMerchantStores = new Material[]{materials.getCheese()};

        int[][] 
                armoryStorageCapacities = new int[][]{{10000,10000,0}},
                bakeryStorageCapacities = new int[][]{},
                butcheryStorageCapacities = new int[][]{{5000,5000,5000}},
                fabricMerchantStorageCapacities = new int[][]{{10000,10000,10000},{10000,10000,10000},{10000,10000,10000},{50000,50000,50000},{50000,50000,50000},},
                fisheryStorageCapacities = new int[][]{{5000,15000,50000}},
                forgeStorageCapacities = new int[][]{{10000,10000,10000}},
                glassMakerStorageCapacities = new int[][]{{2500,2500,2500}},
                grapeJuiceDistilleryStorageCapacities = new int[][]{},
                jewelerStorageCapacities = new int[][]{{1000,1000,1000}},
                lumberMerchantStorageCapacities = new int[][]{{3000,3000,3000},{6000,6000,6000}},
                marbleCutterStorageCapacities = new int[][]{{3000,3000,3000},{6000,6000,6000}},
                millStorageCapacities = new int[][]{{20000,50000,100000}},
                oilPresserStorageCapacities = new int[][]{},
                pigFarmStorageCapacities = new int[][]{{5000,5000,5000}},
                potteryMakerStorageCapacities = new int[][]{{5000,10000}},
                stableStorageCapacities = new int[][]{{300,300,300}},
                tailorStorageCapacities = new int[][]{{2500,2500,2500},{1500,1500,1500}},
                weaponMakerStorageCapacities = new int[][]{{7500,7500,7500},{2500,2500,2500}},
                metalMerchantStorageCapacities = new int[][]{{4000,9000,15000},{3000,7500,13000},{3000,7500,13000},{1000,2000,3500},{1000,2000,3500}},
                grapeJuiceMerchantStorageCapacities = new int[][]{{7000,15000,60000}},
                granaryStorageCapacities = new int[][]{{20000,50000,100000},{20000,50000,100000}},
                oilMerchantStorageCapacities = new int[][]{{6000,14000,55000}},
                saltMerchantStorageCapacities = new int[][]{{10000,30000,60000}},
                cheeseMerchantStorageCapacities = new int[][]{{1000,2000,8000}};
        
        
        this.academy = new Academy(ACADEMY_COST, ACADEMY_WIDTH, ACADEMY_HEIGHT, ACADEMY_CONSTRUCTION_DURATION, 0, 0, 0, 1, "Academy", academyRelated, academyRelatedRanges, true, academyWorkers);
        this.agora = new Agora(AGORA_COST, AGORA_WIDTH, AGORA_HEIGHT, AGORA_CONSTRUCTION_DURATION, 0, 0, 0, 1, "Agora", agoraRelated, agoraRelatedRanges, true);
        this.archeryRange = new ArcheryRange(ARCHERY_RANGE_COST, ARCHERY_RANGE_WIDTH, ARCHERY_RANGE_HEIGHT, ARCHERY_RANGE_CONSTRUCTION_DURATION, 0, 0, 0, 1, "Archery Range", archeryRangeRelated, archeryRangeRelatedRanges, true, archeryRangeWorkers);
        this.armory = new Armory(armoryManufacturedMaterials,armoryStores,armoryStorageCapacities,ARMORY_COST,ARMORY_WIDTH,ARMORY_HEIGHT,ARMORY_CONSTRUCTION_DURATION,0,0,0,2,"Armory",armoryRelated,armoryRelatedRanges,false,armoryWorkers);
        this.bakery = new Bakery(bakeryManufacturedMaterials,bakeryStores,bakeryStorageCapacities,BAKERY_COST,BAKERY_WIDTH,BAKERY_HEIGHT,BAKERY_CONSTRUCTION_DURATION,0,0,0,3,"Bakery",bakeryRelated,bakeryRelatedRanges,false,bakeryWorkers);
        this.barrack = new Barrack(BARRACK_COST,BARRACK_WIDTH,BARRACK_HEIGHT,BARRACK_CONSTRUCTION_DURATION,0,0,0,2,"Barrack",barrackRelated,barrackRelatedRanges,true,barrackWorkers);
        this.butchery = new Butchery(butcheryManufacturedMaterials,butcheryStores,butcheryStorageCapacities,BUTCHERY_COST,BUTCHERY_WIDTH,BUTCHERY_HEIGHT,BUTCHERY_CONSTRUCTION_DURATION,0,0,0,3,"Butchery",butcheryRelated, butcheryRelatedRanges, false, butcheryWorkers);
        this.cheeseMerchant = new CheeseMerchant(cheeseMerchantStores,cheeseMerchantStorageCapacities,CHEESE_MERCHANT_COST,CHEESE_MERCHANT_WIDTH,CHEESE_MERCHANT_HEIGHT,CHEESE_MERCHANT_CONSTRUCTION_DURATION,0,0,0,3,"Cheese Merchant",cheeseMerchantRelated,cheeseMerchantRelatedRanges,false,cheeseMerchantWorkers);
        this.clawOfArchimedes = new ClawOfArchimedes(CLAW_OF_ARCHIMEDES_COST,CLAW_OF_ARCHIMEDES_WIDTH,CLAW_OF_ARCHIMEDES_HEIGHT,CLAW_OF_ARCHIMEDES_CONSTRUCTION_DURATION,0,0,0,1,"Claw of Archimedes",clawOfArchmiedesRelated,clawOfArchmiedesRelatedRanges,true);
        this.colossus = new Colossus(COLOSSUS_COST,COLOSSUS_WIDTH,COLOSSUS_HEIGHT,COLOSSUS_CONSTRUCTION_DURATION,0,0,0,1,"Colossus",colossusRelated,colossusRelatedRanges,true);
        this.courthouse = new Courthouse(COURTHOUSE_COST,COURTHOUSE_WIDTH,COURTHOUSE_HEIGHT,COURTHOUSE_CONSTRUCTION_DURATION,0,0,0,1,"Courthouse",courtHouseRelated,courtHouseRelatedRanges,true,courtHouseWorkers);
        dock = new Dock(DOCK_COST,DOCK_WIDTH,DOCK_HEIGHT,DOCK_CONSTRUCTION_DURATION,0,0,0,3,"Dock",dockRelated,dockRelatedRanges,true,dockWorkers);
        this.fabricMerchant = new FabricMerchant(fabricMerchantManufacturedMaterials,fabricMerchantStores,fabricMerchantStorageCapacities,FABRIC_WORKSHOP_COST,FABRIC_WORKSHOP_WIDTH,FABRIC_WORKSHOP_HEIGHT,FABRIC_WORKSHOP_CONSTRUCTION_DURATION,0,0,0,FABRIC_WORKSHOP_LEVEL_CAP,"Fabric Merchant",fabricMerchantRelated,fabricMerchantRelatedRanges,false,fabricMerchantWorkers);
        this.fishery = new Fishery(fisheryManufacturedMaterials,fisheryStores,fisheryStorageCapacities, FISHERY_COST, FISHERY_WIDTH, FISHERY_HEIGHT, FISHERY_CONSTRUCTION_DURATION,0,0,0, FISHERY_LEVEL_CAP,"Fishery",fisheryRelated,fisheryRelatedRanges,true,fisheryWorkers);
        this.forge = new Forge(forgeManufacturedMaterials,forgeStores,forgeStorageCapacities, FORGE_COST, FORGE_WIDTH, FORGE_HEIGHT, FORGE_CONSTRUCTION_DURATION,0,0,0, FORGE_LEVEL_CAP, "Forge", forgeRelated, forgeRelatedRanges, false, forgeWorkers);
        this.generalHeadquarter = new GeneralHeadquarter( GENERAL_HEADQUARTER_COST, GENERAL_HEADQUARTER_WIDTH, GENERAL_HEADQUARTER_HEIGHT, GENERAL_HEADQUARTER_CONSTRUCTION_DURATION,0,0,0, GENERAL_HEADQUARTER_LEVEL_CAP,"General's HeadQuarter", generalHeadquarterRelated, generalHeadquarterRelatedRanges, true, generalHeadquarterWorkers);
        this.glassMaker = new GlassMaker(glassMakerManufacturedMaterials, glassMakerStores, glassMakerStorageCapacities,  GLASS_MAKER_COST, GLASS_MAKER_WIDTH, GLASS_MAKER_HEIGHT, GLASS_MAKER_CONSTRUCTION_DURATION,0,0,0, GLASS_MAKER_LEVEL_CAP, "Glass Maker", glassMakerRelated, glassMakerRelatedRanges, false, glassMakerWorkers);
        this.granary = new Granary(granaryStores, granaryStorageCapacities,  GRANARY_COST, GRANARY_WIDTH, GRANARY_HEIGHT, GRANARY_CONSTRUCTION_DURATION,0,0,0, GRANARY_LEVEL_CAP, "Granary", granaryRelated, granaryRelatedRanges, false, granaryWorkers);
        this.grapeJuiceDistillery = new GrapeJuiceDistillery(grapeJuiceDistilleryManufacturedMaterials, grapeJuiceDistilleryStores, grapeJuiceDistilleryStorageCapacities,  GRAPE_JUICE_DISTILLERY_COST, GRAPE_JUICE_DISTILLERY_WIDTH, GRAPE_JUICE_DISTILLERY_HEIGHT, GRAPE_JUICE_DISTILLERY_CONSTRUCTION_DURATION,0,0,0, GRAPE_JUICE_DISTILLERY_LEVEL_CAP, "Grape Juice Distillery", grapeJuiceDistilleryRelated, granaryRelatedRanges, false, grapeJuiceDistilleryWorkers);
        this.grapeJuiceMerchant = new GrapeJuiceMerchant(grapeJuiceMerchantStores, grapeJuiceMerchantStorageCapacities,  GRAPE_JUICE_MERCHANT_COST, GRAPE_JUICE_MERCHANT_WIDTH, GRAPE_JUICE_MERCHANT_HEIGHT, GRAPE_JUICE_MERCHANT_CONSTRUCTION_DURATION,0,0,0, GRAPE_JUICE_MERCHANT_LEVEL_CAP, "Grape Juice Merchant", grapeJuiceMerchantRelated, grapeJuiceMerchantRelatedRanges, false, grapeJuiceMerchantWorkers);
        this.greatLighthouse = new GreatLighthouse( GREAT_LIGHTHOUSE_COST, GREAT_LIGHTHOUSE_WIDTH, GREAT_LIGHTHOUSE_HEIGHT, GREAT_LIGHTHOUSE_CONSTRUCTION_DURATION,0,0,0, GREAT_LIGHTHOUSE_LEVEL_CAP, "The Great Lighthouse", greatLighthouseRelated, greatLighthouseRelatedRanges, true);
        
        
        int[] houseCapacity= new int[]{30,75,100};
        int[] mansionCapacity = new int[]{20,20,20};
        int[] houseHappiness= new int[]{0,0,1};
        int[] mansionHappiness = new int[]{0,1,2};
        
        this.house = new House(houseCapacity,houseHappiness, HOUSE_COST, HOUSE_WIDTH, HOUSE_HEIGHT, HOUSE_CONSTRUCTION_DURATION,0,0,0, HOUSE_LEVEL_CAP,"House", houseRelated, houseRelatedRanges, false);
        this.jeweler = new Jeweler(jewelerManufacturedMaterials, jewelerStores, jewelerStorageCapacities,  JEWELER_COST, JEWELER_WIDTH, JEWELER_HEIGHT, JEWELER_CONSTRUCTION_DURATION,0,0,0, JEWELER_LEVEL_CAP, "Jeweler", jewelerRelated, jewelerRelatedRanges, false, jewelerWorkers);
        this.library = new Library( LIBRARY_COST, LIBRARY_WIDTH, LIBRARY_HEIGHT, LIBRARY_CONSTRUCTION_DURATION,0,0,0, LIBRARY_LEVEL_CAP, "Library", libraryRelated, libraryRelatedRanges, true, libraryWorkers);
        this.lightHouse = new LightHouse( LIGHTHOUSE_COST, LIGHTHOUSE_WIDTH, LIGHTHOUSE_HEIGHT, LIGHTHOUSE_CONSTRUCTION_DURATION,0,0,0, LIGHTHOUSE_LEVEL_CAP, "Lighthouse", lightHouseRelated,lightHouseRelatedRanges,true, lightHouseWorkers);
        this.lumberMerchant = new LumberMerchant(lumberMerchantManufacturedMaterials,lumberMerchantStores,lumberMerchantStorageCapacities, LUMBER_MERCHANT_COST, LUMBER_MERCHANT_WIDTH, LUMBER_MERCHANT_HEIGHT, LUMBER_MERCHANT_CONSTRUCTION_DURATION,0,0,0, LUMBER_MERCHANT_LEVEL_CAP, "Lumber Merchant", lumberMerchantRelated, lumberMerchantRelatedRanges, false, lumberMerchantWorkers);
        this.mansion = new Mansion(mansionCapacity, mansionHappiness,  MANSION_COST, MANSION_WIDTH, MANSION_HEIGHT, MANSION_CONSTRUCTION_DURATION,0,0,0, MANSION_LEVEL_CAP, "Mansion", mansionRelated, mansionRelatedRanges, false);
        this.marbleCutter = new MarbleCutter(marbleCutterManufacturedMaterials,marbleCutterStores,marbleCutterStorageCapacities, MARBLE_CUTTER_COST, MARBLE_CUTTER_WIDTH, MARBLE_CUTTER_HEIGHT, MARBLE_CUTTER_CONSTRUCTION_DURATION,0,0,0, MARBLE_CUTTER_LEVEL_CAP, "Marble Cutter", marbleCutterRelated, marbleCutterRelatedRanges, false, marbleCutterWorkers);
        this.metalMerchant = new MetalMerchant(metalMerchantStores, metalMerchantStorageCapacities, METAL_MERCHANT_COST, METAL_MERCHANT_WIDTH, METAL_MERCHANT_HEIGHT, METAL_MERCHANT_CONSTRUCTION_DURATION,0,0,0, METAL_MERCHANT_LEVEL_CAP, "Metal Merchant", metalMerchantRelated, metalMerchantRelatedRanges, false, metalMerchantWorkers);
        this.mill = new Mill(millManufacturedMaterials, millStores,millStorageCapacities, MILL_COST, MILL_WIDTH, MILL_HEIGHT, MILL_CONSTRUCTION_DURATION,0,0,0, MILL_LEVEL_CAP,"Mill", millRelated, millRelatedRanges, false,millWorkers);
        
        //monument can only be build once is true because after building one it gets locked again until another victory
        this.monument = new Monument( MONUMENT_COST, MONUMENT_WIDTH, MONUMENT_HEIGHT, MONUMENT_CONSTRUCTION_DURATION,0,0,0, MONUMENT_LEVEL_CAP,"Monument", monumentRelated, monumentRelatedRanges, true);
        
        this.observatory = new Observatory( OBSERVATORY_COST, OBSERVATORY_WIDTH, OBSERVATORY_HEIGHT, OBSERVATORY_CONSTRUCTION_DURATION,0,0,0, OBSERVATORY_LEVEL_CAP, "Observatory", observatoryRelated, observatoryRelatedRanges, true, observatoryWorkers);
        this.oilMerchant = new OilMerchant(oilMerchantStores,oilMerchantStorageCapacities, OIL_MERCHANT_COST, OIL_MERCHANT_WIDTH, OIL_MERCHANT_HEIGHT, OIL_MERCHANT_CONSTRUCTION_DURATION,0,0,0, OIL_MERCHANT_LEVEL_CAP, "Oil Merchant", oilMerchantRelated, oilMerchantRelatedRanges, false, oilMerchantWorkers);
        this.oilPresser = new OilPresser(oilPresserManufacturedMaterials, oilPresserStores, oilPresserStorageCapacities,  OLIVE_PRESSER_COST, OLIVE_PRESSER_WIDTH, OLIVE_PRESSER_HEIGHT, OLIVE_PRESSER_CONSTRUCTION_DURATION,0,0,0, OLIVE_PRESSER_LEVEL_CAP, "Olive Presser", oilPresserRelated, oilPresserRelatedRanges, false, oilPresserWorkers);
        this.palace = new Palace( PALACE_COST, PALACE_WIDTH, PALACE_HEIGHT, PALACE_CONSTRUCTION_DURATION,0,0,0, PALACE_LEVEL_CAP, "Palace", palaceRelated, palaceRelatedRanges, true, palaceWorkers);
        this.parthenon = new Parthenon( PARTHENON_COST, PARTHENON_WIDTH, PARTHENON_HEIGHT, PARTHENON_CONSTRUCTION_DURATION,0,0,0, PARTHENON_LEVEL_CAP, "Parthenon", parthenonRelated, parthenonRelatedRanges, true);
        this.pigFarm = new PigFarm(pigFarmManufacturedMaterials, pigFarmStores, pigFarmStorageCapacities,  PIG_FARM_COST, PIG_FARM_WIDTH, PIG_FARM_HEIGHT, PIG_FARM_CONSTRUCTION_DURATION,0,0,0, PIG_FARM_LEVEL_CAP, "Pig Farm", pigFarmRelated, pigFarmRelatedRanges, false, pigFarmWorkers);
        this.potteryMaker = new PotteryMaker(potteryMakerManufacturedMaterials, potteryMakerStores, potteryMakerStorageCapacities,  POTTERY_MAKER_COST, POTTERY_MAKER_WIDTH, POTTERY_MAKER_HEIGHT, POTTERY_MAKER_CONSTRUCTION_DURATION,0,0,0, POTTERY_MAKER_LEVEL_CAP, "Pottery Maker", potteryMaketRelated, potteryMaketRelatedRanges, false, potteryMakerWorkers);
        this.publicBath = new PublicBath( PUBLIC_BATH_COST, PUBLIC_BATH_WIDTH, PUBLIC_BATH_HEIGHT, PUBLIC_BATH_CONSTRUCTION_DURATION,0,0,0, PUBLIC_BATH_LEVEL_CAP, "Public Bath", publicBathRelated, publicBathRelatedRanges, false, publicBathWorkers);
        this.road = new Road( ROAD_COST, ROAD_WIDTH, ROAD_HEIGHT, ROAD_CONSTRUCTION_DURATION,0,0,0, ROAD_LEVEL_CAP, "Road", roadRelated,roadRelatedRanges, false);
        this.saltMerchant = new SaltMerchant(saltMerchantStores,saltMerchantStorageCapacities, SALT_MERCHANT_COST, SALT_MERCHANT_WIDTH, SALT_MERCHANT_HEIGHT, SALT_MERCHANT_CONSTRUCTION_DURATION,0,0,0, SALT_MERCHANT_LEVEL_CAP, "Salt Merchant", saltMerchantRelated, saltMerchantRelatedRanges, false, saltMerchantWorkers);
        this.shipyard = new Shipyard( SHIPYARD_COST, SHIPYARD_WIDTH, SHIPYARD_HEIGHT, SHIPYARD_CONSTRUCTION_DURATION,0,0,0, SHIPYARD_LEVEL_CAP, "Shipyard", shipyardRelated,shipyardRelatedRanges, false, shipyardWorkers);
        this.shrine = new Shrine( SHRINE_COST, SHRINE_WIDTH, SHRINE_HEIGHT, SHRINE_CONSTRUCTION_DURATION,0,0,0, SHRINE_LEVEL_CAP, "Shrine", shrineRelated,shrineRelatedRanges, false, shrineWorkers);
        this.siegeWorkshop = new SiegeWorkshop( SIEGE_WORKSHOP_COST, SIEGE_WORKSHOP_WIDTH, SIEGE_WORKSHOP_HEIGHT, SIEGE_WORKSHOP_CONSTRUCTION_DURATION,0,0,0, SIEGE_WORKSHOP_LEVEL_CAP,"Siege Workshop", siegeWorkshopRelated, siegeWorkshopRelatedRanges, true, siegeWorkshopWorkers);
        this.slaveTrader = new SlaveTrader( SLAVE_TRADER_COST, SLAVE_TRADER_WIDTH, SLAVE_TRADER_HEIGHT, SLAVE_TRADER_CONSTRUCTION_DURATION,0,0,0, SLAVE_TRADER_LEVEL_CAP, "Slave Trader", slaveTraderRelated, slaveTraderRelatedRanges, false, slaveTraderWorkers);
        this.stable = new Stable (stableManufacturedMaterials, stableStores, stableStorageCapacities,  STABLE_COST, STABLE_WIDTH, STABLE_HEIGHT, STABLE_CONSTRUCTION_DURATION,0,0,0, STABLE_LEVEL_CAP, "Stable", stableRelated, stableRelatedRanges, false, stableWorkers);
        this.statueOfZeus = new StatueOfZeus( STATUE_OF_ZEUS_COST, STATUE_OF_ZEUS_WIDTH, STATUE_OF_ZEUS_HEIGHT, STATUE_OF_ZEUS_CONSTRUCTION_DURATION,0,0,0, STATUE_OF_ZEUS_LEVEL_CAP, "Statue of Zeus", stableRelated, stableRelatedRanges, true);
        this.tailor = new Tailor(tailorManufacturedMaterials,tailorStores, tailorStorageCapacities,  TAILOR_COST, TAILOR_WIDTH, TAILOR_HEIGHT, TAILOR_CONSTRUCTION_DURATION,0,0,0, TAILOR_LEVEL_CAP, "Talor", tailorRelated, tailorRelatedRanges, false, tailorWorkers);
        this.temple = new Temple( TEMPLE_COST, TEMPLE_WIDTH, TEMPLE_HEIGHT, TEMPLE_CONSTRUCTION_DURATION,0,0,0, TEMPLE_LEVEL_CAP,"Temple", templeRelated, templeRelatedRanges, false, templeWorkers);
        this.theatre = new Theatre ( THEATER_COST, THEATER_WIDTH, THEATER_HEIGHT, THEATER_CONSTRUCTION_DURATION,0,0,0, THEATER_LEVEL_CAP, "Theatre", theatreRelated, theatreRelatedRanges, true, theatreWorkers);
        this.weaponMaker = new WeaponMaker(weaponMakerManufacturedMaterials, weaponMakerStores, weaponMakerStorageCapacities,  WEAPON_MAKER_COST, WEAPON_MAKER_WIDTH, WEAPON_MAKER_HEIGHT, WEAPON_MAKER_CONSTRUCTION_DURATION,0,0,0, WEAPON_MAKER_LEVEL_CAP, "Weapon Maker", weaponMakerRelated, weaponMakerRelatedRanges, false, weaponMakerWorkers);

        allBuildings = new Building[]{academy,
            agora,
            archeryRange,
            armory,
            bakery,
            barrack,
            butchery,
            cheeseMerchant,
            clawOfArchimedes,
            colossus,
            courthouse,
            dock,
            fabricMerchant,
            fishery,
            forge,
            generalHeadquarter,
            glassMaker,
            granary,
            grapeJuiceDistillery,
            grapeJuiceMerchant,
            greatLighthouse,
            house,
            jeweler,
            library,
            lightHouse,
            lumberMerchant,
            mansion,
            marbleCutter,
            metalMerchant,
            mill,
            monument,
            observatory,
            oilMerchant,
            oilPresser,
            palace,
            parthenon,
            pigFarm,
            potteryMaker,
            publicBath,
            road,
            saltMerchant,
            shipyard,
            shrine,
            siegeWorkshop,
            slaveTrader,
            stable,
            statueOfZeus,
            tailor,
            temple,
            theatre,
            weaponMaker};

        allWonders = new Wonder[]{colossus, greatLighthouse, statueOfZeus, parthenon};
        allProductionBuildings = new ProductionBuilding[]{
            armory,
            bakery,
            butchery,
            fabricMerchant,
            fishery,
            forge,
            glassMaker,
            grapeJuiceDistillery,
            jeweler,
            lumberMerchant,
            marbleCutter,
            mill,
            oilPresser,
            pigFarm,
            potteryMaker,
            stable,
            tailor,
            weaponMaker,};

        allStorageBuildings = new StorageBuilding[6 + allProductionBuildings.length];
        for (int i = 0; i < allProductionBuildings.length; i++) {
            allStorageBuildings[i] = allProductionBuildings[i];
        }

        allStorageBuildings[allProductionBuildings.length] = metalMerchant;
        allStorageBuildings[allProductionBuildings.length + 1] = grapeJuiceMerchant;
        allStorageBuildings[allProductionBuildings.length + 2] = granary;
        allStorageBuildings[allProductionBuildings.length + 3] = oilMerchant;
        allStorageBuildings[allProductionBuildings.length + 4] = saltMerchant;
        allStorageBuildings[allProductionBuildings.length + 5] = cheeseMerchant;

        allWorkBuildings = new WorkBuilding[allStorageBuildings.length + 17];
        for (int i = 0; i < allStorageBuildings.length; i++) {
            allWorkBuildings[i] = allStorageBuildings[i];
        }

        allWorkBuildings[allStorageBuildings.length] = archeryRange;
        allWorkBuildings[allStorageBuildings.length + 1] = siegeWorkshop;
        allWorkBuildings[allStorageBuildings.length + 2] = library;
        allWorkBuildings[allStorageBuildings.length + 3] = publicBath;
        allWorkBuildings[allStorageBuildings.length + 4] = generalHeadquarter;
        allWorkBuildings[allStorageBuildings.length + 5] = barrack;
        allWorkBuildings[allStorageBuildings.length + 6] = courthouse;
        allWorkBuildings[allStorageBuildings.length + 7] = shipyard;
        allWorkBuildings[allStorageBuildings.length + 8] = shipyard;
        allWorkBuildings[allStorageBuildings.length + 9] = lightHouse;
        allWorkBuildings[allStorageBuildings.length + 10] = palace;
        allWorkBuildings[allStorageBuildings.length + 11] = theatre;
        allWorkBuildings[allStorageBuildings.length + 12] = temple;
        allWorkBuildings[allStorageBuildings.length + 13] = shrine;
        allWorkBuildings[allStorageBuildings.length + 14] = academy;
        allWorkBuildings[allStorageBuildings.length + 15] = observatory;
        allWorkBuildings[allStorageBuildings.length + 16] = dock;

        allHousingBuildings = new HousingBuilding[]{house, mansion};
    }

    public Academy getAcademy() {
        return academy;
    }

    public Agora getAgora() {
        return agora;
    }

    public ArcheryRange getArcheryRange() {
        return archeryRange;
    }

    public Armory getArmory() {
        return armory;
    }

    public Bakery getBakery() {
        return bakery;
    }

    public Barrack getBarrack() {
        return barrack;
    }

    public Butchery getButchery() {
        return butchery;
    }

    public CheeseMerchant getCheeseMerchant() {
        return cheeseMerchant;
    }

    public ClawOfArchimedes getClawOfArchimedes() {
        return clawOfArchimedes;
    }

    public Colossus getColossus() {
        return colossus;
    }

    public Courthouse getCourtHouse() {
        return courthouse;
    }

    public FabricMerchant getFabricMerchant() {
        return fabricMerchant;
    }

    public Fishery getFishery() {
        return fishery;
    }

    public Forge getForge() {
        return forge;
    }

    public GeneralHeadquarter getGeneralHeadquarter() {
        return generalHeadquarter;
    }

    public GlassMaker getGlassMaker() {
        return glassMaker;
    }

    public Granary getGranary() {
        return granary;
    }

    public GrapeJuiceDistillery getGrapeJuiceDistillery() {
        return grapeJuiceDistillery;
    }

    public GrapeJuiceMerchant getGrapeJuiceMerchant() {
        return grapeJuiceMerchant;
    }

    public GreatLighthouse getGreatLighthouse() {
        return greatLighthouse;
    }

    public House getHouse() {
        return house;
    }

    public Jeweler getJeweler() {
        return jeweler;
    }

    public Library getLibrary() {
        return library;
    }

    public LightHouse getLightHouse() {
        return lightHouse;
    }

    public LumberMerchant getLumberMerchant() {
        return lumberMerchant;
    }

    public Mansion getMansion() {
        return mansion;
    }

    public MarbleCutter getMarbleCutter() {
        return marbleCutter;
    }

    public MetalMerchant getMetalMerchant() {
        return metalMerchant;
    }

    public Mill getMill() {
        return mill;
    }

    public Monument getMonument() {
        return monument;
    }

    public Observatory getObservatory() {
        return observatory;
    }

    public OilMerchant getOilMerchant() {
        return oilMerchant;
    }

    public OilPresser getOilPresser() {
        return oilPresser;
    }

    public Palace getPalace() {
        return palace;
    }

    public Parthenon getParthenon() {
        return parthenon;
    }

    public PigFarm getPigFarm() {
        return pigFarm;
    }

    public PotteryMaker getPotteryMaker() {
        return potteryMaker;
    }

    public PublicBath getPublicBath() {
        return publicBath;
    }

    public Road getRoad() {
        return road;
    }

    public SaltMerchant getSaltMerchant() {
        return saltMerchant;
    }

    public Shipyard getShipyard() {
        return shipyard;
    }

    public Shrine getShrine() {
        return shrine;
    }

    public SiegeWorkshop getSiegeWorkshop() {
        return siegeWorkshop;
    }

    public SlaveTrader getSlaveTrader() {
        return slaveTrader;
    }

    public Stable getStable() {
        return stable;
    }

    public StatueOfZeus getStatueOfZeus() {
        return statueOfZeus;
    }

    public Tailor getTailor() {
        return tailor;
    }

    public Temple getTemple() {
        return temple;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public WeaponMaker getWeaponMaker() {
        return weaponMaker;
    }

}
