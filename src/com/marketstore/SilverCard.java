package com.marketstore;

public class SilverCard extends Card {
    private double initDiscRate = 0.02;

    public SilverCard(String owner, double turnOver) {
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
        if (turnOver > 300) {
            discRate = 0.035;
        } else
            discRate = this.initDiscRate;
        return discRate;
    }
}
