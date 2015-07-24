package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashSet set = createSet();
        HashSet<Integer> iset = removeAllNumbersMoreThan10(set);

        for (Object x : set)
        {
            System.out.println(x);
        }

    }

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < 20; i++)
        {
            hashSet.add(i);
        }

        return hashSet;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        HashSet<Integer> hashSetToRemove = new HashSet<Integer>();

        for (Integer x : set)
        {
            if (x > 10)
            {
                hashSetToRemove.add(x);
            }
        }

        for (int x : hashSetToRemove)
        {
            set.remove(x);
        }

        return set;

    }
}
