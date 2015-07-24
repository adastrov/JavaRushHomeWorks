package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++)
        {
            String result = scanner.nextLine();
            list.add(result);
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {

        int listSize = list.size();

        for (int i = 0; i < listSize; i++)
        {
            if (i == 0)
            {
                list.add(i+1, list.get(i));
            }else
            {
                list.add(i*2, list.get(i*2));
            }
        }

        return list;
    }
}
