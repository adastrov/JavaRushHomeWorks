package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{

    public static int subI;
    public static int iterator;

    public static void main(String[] args) throws Exception
    {
        iterator = 1;
        subI = 1;

        while (iterator < 11)
        {

            toPrintAndToIncrementTheNum();

        }

    }

    public static void toPrintAndToIncrementTheNum()
    {

        System.out.print(iterator * subI + " ");

        if (iterator == 10)
        {
            subI++;
        }

        iterator++;

        if (iterator == 11)

        {
            iterator = 1;
            System.out.println();
        }

        if (subI == 11)
        {
            iterator = 11;
        }

    }

}
