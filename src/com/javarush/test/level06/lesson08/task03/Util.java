package com.javarush.test.level06.lesson08.task03;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{

    public static void main(String[] args)
    {
        double result = getDistance(1,1,2,3);
        System.out.println(result);
    }

    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        int k1 = (int) Math.pow(x2 - x1, 2);
        int k2 = (int) Math.pow(y2 - y1, 2);

        double g = Math.sqrt(k1 + k2);
        return g;
    }
}
