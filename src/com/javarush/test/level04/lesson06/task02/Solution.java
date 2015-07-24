package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String sNum1 = scanner.nextLine();
        String sNum2 = scanner.nextLine();
        String sNum3 = scanner.nextLine();
        String sNum4 = scanner.nextLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);
        int num4 = Integer.parseInt(sNum4);

        int maxTemp = getMaxNum(num1, num2);
        int maxTemp2  = getMaxNum(num3, num4);

        int totalMax = getMaxNum(maxTemp, maxTemp2);

        System.out.print(totalMax);
    }

    public static int getMaxNum(int num1, int num2)
    {
        if(num1>num2)
        {
            return num1;
        }else {
            return num2;
        }

    }
}
