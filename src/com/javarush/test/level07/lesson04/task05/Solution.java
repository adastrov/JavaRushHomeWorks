package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array20 = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array20.length; i++)

        {
            array20[i] = scanner.nextInt();
        }

        int[] array10 = new int[10];
        int[] array2_10 = new int[10];

        for (int i = 0; i < array20.length; i++)
        {
            if (i < array20.length / 2)
            {
                array10[i] = array20[i];
            }else
            {
               array2_10[i-10] = array20[i];
            }
        }

        for (int i = 0; i < array2_10.length; i++)
        {
            System.out.println(array2_10[i]);
        }
    }
}
