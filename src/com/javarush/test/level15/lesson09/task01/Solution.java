package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();


    static {
        labels.put(0.1, "The first pair");
        labels.put(0.2, "The second pair");
        labels.put(0.3, "The third pair");
        labels.put(0.4, "The fifth pair");
        labels.put(0.5, "The sixth pair");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
