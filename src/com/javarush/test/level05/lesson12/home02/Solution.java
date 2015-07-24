package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Pavel", 28, "zp");
        Man man2 = new Man("Ivan", 30, "Melitopol");

        Woman woman1 = new Woman("Suchka", 22, "zp");
        Woman woman2 = new Woman("Siski",  24, "Melitopol");

        man1.toPrint();
        man2.toPrint();

        woman1.toPrint();
        woman2.toPrint();
    }

    public static class Man
    {

        String name;
        int age;
        String address;

        Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        void toPrint()
        {
            System.out.println(name + " " + age + " " + address);
        }

    }

    public static class Woman
    {

        String name;
        int age;
        String address;

        Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        void toPrint()
        {
            System.out.println(name + " " + age + " " + address);
        }

    }
}
