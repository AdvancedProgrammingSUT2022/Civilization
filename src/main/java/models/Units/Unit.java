package models.Units;

import models.*;
import models.Tile.Tile;

import java.util.ArrayList;

public class Unit {
    // TODO : some of them should be final
    protected Tile position;
    protected Player player;
    protected UnitTypeEnum unitTypeEnum;
    protected UnitNameEnum unitNameEnum;
    protected float health = 20; // max health = 20  /  needed for combat types
    protected Integer combatStrength;
    protected Double movement;
    protected Integer range;
    protected Integer rangedCombatStrength;
    protected Integer cost;
    protected ArrayList<Tile> savedRoute;

    protected boolean stillForATurn;
    protected boolean needsCommand;
    protected boolean isSleeping;
    protected boolean isAlert;

    protected boolean isWorking;

    public Unit(Player player, Tile position, UnitNameEnum unitNameEnum) {
        setPosition(position);
        setUnitNameEnum(unitNameEnum);
        setPlayer(player);
        setUnitTypeEnum(unitNameEnum.getCombatType());
        setCombatStrength(unitNameEnum.getCombatStrength());
        setMovement(unitNameEnum.getMovement());
        setRange(unitNameEnum.getRange());
        setRangedCombatStrength(unitNameEnum.getRangedCombatStrength());
        setCost(unitNameEnum.getCost());
    }

    public Unit(Unit unit) {
        setPosition(unit.getPosition().clone());
        setUnitNameEnum(unit.getUnitNameEnum());
        setPlayer(unit.getPlayer());
        setUnitTypeEnum(unit.getUnitTypeEnum());
        setCombatStrength(unit.getCombatStrength());
        setMovement(unit.getMovement());
        setRange(unit.getRange());
        setRangedCombatStrength(unit.getRangedCombatStrength());
        setCost(unit.getCost());
    }

    public Unit clone() {
        //TODO: check this!
        return new Unit(this);
    }


    public Tile getPosition() {
        return this.position;
    }

    public void setPosition(Tile position) {
        this.position = position;
    }


    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isNeedsCommand() {
        return this.needsCommand;
    }

    public boolean getNeedsCommand() {
        return this.needsCommand;
    }

    public void setNeedsCommand(boolean needsCommand) {
        this.needsCommand = needsCommand;
    }

    public boolean isIsAlert() {
        return this.isAlert;
    }

    public boolean getIsAlert() {
        return this.isAlert;
    }

    public void setIsAlert(boolean isAlert) {
        this.isAlert = isAlert;
    }


    public UnitNameEnum getUnitNameEnum() {
        return unitNameEnum;
    }

    public void setUnitNameEnum(UnitNameEnum unitNameEnum) {
        this.unitNameEnum = unitNameEnum;
    }

    public UnitTypeEnum getUnitTypeEnum() {
        return unitTypeEnum;
    }

    public void setUnitTypeEnum(UnitTypeEnum unitTypeEnum) {
        this.unitTypeEnum = unitTypeEnum;
    }

    public Integer getCombatStrength() {
        return combatStrength;
    }

    public void setCombatStrength(Integer combatStrength) {
        this.combatStrength = combatStrength;
    }

    public Double getMovement() {
        return movement;
    }

    public void setMovement(Double movement) {
        this.movement = movement;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Integer getRangedCombatStrength() {
        return rangedCombatStrength;
    }

    public void setRangedCombatStrength(Integer rangedCombatStrength) {
        this.rangedCombatStrength = rangedCombatStrength;
    }

    public boolean isStillForATurn() {
        return stillForATurn;
    }

    public void setStillForATurn(boolean stillForATurn) {
        this.stillForATurn = stillForATurn;
    }

    public boolean isACombatUnit() {
        return !(getUnitTypeEnum() == UnitTypeEnum.CIVILIAN);
    }

    public boolean isACivilian() {
        return getUnitTypeEnum() == UnitTypeEnum.CIVILIAN;
    }

    public boolean isARangedCombatUnit() {
        return (getUnitTypeEnum() == UnitTypeEnum.SIEGE
                || getUnitTypeEnum() == UnitTypeEnum.ARCHERY);
    }

    public boolean isAMeleeCombatUnit() {
        return !(getUnitTypeEnum() == UnitTypeEnum.SIEGE
                || getUnitTypeEnum() == UnitTypeEnum.ARCHERY) && !(getUnitTypeEnum() == UnitTypeEnum.CIVILIAN);
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public ArrayList<Tile> getSavedRoute() {
        return savedRoute;
    }

    public void setSavedRoute(ArrayList<Tile> savedRoute) {
        this.savedRoute = savedRoute;
    }

    public boolean isASiege() {
        return getUnitTypeEnum() == UnitTypeEnum.SIEGE;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public void heal() {
        setHealth(Math.min(20, getHealth() + 5));
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public boolean isFullyHealed() {
        return getHealth() == 20;
    }

    public void resetMovement() {
        setMovement(getUnitNameEnum().getMovement());
    }

    public Double getMaxMovement() {
        return getUnitNameEnum().getMovement();
    }

    public boolean isAWorker() {
        return getUnitNameEnum() == UnitNameEnum.WORKER;
    }
}