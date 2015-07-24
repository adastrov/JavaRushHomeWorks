package com.javarush.test.level04.lesson16.home03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int sum = 0;
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        while (true) {
                in = rdr.readLine();
                int num = Integer.parseInt(in);
                sum += num;
                if (in.equals("-1")) {
                    System.out.println(sum);
                    break;
                }
        }
    }
}
