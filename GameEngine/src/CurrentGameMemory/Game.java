/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrentGameMemory;

import gameengine.GameElementClasses.PlayerFaction;

/**
 *
 * @author onur
 */
public class Game {
    private ActiveThings activeThings;
    private AIFactions aiFactions;
    private PlayerCivics playerCivics;
    private BuildingsOfSyracuse buildings;
    private Player player;
    private CityStatus cityStatus;
    private PlayerFaction faction;
    private PeopleOfSyracuse people;
    private AllUnits units;
    private int age,date,money;
    private Materials materials;
    private Places places;
    private String historicalEvents;

    public Game() {
    }

    public ActiveThings getActiveThings() {
        return activeThings;
    }

    public void setActiveThings(ActiveThings activeThings) {
        this.activeThings = activeThings;
    }

    public AIFactions getAiFactions() {
        return aiFactions;
    }

    public void setAiFactions(AIFactions aiFactions) {
        this.aiFactions = aiFactions;
    }

    public PlayerCivics getPlayerCivics() {
        return playerCivics;
    }

    public void setPlayerCivics(PlayerCivics playerCivics) {
        this.playerCivics = playerCivics;
    }

    public BuildingsOfSyracuse getBuildings() {
        return buildings;
    }

    public void setBuildings(BuildingsOfSyracuse buildings) {
        this.buildings = buildings;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CityStatus getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(CityStatus cityStatus) {
        this.cityStatus = cityStatus;
    }

    public PlayerFaction getFaction() {
        return faction;
    }

    public void setFaction(PlayerFaction faction) {
        this.faction = faction;
    }

    public PeopleOfSyracuse getPeople() {
        return people;
    }

    public void setPeople(PeopleOfSyracuse people) {
        this.people = people;
    }

    public AllUnits getUnits() {
        return units;
    }

    public void setUnits(AllUnits units) {
        this.units = units;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public Places getPlaces() {
        return places;
    }

    public void setPlaces(Places places) {
        this.places = places;
    }

    public String getHistoricalEvents() {
        return historicalEvents;
    }

    public void setHistoricalEvents(String historicalEvents) {
        this.historicalEvents = historicalEvents;
    }
    
    
}
