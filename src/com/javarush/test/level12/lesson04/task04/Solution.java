package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int value1, int value2)
    {
        if(value1>value2)
        {
            return value2;
        }else
        return value1;
    }

    public static long min(long value1, long value2)
    {
        if(value1>value2)
        {
            return value2;
        }else
            return value1;
    }

    public static double min(double value1, double value2)
    {
        if(value1>value2)
        {
            return value2;
        }else
            return value1;
    }
}
