package com.palagen.study.regularExpression.MapIterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Admin on 21.07.2015.
 */
public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(new File(reader.readLine()));

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int minValue = 0;

        while (inputStream.available() > 0)

        {
            int data = inputStream.read();
            System.out.println(data);
            if (!map.containsKey(data)) {
                map.put(data, 1);
            } else
            {
                if(map.containsKey(data))
                {
                    if (minValue == 0) {
                        minValue = map.get(data);
                    }
                    int currValue = map.get(data);
                    map.put(data, currValue+1);
                    minValue = min(minValue, currValue + 1);
                }

            }

        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())

        {
            Map.Entry<Integer, Integer> pair = iterator.next();
            Integer key = pair.getKey();
            Integer value = pair.getValue();

            if (value == minValue)
            {
                System.out.print(key + " ");
            }

        }

        inputStream.close();

    }

    public static int min(int value1, int value2)
    {
        return value1 > value2 ? value2 : value1;
    }

}
