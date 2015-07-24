package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int sum = 0;
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        while (true) {
            try {
                in = rdr.readLine();
                int num = Integer.parseInt(in);
                sum += num;
            }
            catch (NumberFormatException e) {
                if (in.equals("сумма")) {
                    System.out.println(sum);
                    break;
                } else {
                    System.out.println("Введите либо число либо слово " + "сумма");
                    continue;
                }
            }
        }
    }
}
