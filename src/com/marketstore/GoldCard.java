package com.marketstore;

public class GoldCard extends Card {
    private double initDiscRate = 0.02;

    public GoldCard(String owner, double turnOver) {
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
        int i = 0;
        double discRate = initDiscRate;
        int n = (int) (turnOver / 100);
        if (n > 7) {
            return 0.10;
        } else {
            while (i < n) {
                discRate += 0.01;
                i++;
            }
            return discRate;
        }
    }
}