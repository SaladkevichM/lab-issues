package com.lab.scripts;

import java.util.Collection;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class G {

    public enum Singleton {
        INSTANCE;
    }
    
    public <U extends Number> void inspect(U u) {
        System.out.println("U: " + u.getClass().getName());
    }

    public static double sum(Collection<? extends Number> nums) {
        double d = 0.0;
        for (Number number : nums) {
            d += number.doubleValue();
        }
        return d;
    }

    public static void put(Collection<? super Integer> nums) {
        for (int i = 0; i < 10; i++) {
            nums.add(i);
        }
    }

    public static void main(String[] args) throws ScriptException {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("nashorn");
        
        engine.eval("function sum(a, b) { return a + b; }");
        System.out.println(engine.eval("sum(1, 2);"));

    }

}
