package com.lab.scripts;

public class LabOne {

    static {
        try {
            Object obj = null;
            System.out.println(obj.toString());
        } catch (NullPointerException e) {
            //e.printStackTrace();
        }
    }

    class Inner {
        public Inner() {

        }   
        {
            try {
                Object obj = null;
                System.out.println(obj.toString());
            } catch (NullPointerException e) {
                //e.printStackTrace();
            }
        }
    }

    static class StaticInner {

    }

    public static void main(String... strings) {
        
        LabOne outer = new LabOne();
        
        LabOne.Inner innerObject = outer.new Inner();
        LabOne.StaticInner staticInner = new LabOne.StaticInner();
    }

}
