package models.Building;

import models.Technology.Tech;
import models.Technology.TechEnum;

public class Building {
    private BuildingEnum name;
    private int goldCost;
    private int maintenance;
    private TechEnum requisiteTechEnum;
    private Tech requisiteTech; // TODO : constructor ?!?!
    private int productionPointsNeeded;

    public Building(BuildingEnum name) {
        setName(name);
        setMaintenance(name.getMaintenance());
        setGoldCost(name.getCost());
        setRequisiteTechEnum(name.getTechEnum());
    }

    public BuildingEnum getName() {
        return name;
    }

    public void setName(BuildingEnum name) {
        this.name = name;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public int getProductionPointsNeeded() {
        return productionPointsNeeded;
    }

    public void setProductionPointsNeeded(int productionPointsNeeded) {
        this.productionPointsNeeded = productionPointsNeeded;
    }


    public TechEnum getRequisiteTechEnum() {
        return requisiteTechEnum;
    }

    public void setRequisiteTechEnum(TechEnum requisiteTechEnum) {
        this.requisiteTechEnum = requisiteTechEnum;
    }

    public Tech getRequisiteTech() {
        return requisiteTech;
    }

    public void setRequisiteTech(Tech requisiteTech) {
        this.requisiteTech = requisiteTech;
    }
}