package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException{
        //Создаем поток чтения из файла

        FileReader fileReader = new FileReader(args[0]);
        Map<String, Double> map = new HashMap<String, Double>();

        String input = "";

        String key = "";

        Double val = 0.0;

        //Считываем содержимое файла, закрываем поток

        while (fileReader.ready())
        {
            input = input + (char) fileReader.read();
        }

        fileReader.close();

        //Делим на строки, если в словаре нет такой фамилии,
        // то добавляем нового человека, иначе пересчитываем ЗП существующего
        String[] lines = input.split("\n");
        for (int i = 0; i < lines.length; i++) {
            key = lines[i].split(" ")[0];
            val = Double.parseDouble(lines[i].split(" ")[1]);
            if (!map.containsKey(key)) {
                map.put(key, val);
            }
            else {
                for (Map.Entry<String, Double> pair : map.entrySet()) {
                    if (pair.getKey().equals(key)) pair.setValue(pair.getValue() + val);
                }
            }

        }
        fileReader.close();

        //Поиск максимума ЗП
        double max = Double.MIN_VALUE;
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() > max) max = pair.getValue();
        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (pair.getValue() == max) System.out.println(pair.getKey());
        }
    }
}
