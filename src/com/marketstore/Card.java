package com.marketstore;

public abstract class Card {
    private String owner;
    private double turnOver;

    public Card(String owner, double turnOver) {
        this.owner = owner;
        this.turnOver = turnOver;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getTurnOver() {
        return turnOver;
    }
    public void setTurnOver(double turnOver) {
        this.turnOver = turnOver;
    }

    protected abstract double getDiscRate(double turnOver);
}