package com.lab.scripts;

import java.util.Map;
import java.util.WeakHashMap;

public class Weak {

    public static void main(String[] args) throws InterruptedException {

        Map map = new WeakHashMap();

        Object obj = new Object(); // создаём объект
        map.put(obj, "object"); // кладём его в мапу

        System.out.println(map.size()); // в мапе один элемент

        obj = null; // чистим ссылку

        System.gc(); // играемся со сборщиком мусора
        System.runFinalization();
        System.out.println(map.size()); // мапа должна стать пустой

    }

}
