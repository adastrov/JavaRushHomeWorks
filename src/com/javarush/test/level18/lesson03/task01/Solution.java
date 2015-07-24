package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));
            long maxvalue = 0;

            while (inputStream.available() > 0)  //пока остались непрочитанные байты

            {
                int data = inputStream.read();   //прочитать очередной байт
                maxvalue = max(maxvalue, data);
            }

            inputStream.close();                     // закрываем поток

            System.out.println(maxvalue);             //выводим сумму на экран.

    }

    public static long max(long value1, long value2)
    {

        return value1 > value2 ? value1 : value2;
    }


}
