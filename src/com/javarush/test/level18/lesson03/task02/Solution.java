package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));
        long minValue = 0;

        while (inputStream.available() > 0)  //пока остались непрочитанные байты

        {
            int data = inputStream.read();   //прочитать очередной байт
            if (minValue == 0) {
                minValue = data;
            }
            minValue = min(minValue, data);
        }

        inputStream.close();                     // закрываем поток

        System.out.println(minValue);             //выводим сумму на экран.

    }

    public static long min(long value1, long value2)
    {

        return value1 > value2 ? value2 : value1;
    }


}
