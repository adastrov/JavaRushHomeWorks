package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        cat1.age      = 8;
        cat1.weight   = 4;
        cat1.strength = 20;

        Cat cat2 = new Cat();
        cat2.age      = 8;
        cat2.weight   = 3;
        cat2.strength = 25;


        boolean result1 = cat1.fight(cat2);
        boolean result2 = cat2.fight(cat1);

        System.out.println(result1);
        System.out.println(result2);
    }

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {

        if (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength)
            return true;
        else if (this.age < anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength)
            return true;
        else if (this.age < anotherCat.age && this.weight == anotherCat.weight && this.strength == anotherCat.strength)
            return true;
        else if (this.age >= anotherCat.age && this.weight < anotherCat.weight && this.strength >= anotherCat.strength)
            return true;
        else if (this.age >= anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength)
            return true;
        else if (this.age >= anotherCat.age && this.weight >= anotherCat.weight && this.strength > anotherCat.strength)
            return true;
        else
            return false;

    }
}
