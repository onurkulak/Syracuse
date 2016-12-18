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
public class Aristoi extends FreePeople{
    private Material[] goodsAlternatives;

    public Aristoi(String name) {
        super(name);
    }

    public void setGoodsAlternatives(Material[] goodsAlternatives) {
        this.goodsAlternatives = goodsAlternatives;
    }

    @Override
    protected void consumeGoods() {
        int peopleInNeed=getPreviousTurnPopulationIncrease()+
            (int)(getGoodNeedFrequency()*getTotalPopulation());
        double happinessFromGoods=0;
        for(int i=0;i<goodsNeeds.length;i++)
            if(goodsNeeds[i].isAllowedToConsume())
                if(goodsNeeds[i].getAmount()<peopleInNeed){
                    happinessFromGoods+=goodsHappinessModifier*goodsNeeds[i].getAmount()/peopleInNeed*goodsHappiness[i];
                    if(goodsAlternatives[i].isAllowedToConsume())
                        if(!goodsAlternatives[i].consume(peopleInNeed-goodsNeeds[i].getAmount()))
                            goodsAlternatives[i].setAmount(0);
                    
                    goodsNeeds[i].setAmount(0);
                }
                else{
                    happinessFromGoods+=goodsHappinessModifier*goodsHappiness[i];
                    goodsNeeds[i].consume(peopleInNeed);
                }
            else{
                if(goodsAlternatives[i].isAllowedToConsume())
                    if(!goodsAlternatives[i].consume(peopleInNeed-goodsNeeds[i].getAmount()))
                       goodsAlternatives[i].setAmount(0);
            }
        happiness+=happinessFromGoods;    
    }
}
