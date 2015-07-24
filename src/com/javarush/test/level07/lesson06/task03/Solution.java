package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            String result = scanner.nextLine();
            list.add(result);
        }

        sort(list);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }

    public static void sort(ArrayList<String> array)
    {
        Collections.reverse(array);
    }
}
