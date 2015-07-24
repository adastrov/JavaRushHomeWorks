package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 11; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 2; i < 11; i++)
        {
            System.out.print(i);
            System.out.print(" " + i*2);
            System.out.print(" " + i*3);
            System.out.print(" " + i*4);
            System.out.print(" " + i*5);
            System.out.print(" " + i*6);
            System.out.print(" " + i*7);
            System.out.print(" " + i*8);
            System.out.print(" " + i*9);
            System.out.print(" " + i*10);
            System.out.println();
        }

    }
}