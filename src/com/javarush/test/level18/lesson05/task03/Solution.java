package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к исходному файлу:");
        FileInputStream inputStream = new FileInputStream(scanner.nextLine());
        System.out.println("Введите путь к первому файлу-получателю:");
        FileOutputStream outputStream1 = new FileOutputStream(scanner.nextLine());
        System.out.println("Введите путь ко второму файлу-получателю:");
        FileOutputStream outputStream2 = new FileOutputStream(scanner.nextLine());

        if (inputStream.available() > 0) {

            byte[] buffer = new byte[inputStream.available()];
            // проверим четное ли количество битов
            if(buffer.length%2 == 0)
            {
                int half = buffer.length/2;
                byte[] buffer1 = new byte[half];
                byte[] buffer2 = new byte[half];

                int count1 = inputStream.read(buffer1);
                int count2 = inputStream.read(buffer2);
                outputStream1.write(buffer1, 0, count1);
                outputStream2.write(buffer2, 0, count2);

            }else
            {

                byte[] buffer1 = new byte[buffer.length/2+1];
                byte[] buffer2 = new byte[buffer.length/2];

                int count1 = inputStream.read(buffer1);
                int count2 = inputStream.read(buffer2);
                outputStream1.write(buffer1, 0, count1);
                outputStream2.write(buffer2, 0, count2);

            }

        }


        System.out.println("Операция успешно завершена");

        scanner.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();

    }
}
