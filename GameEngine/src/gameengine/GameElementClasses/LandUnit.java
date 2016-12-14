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
    public double getPowerAfterBonusesApplied(Army attacker, Army defender,
            isAttacking boolean, isSiegeBattle boolean){
    
}
}
