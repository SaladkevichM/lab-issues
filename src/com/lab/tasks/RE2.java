package com.lab.tasks;

import java.sql.Array;
import java.text.FieldPosition;
import java.util.Arrays;

public class RE2 {
    
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * (fact(n - 1));
        }
    }
    
    public static int factLoop(int n) {
      int result = 1;      
      for(int i = n; i > 0; i--) {
          result = result * i;
      }      
      return result;
    }
    
    public static int[] fi(int n) {
        
        int[] fi = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(i > 1) {
                fi[i] = fi[i - 2] + fi[i - 1];
            } else {
                fi[i] = i;
            }
        }        
        
        return fi;
        
    }
    
    /*
    public Object traverse(Object node, String data) {
        if(node.toString() == data) {
            return root;
        }
        if(node.left != null) {
            traverse(node.left, data);
        }
        if(node.right != null) {
            traverse(node.right, data);
        }
    }*/
    
    public static void main(String[] args) {
         System.out.println(fact(5));
         System.out.println(factLoop(5));
         System.out.println(Arrays.toString(fi(10)));
    }

}
