package com.lab.scripts;

import java.util.ArrayList;
import java.util.List;

public class L {

    public enum TT {

        CAT {
            public String makeNoise() {
                return "MEOW!";
            }
        },

        DOG {
            public String makeNoise() {
                return "WOOF!";
            }
        };

        public abstract String makeNoise();

    }

    interface Printable {
        void print(String s);
    }

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance(); // OK
        list.add(elem);

        List<String> ls = new ArrayList<>();
        append(ls, String.class);
    }


}
