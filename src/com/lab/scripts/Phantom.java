package com.lab.scripts;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Phantom {

    public static void main(String[] args) throws InterruptedException {
        
        ReferenceQueue<Object> queue = new ReferenceQueue<Object>();
        
        Object xObject = new Object();                     
        PhantomReference<Object> refImage = new PhantomReference(xObject, queue);
        
        System.out.println("queue poll result: " + queue.poll());
        
        xObject = null;
        System.gc();
        Thread.currentThread().sleep(10_000);
        
        System.out.println("queue poll result: " + queue.poll());
        
    }

}
