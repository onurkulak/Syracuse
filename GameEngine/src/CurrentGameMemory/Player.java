/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

/**
 *
 * @author onur
 */
public class Player {
    private final int playerEconomicSetting, playerMilitarySetting;
    private final String playerName;

    public Player(int playerEconomicSetting, int playerMilitarySetting, String playerName) {
        this.playerEconomicSetting = playerEconomicSetting;
        this.playerMilitarySetting = playerMilitarySetting;
        this.playerName = playerName;
    }

    public int getPlayerEconomicSetting() {
        return playerEconomicSetting;
    }

    public int getPlayerMilitarySetting() {
        return playerMilitarySetting;
    }

    public String getPlayerName() {
        return playerName;
    }
    
}
