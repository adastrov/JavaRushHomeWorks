package com.javarush.test.level03.lesson06.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(1);
        print(2);
        print(3);
        println();

        print(3);
        print(2);
        print(1);
        println();

        print(2);
        print(1);
        print(3);
        println();

        print(1);
        print(3);
        print(2);
        println();

        print(3);
        print(1);
        print(2);
        println();

        print(2);
        print(3);
        print(1);
        println();
    }

    public static void print(int num)
    {
        if (num == 1)
        {
            System.out.print("Мама");
        }
        else if (num == 2)
        {
            System.out.print("Мыла");
        }
        else
        {
            System.out.print("Раму");
        }

    }

    public static void println()
    {

            System.out.println();

    }
}