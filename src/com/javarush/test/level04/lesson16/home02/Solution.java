package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static int max;
    public static int min;
    public static int aver;

    public static void main(String[] args)   throws Exception
    {

        Scanner scanner = new Scanner(System.in);
        String sNum1 = scanner.nextLine();
        String sNum2 = scanner.nextLine();
        String sNum3 = scanner.nextLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);
        int num3 = Integer.parseInt(sNum3);

        if (num1 > num2)
        {
            if (num1 > num3)
            {
               max = num1;
               if(num2>num3)
               {
                   min  = num3;
                   aver = num2;
               }else{
                   min  = num2;
                   aver = num3;
               }
            }else{
                max  = num3;
                min  = num2;
                aver = num1;

            }

        }else if(num2 > num3){
            max  = num2;
            min  = num1;
            aver = num3;
        }else if (num3 > num2)
        {
            max  = num3;
            min  = num1;
            aver = num2;

        }

        System.out.println(aver);

    }
}
