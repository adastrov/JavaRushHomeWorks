package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private double amount;

    Money(double amount)
    {
        this.amount = amount;
    }

    public abstract String getCurrencyName();

    public double getAmount() {
        return amount;
    }
}

