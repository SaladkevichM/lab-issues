package com.lab.scripts;

public final class Singleton {
    
    private static volatile Singleton instance;
    public static String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }
    
    public static void main(String ...strings) {
        Singleton s = Singleton.getInstance("1");        
        ESingleton.INSTANCE.doTask();
    }
    
}
