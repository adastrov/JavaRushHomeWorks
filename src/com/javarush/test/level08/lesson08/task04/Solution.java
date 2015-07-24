package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap map = createMap();
        removeAllSummerPeople(map);
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("MARCH 12 1980"));
        map.put("Alcapone", new Date("JUNE 12 1980"));
        map.put("Ivan", new Date("MARCH 13 1980"));
        map.put("Putin", new Date("MARCH 14 1980"));
        map.put("Pavel", new Date("JUNE 15 1980"));
        map.put("Roman", new Date("MARCH 16 1980"));
        map.put("Sergey", new Date("JUNE 17 1980"));
        map.put("Alex", new Date("MARCH 18 1980"));
        map.put("Ira", new Date("JUNE 19 1980"));
        map.put("Lex", new Date("MARCH 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        HashSet arrayForRemove = new HashSet()
        {
        };

        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            Date date = pair.getValue();

            if (date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7)
            {
                arrayForRemove.add(pair.getKey());
            }

        }

        for(Object x : arrayForRemove)
        {
            map.remove(x);
        }

        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
