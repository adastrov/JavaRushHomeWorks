package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner scanner = new Scanner(System.in);
        String sNum1 = scanner.nextLine();
        String sNum2 = scanner.nextLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        for (int i = 0; i < num1; i++)
        {
            System.out.print(8);

            for (int subi = 0; subi < num2-1; subi++)
            {
                System.out.print(8);
            }

            System.out.println();

        }

    }
}
