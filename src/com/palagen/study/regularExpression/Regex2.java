package com.palagen.study.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Павел on 19.07.2015.
 */
public class Regex2 {

    public static void main(String[] args){

        Pattern p = Pattern.compile("(232323).+(\\1)");
        Matcher m = p.matcher("регулярные выражения это 232323 круто регулярные выражения это круто регулярные выражения это круто якороль " +
                               "Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные 232323 выражения это круто" );
        if(m.find()){
            System.out.println(m.group());
        }
    }

}
