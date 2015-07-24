package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {   ArrayList<String> a= new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Ввести с клавиатуры 2 числа N  и M.
        int n= Integer.parseInt(reader.readLine());
        int m= Integer.parseInt(reader.readLine());

        //Ввести N строк и заполнить ими список.
        for(int i=0; i<n; i++){
            a.add(reader.readLine());
        }
        //Переставить M первых строк в конец списка.
        {
            ArrayList<String> tmp= new ArrayList<String>();
            for(int i=0; i<m;i++){
                tmp.add(a.get(i));
            }
            for(int i=0; i<m;i++){
                a.remove(0);
            }
            for(int i=0; i<tmp.size();i++){
                a.add(tmp.get(i));
            }
        }

        //Вывести список на экран, каждое значение с новой строки.
        for(int i=0; i<a.size();i++){
            System.out.println(a.get(i));
        }

    }
}
