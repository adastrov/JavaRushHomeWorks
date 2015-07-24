package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Павел on 15.07.2015.
 */
public class Sun implements Planet
{

    private static Sun obj;

    //private Constructor
    private Sun()
    {
    }


    public static Sun getInstance()
    {
        if(obj==null)
        {
            synchronized(Sun.class)
            {
                if(obj == null)
                {
                    obj = new Sun();
                }
            }
        }
        return obj;
    }
}