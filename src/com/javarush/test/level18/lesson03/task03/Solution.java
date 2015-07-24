package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxValue = 0;

        while (inputStream.available() > 0)

        {
            int data = inputStream.read();
            if (!map.containsKey(data)) {
                map.put(data, 1);
            } else
            {

                if(map.containsKey(data))
                {
                    int currValue = map.get(data);
                    map.put(data, currValue+1);
                    maxValue = max(maxValue, currValue+1);
                }

            }

        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())

        {

            Map.Entry<Integer, Integer> pair = iterator.next();
            Integer key = pair.getKey();
            Integer value = pair.getValue();

            if (value == maxValue)
            {
                System.out.print(key + " ");
            }

        }

        inputStream.close();

    }

    public static int max(int value1, int value2)
    {
        return value1 > value2 ? value1 : value2;
    }

}
