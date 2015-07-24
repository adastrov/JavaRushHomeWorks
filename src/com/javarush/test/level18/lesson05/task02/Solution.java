package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));
        int symbCount = 0;

        while (inputStream.available() > 0)  //пока остались непрочитанные байты

        {
            int data = inputStream.read();   //прочитать очередной байт

            if (data == 44) {
                symbCount++;
            }
        }

        inputStream.close();

        System.out.println(symbCount);

    }
}
