package com.marketstore;

public class Main {

    public static void main(String[] args) {
        Card bCard = new BronzeCard("Owner1", 0);
        Card sCard = new SilverCard("Owner2", 600);
        Card gCard = new GoldCard("Owner3", 1500);

        System.out.println("Bronze:");
        printBill(bCard, 150);
        System.out.println("Silver:");
        printBill(sCard, 850);
        System.out.println("Gold:");
        printBill(gCard, 1300);

    }

    private static void printBill(Card card, double purchaseValue){
        double discountRate = PayDesk.discRate(card);
        double discount = PayDesk.discount(purchaseValue, discountRate);
        double total = PayDesk.total(purchaseValue, discount);

        System.out.printf("Purchase value: $%.2f%n", purchaseValue);
        System.out.printf("Discount rate: %.2f%%%n", discountRate * 100);
        System.out.printf("Dicount: $%.2f%n", discount);
        System.out.printf("Total: $%.2f%n", total);
        System.out.println("-------------------------------------");
    }
}