package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.util.Scanner;

public class Solution
{

    int minNum;

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        /* данные для тестирования:
        введите 1 и 2, минимум =  1
        введите 2 и 1, минимум =  1
        введите 1 и 1, минимум =  1
        введите -1 и -2, минимум =  -2
         */

        Scanner scanner = new Scanner(System.in);
        String sNum1 = scanner.nextLine();
        String sNum2 = scanner.nextLine();

        int num1 = Integer.parseInt(sNum1);
        int num2 = Integer.parseInt(sNum2);

        int mn = setMinNum(num1, num2);

        System.out.print(mn);

    }

    public static int setMinNum(int num1, int num2)
    {
        if(num1<num2)
        {
            return num1;
        }else {
            return num2;
        }

    }

}