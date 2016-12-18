/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

import gameengine.GameElementClasses.AIFaction;
import gameengine.GameElementClasses.PeloponnesianFaction;
import gameengine.GameElementClasses.SicilyFaction;
import gameengine.GameElementClasses.ThirdAgeFaction;

/**
 *
 * @author onur
 */
public class AIFactions {
    private final AIFaction Corinth;
    private final PeloponnesianFaction Athens, Sparta;
    private final ThirdAgeFaction Antigonids,Seleucids,Ptolemies,FreeCities;
    private final SicilyFaction Rome,Carthage;
    private SicilyFaction rebelFaction;

    public AIFactions(AIFaction Corinth, PeloponnesianFaction Athens, PeloponnesianFaction Sparta, ThirdAgeFaction Antigonids, ThirdAgeFaction Seleucids, ThirdAgeFaction Ptolemies, ThirdAgeFaction FreeCities, SicilyFaction Rome, SicilyFaction Carthage) {
        this.Corinth = Corinth;
        this.Athens = Athens;
        this.Sparta = Sparta;
        this.Antigonids = Antigonids;
        this.Seleucids = Seleucids;
        this.Ptolemies = Ptolemies;
        this.FreeCities = FreeCities;
        this.Rome = Rome;
        this.Carthage = Carthage;
    }
    
    public ThirdAgeFaction[] getThirdAgeFactions(){
     ThirdAgeFaction[] list={Antigonids,Seleucids,Ptolemies,FreeCities};
     return list;
    }
    
    public PeloponnesianFaction[] getPeloponnesianFactions(){
        PeloponnesianFaction[] list={Athens,Sparta};
        return list;
    }
    
    public SicilyFaction[] getSicilyFactions(){
        SicilyFaction[] list={Carthage,Rome,rebelFaction};
        return list;
    }

    public AIFaction getCorinth() {
        return Corinth;
    }

    public PeloponnesianFaction getAthens() {
        return Athens;
    }

    public PeloponnesianFaction getSparta() {
        return Sparta;
    }

    public ThirdAgeFaction getAntigonids() {
        return Antigonids;
    }

    public ThirdAgeFaction getSeleucids() {
        return Seleucids;
    }

    public ThirdAgeFaction getPtolemies() {
        return Ptolemies;
    }

    public ThirdAgeFaction getFreeCities() {
        return FreeCities;
    }

    public SicilyFaction getRome() {
        return Rome;
    }

    public SicilyFaction getCarthage() {
        return Carthage;
    }
    
    
}
