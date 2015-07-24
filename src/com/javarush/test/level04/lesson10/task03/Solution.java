package com.javarush.test.level04.lesson10.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String sNum  = scanner.nextLine();

        int num = Integer.parseInt(sNum);

        while(num > 0)
        {
            System.out.println(string);
            num--;
        }

    }
}
