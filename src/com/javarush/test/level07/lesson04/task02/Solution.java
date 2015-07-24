package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String [] st = new String[10];
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 8; i++){
            st[i] = rd.readLine();
        }


        for(int i = st.length-1; i > -1; i--){
            System.out.println(st[i]);
        }
    }

}