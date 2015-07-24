package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String sNum1 = scanner.nextLine();
        String sNum2 = scanner.nextLine();
        String sNum3 = scanner.nextLine();

        int a = Integer.parseInt(sNum1);
        int b = Integer.parseInt(sNum2);
        int c = Integer.parseInt(sNum3);

        if (a < b)
        {
            if (b < c)
                System.out.println(c+" "+b+" "+a);
            else
            {
                if (a > c)
                    System.out.println(b+" "+a+" "+c);
                else
                    System.out.println(b+" "+c+" "+a);
            }
        } else
        {
            if (b > c)
                System.out.println(a+" "+b+" "+c);
            else
            {
                if  (a > c)
                    System.out.println(a+" "+c+" "+b);
                else
                    System.out.println(c+" "+b+" "+a);
            }
        }

    }
}