package com.marketstore;

public abstract class PayDesk {

    protected static double discRate(Card card) {
        return card.getDiscRate(card.getTurnOver());
    }

    protected static double discount(double purchaseValue, double discRate) {
        return purchaseValue * discRate;
    }

    protected static double total(double purchaseValue, double discount) {
        return purchaseValue - discount;
    }
}