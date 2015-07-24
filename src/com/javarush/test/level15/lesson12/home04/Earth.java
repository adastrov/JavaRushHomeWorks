package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Павел on 15.07.2015.
 */
public class Earth implements Planet
{

    private static Earth obj;

    //private Constructor
    private Earth()
    {
    }


    public static Earth getInstance()
    {
        if(obj==null)
        {
            synchronized(Earth.class)
            {
                if(obj == null)
                {
                    obj = new Earth();
                }
            }
        }
        return obj;
    }
}
