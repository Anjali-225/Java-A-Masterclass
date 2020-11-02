package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double totalArea = floor.getArea();
        double costPerSqM = carpet.getCost();
        return totalArea * costPerSqM;
    }
}
