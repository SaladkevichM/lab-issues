package com.lab.scripts;


import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class TreeMappy {

    public static void main(String[] args) throws InterruptedException {

        /* This is how to declare TreeMap */
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();      
        
        Map map = new WeakHashMap(); 
        Object obj = new Object(); // создаём объект 
        map.put(obj, "object"); // кладём его в мапу 
        System.out.println(map.size()); // в мапе один элемент 
        obj = null; // чистим ссылку 
        System.gc(); // играемся со сборщиком мусора 
        System.runFinalization(); 
        System.out.println(map.size()); // мапа должна стать пустой 

        
        /* Adding elements to TreeMap */
        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");

        /* Display content using Iterator */
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }

}
