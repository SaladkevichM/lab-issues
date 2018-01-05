package com.lab.scripts;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class Singleton {
    
    @XmlElement
    public static Test instance = new Test();

    @XmlElement
    private String name;

    public Singleton() {
        name = "some_value";
    }
    
    /*
     * 
     *  
     ==== non-lazy 
    
    public class Singleton {
        public static final Singleton INSTANCE = new Singleton();
    }
    
    public enum Singleton {
        INSTANCE;
    }
    
    ==== lazy 
    
    Synchronized Accessor
    
    public class Singleton {
    
    private static Singleton instance;
    
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
            return instance;
        }
    }
    
    Double Checked Locking & volatile    
    
    public class Singleton {
        private static volatile Singleton instance;
    
        public static Singleton getInstance() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }
        return localInstance;
    }
}
    
    
    with holder
    
    public class Singleton {
        
    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }
        
    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}

    */
    

}
