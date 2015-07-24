package com.javarush.test.level03.lesson04.task02;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{
    public static void main(String[] args)
    {
        for(int i=0; i<10; i++)
        {
            printName("Pavel");
        }
    }

    public static void printName(String name)
    {
        for(int i=0; i<5; i++)
        {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}