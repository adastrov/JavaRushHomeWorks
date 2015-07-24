package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Павел on 15.07.2015.
 */
public class Moon implements Planet
{

    private static Moon obj;

    //private Constructor
    private Moon()
    {
    }


    public static Moon getInstance()
    {
        if(obj==null)
        {
            synchronized(Moon.class)
            {
                if(obj == null)
                {
                    obj = new Moon();
                }
            }
        }
        return obj;
    }
}
