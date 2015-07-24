package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Павел on 14.07.2015.
 */
public class Mouse implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
