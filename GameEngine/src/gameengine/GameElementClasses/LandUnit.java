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
public class LandUnit extends Unit{
    //attributes of a unit
    private final boolean mounted, melee, armored;
    //bonuses of a unit type
    private final double cityDefenceBonus, againstUnarmoredBonus,
            againstArmouredMeleeInfantryBonus, againstMeleeInfantryBonus,
            againstMountedBonus, againstUnarmoredMeleeInfantryBonus,
            swarmBonus, againstRangedBonus, cityRaiderBonus, elephantEffectBonus,
            cavalrySuperiorityBonus;
    private final int spearArrowCost, swordCost, horseCost, armorCost;

    public LandUnit(boolean mounted, boolean melee, boolean armored, double cityDefenceBonus, double againstUnarmoredBonus, double againstArmouredMeleeInfantryBonus, double againstMeleeInfantryBonus, double againstMountedBonus, double againstUnarmoredMeleeInfantryBonus, double swarmBonus, double againstRangedBonus, double cityRaiderBonus, double elephantEffectBonus, double cavalrySuperiorityBonus, int spearArrowCost, int swordCost, int horseCost, int armorCost, int proletariatRequirement, int aristoiRequirement, int moneyCost, int trainingTime, int monthlyWage, int basePower, String name) {
        super(proletariatRequirement, aristoiRequirement, moneyCost, trainingTime, monthlyWage, basePower, name);
        this.mounted = mounted;
        this.melee = melee;
        this.armored = armored;
        this.cityDefenceBonus = cityDefenceBonus;
        this.againstUnarmoredBonus = againstUnarmoredBonus;
        this.againstArmouredMeleeInfantryBonus = againstArmouredMeleeInfantryBonus;
        this.againstMeleeInfantryBonus = againstMeleeInfantryBonus;
        this.againstMountedBonus = againstMountedBonus;
        this.againstUnarmoredMeleeInfantryBonus = againstUnarmoredMeleeInfantryBonus;
        this.swarmBonus = swarmBonus;
        this.againstRangedBonus = againstRangedBonus;
        this.cityRaiderBonus = cityRaiderBonus;
        this.elephantEffectBonus = elephantEffectBonus;
        this.cavalrySuperiorityBonus = cavalrySuperiorityBonus;
        this.spearArrowCost = spearArrowCost;
        this.swordCost = swordCost;
        this.horseCost = horseCost;
        this.armorCost = armorCost;
    }

    
    //needs to be implemented
    //if is attacking and siege battle city raider bonus applied
    //if siege and defending city defence bonus applied
    //if siege battle mounted units don't get bonuses

    //if the [1] element in first array hoplite and [1] on the other array is 350 that means army includes 350 hoplites etc.

    //if enemy's number of cavalries is less than the unit's count cavalrySuperiorityBonus applied
    //if unit has swarmbonus and count is more than 1000 swarmbonus applies
    //if enemy unit has no "againstmountedbonus" elephant effect bonus applies

    // every bonus is a double value
    //say enemy army units are 1/3 ranged then
    //(1/3)*againstRangedBonus is added to the total bonus of the unit
    //againstBlabla bonuses are applied like above example, 
    //portion of the enemy army that fits the description*bonus value

    //in the end method returns basePower*count*(1+totalBonus)
    //getBasePower() is an inherited method, returns basepower

    public double getPowerAfterBonusesApplied(int count, ArrayList<LandUnit> enemyArmyUnits ,
        ArrayList<Integer> enemyArmyUnitCounts,boolean isAttacking,boolean isSiegeBattle){
    
}
}
