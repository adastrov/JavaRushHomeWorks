package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen
{

    final private int EGGS_COUNT = 500;

    @Override
    public int getCountOfEggsPerMonth()
    {
        return EGGS_COUNT;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + String.format( " Моя страна - %s. Я несу %d яиц в месяц.",
                Country.RUSSIA, getCountOfEggsPerMonth() );
    }
}
