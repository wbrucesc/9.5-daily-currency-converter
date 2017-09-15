package com.will;

public class Main {

    public static void main(String[] args) {
        usd();
        eur();
        btc();
        jpy();
    }

    public static void usd() {
        System.out.println("Program running!");

        Money dollars = new Money(1000, "EUR");
           double amount = dollars.convertToDollar();
        System.out.println(amount);
    }

    public static void eur() {
        Money euros = new Money(10, "USD");
        double amount = euros.convertToEuro();
        System.out.println(amount);
    }

    public static void btc() {
        Money bitcoin = new Money(1000, "USD");
        double amount = bitcoin.convertToBit();
        System.out.println(amount);
    }

    public static void jpy() {
        Money yen = new Money(100, "EUR");
        double amount = yen.convertToYen();
        System.out.println(amount);
    }



}
