package com.will;

public class Money {
    private double amount;
    private String type;

    public Money(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double convertToDollar() {

        if (this.type == "USD") {
            amount = this.amount * 1;
        } else if (this.type == "EUR") {
            amount = this.amount * 1.19;
        } else if (this.type == "JPY") {
            amount = this.amount * 0.0090;
        } else if (this.type == "BTC") {
            amount = this.amount * 3596.53;
        }
        return amount;
    }

    public double convertToEuro() {
        if (this.type == "EUR") {
            amount = this.amount * 1;
        } else if (this.type == "USD") {
            amount = this.amount * 0.84;
        } else if (this.type == "JPY") {
            amount = this.amount * 0.0076;
        } else if (this.type == "BTC") {
            amount = this.amount * 3121.52;
        }
        return amount;
    }

    public double convertToBit() {
        if (this.type == "BTC") {
            amount = this.amount * 1;
        } else if (this.type == "USD") {
            amount = this.amount * 0.00027;
        } else if (this.type == "JPY") {
            amount = this.amount * 0.0000024;
        } else if (this.type == "EUR") {
            amount = this.amount * 0.00032;
        }
        return amount;
    }

    public double convertToYen() {
        if (this.type == "JPY") {
            amount = this.amount * 1;
        } else if (this.type == "USD") {
            amount = this.amount * 110.87;
        } else if (this.type == "EUR") {
            amount = this.amount * 132.41;
        } else if (this.type == "BTC") {
            amount = this.amount * 411884.05;
        }
        return amount;
    }



}
