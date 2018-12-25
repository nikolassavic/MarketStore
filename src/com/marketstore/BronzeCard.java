package com.marketstore;

public class BronzeCard extends Card {
    private double initDiscRate = 0;

    public BronzeCard(String owner, double turnOver) {
        super(owner, turnOver);
    }

    public double getInitDiscRate() {
        return initDiscRate;
    }
    public void setInitDiscRate(double initDiscRate) {
        this.initDiscRate = initDiscRate;
    }

    @Override
    protected double getDiscRate(double turnOver) {
        double discRate;
        if (turnOver >= 100 && turnOver <= 300) {
            discRate = 0.01;
        } else if (turnOver > 300) {
            discRate = 0.025;
        } else
            discRate = this.initDiscRate;
        return discRate;
    }
}
