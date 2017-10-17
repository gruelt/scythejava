package com.scythe;

public class PlayerMat {
    private String name;
    private int mechCost;
    private int upgradeCost;
    private int foodCost;

    private int moveCount;
    private int buyCount;




    public PlayerMat(String name, int mechCost, int upgradeCost, int foodCost,int buildCost, int moveCount, int buyCount, int produceCount, int bolsterCount) {
        this.name = name;
        this.mechCost = mechCost;
        this.upgradeCost = upgradeCost;
        this.foodCost = foodCost;
        this.moveCount = moveCount;
        this.buyCount = buyCount;
        this.produceCount = produceCount;
        this.bolsterCount = bolsterCount;
        this.buildCost = buildCost;


    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getProduceCount() {
        return produceCount;
    }

    public void setProduceCount(int produceCount) {
        this.produceCount = produceCount;
    }

    public int getBolsterCount() {
        return bolsterCount;
    }

    public void setBolsterCount(int bolsterCount) {
        this.bolsterCount = bolsterCount;
    }

    private int produceCount;
    private int bolsterCount;



    private int buildCost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMechCost() {
        return mechCost;
    }

    public void setMechCost(int mechCost) {
        this.mechCost = mechCost;
    }

    public int getUpgradeCost() {
        return upgradeCost;
    }

    public void setUpgradeCost(int upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    public int getBuildCost() {
        return buildCost;
    }

    public void setBuildCost(int buildCost) {
        this.buildCost = buildCost;
    }

    public int getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(int foodCost) {
        this.foodCost = foodCost;
    }


    /**
     *
     * Implementation of upgrades in player mat
     *


    public void upgrade(String topUpgrade,String downUpgrade)
    {
        this.display();
        this.
        downUpgrade--;
        this.display();
    }

    /**
     * Displays current state of the mat
     *
     */
    public void display(){
        System.out.println("#######" + this.name);
        System.out.println("##Top Actions " + this.name);
        System.out.println("Moves " + this.moveCount);
        System.out.println("Buy " + this.buyCount);
        System.out.println("Produce " + this.produceCount);
        System.out.println("Bolster " + this.bolsterCount);

        System.out.println("##Bottom Actions " + this.name);
        System.out.println("Upgrade " + this.upgradeCost);
        System.out.println("Mech " + this.mechCost);
        System.out.println("Build " + this.buildCost);
        System.out.println("Recruit " + this.foodCost);


    }


}
