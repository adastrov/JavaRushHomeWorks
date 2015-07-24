package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human gradFather = new Human();
        gradFather.name = "Толя";
        gradFather.sex  = true;
        gradFather.age  = 70;

        Human grandFatherRoman = new Human();
        grandFatherRoman.name = "Игорь";
        grandFatherRoman.sex  = true;
        grandFatherRoman.age  = 90;

        Human grandMather = new Human();
        grandMather.name = "Лена";
        grandMather.sex  = false;
        grandMather.age  = 60;

        Human grandMatherViola = new Human();
        grandMatherViola.name = "Виолетта";
        grandMatherViola.sex  = false;
        grandMatherViola.age  = 65;

        Human father = new Human();
        father.name = "Павел";
        father.father = gradFather;
        father.mother = grandMather;
        father.sex  = true;
        father.age  = 45;

        Human mother = new Human();
        mother.name = "Александра";
        mother.father = grandFatherRoman;
        mother.mother = grandMatherViola;
        mother.sex  = false;
        mother.age  = 30;

        Human child1 = new Human();
        child1.name = "Александра";
        child1.sex  = false;
        child1.age  = 10;
        child1.father = father;
        child1.mother = mother;

        Human child2 = new Human();
        child2.name = "Александр";
        child2.sex  = true;
        child2.age  = 13;
        child2.father = father;
        child2.mother = mother;

        Human child3 = new Human();
        child3.name = "Влад";
        child3.sex  = true;
        child3.age  = 15;
        child3.father = father;
        child3.mother = mother;

        System.out.println(gradFather.toString());
        System.out.println(grandFatherRoman.toString());
        System.out.println(grandMather.toString());
        System.out.println(grandMatherViola.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        String  name;
        Boolean sex;
        int     age;
        Human father;
        Human mother;


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
