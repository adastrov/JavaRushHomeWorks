package com.javarush.test.level08.lesson03.task01;

/* HashSet из растений
Создать коллекцию HashSet с типом элементов String.
Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> kollection = new HashSet<String>();
        kollection.add("арбуз");
        kollection.add("банан");
        kollection.add("вишня");
        kollection.add("груша");
        kollection.add("дыня");
        kollection.add("ежевика");
        kollection.add("жень-шень");
        kollection.add("земляника");
        kollection.add("ирис");
        kollection.add("картофель");

        for (String x : kollection)
        {
            System.out.println(x);
        }
    }
}
