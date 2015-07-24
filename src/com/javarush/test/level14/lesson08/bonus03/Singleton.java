package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Admin on 14.07.2015.
 */
final public class Singleton {

   private static Singleton singleton = null;

   private Singleton()
    {
        singleton = this;
    }

    static Singleton getInstance()
    {
        if (singleton == null)
        {
            new Singleton();
            return singleton;
        }else
        {
            return singleton;
        }
    }

}
