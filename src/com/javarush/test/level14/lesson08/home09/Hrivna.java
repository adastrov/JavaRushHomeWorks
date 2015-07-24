package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Павел on 14.07.2015.
 */
public class Hrivna extends Money {

    Hrivna(double amount) {
        super(amount);
    }

    public String getCurrencyName() {
        return "HRN";
    }
}
