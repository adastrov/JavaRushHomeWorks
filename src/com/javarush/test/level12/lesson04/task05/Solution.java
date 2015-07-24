package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int max(int value1, int value2)
    {
        if(value1<value2)
        {
            return value2;
        }else
            return value1;
    }

    public static long max(long value1, long value2)
    {
        if(value1<value2)
        {
            return value2;
        }else
            return value1;
    }

    public static double max(double value1, double value2)
    {
        if(value1<value2)
        {
            return value2;
        }else
            return value1;
    }
}
