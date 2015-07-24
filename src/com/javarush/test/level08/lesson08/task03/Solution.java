package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        map.put("Padalka", "Pavel");
        map.put("Filoncev", "Pavel");
        map.put("Romanesku", "Igor");
        map.put("Padalka", "Pavel");
        map.put("Padalka", "Pavel");
        map.put("Borisenko", "Pavel");
        map.put("Padalka", "Pavel");
        map.put("Padalka", "Ivan");
        map.put("Padalka", "Roman");
        map.put("Padalka", "Sergey");

        int result1 = getCountTheSameFirstName(map, "Pavel");
        int result2 = getCountTheSameLastName(map,  "Padalka");

        System.out.println(result1);
        System.out.println(result2);

    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name))
            {
                count++;
            }
        }

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(familiya))
            {
                count++;
            }
        }

        return count;
    }
}
