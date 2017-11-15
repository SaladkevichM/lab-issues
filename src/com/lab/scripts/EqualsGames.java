package com.lab.scripts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * При использование выражения: String s1 = ""; - в пуле создаётся запись "", при повторном вызове: String s2=""; -
 * ссылка s2 уже ссылается га существующую запись в пуле "", в результате : s1==s2 ( так как ссылаются на одну запись в
 * пуле ) и s1.equals(s2); При вызове String s3=new String(""); в куче создается новый объект, который ссылается на
 * заново созданное место в пуле и уже s1==s2 выдаст false.
 * 
 * @author Mikita_Saladkevich
 *
 */

public class EqualsGames {

    void m1() {

        String s1 = "1";
        String s2 = "1";
        String s3 = new String("1");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s3.intern());
        System.out.println(s1.equals(s3));

        System.out.println();

        System.out.println(s1.hashCode() + " ^ " + s2.hashCode());
        System.out.println(s1.hashCode() + " ^ " + s3.hashCode());

        System.out.println();

    }

    public static void main(String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        EqualsGames eg = new EqualsGames();
        Method[] methods = eg.getClass().getDeclaredMethods();

        for (Method me : methods) {
            if (me.getName() != "main") {
                me.invoke(eg);
            }
        }

    }


}
