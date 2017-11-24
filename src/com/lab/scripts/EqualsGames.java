package com.lab.scripts;

import sun.reflect.generics.tree.Tree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    public int equalizer;

    public boolean equals(EqualsGames o) {
        if (o == null) {
            return false;
        }
        if (o.equalizer == this.equalizer) {
            return true;
        }
        return false;
    }

    public EqualsGames clone() {
        EqualsGames clone = new EqualsGames();
        clone.equalizer = this.equalizer;
        return clone;
    }
    
   
    
    void m3() {        
                     
        
    }

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
    }

    void m2() throws Throwable {

        EqualsGames games = new EqualsGames();
        System.out.println(games == games.clone());
        System.out.println(games.equals(games.clone()));
        games.finalize();

    }

    public static void main(String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        EqualsGames eg = new EqualsGames();
        eg.hashCode();
        Method[] methods = eg.getClass().getDeclaredMethods();

        for (Method me : methods) {
            if (!Arrays.asList("equals", "clone", "main").contains(me.getName())) {                
                System.out.println();
                System.out.println("method:" + me.getName());
                me.invoke(eg);
                System.out.println();
            }
        }
        

    }


}
