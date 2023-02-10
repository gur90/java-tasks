package homeWorkFuncInter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VarargsInterface varargsInterface = (input, strings) -> {
            ArrayList<String> list = new ArrayList<>(List.of(strings));
            String output = "";
            ArrayList<String> listWithStrings = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).startsWith(input)) {
                    listWithStrings.add(list.get(i));
                }
            }
            output = Collections.max(listWithStrings, Comparator.comparing(String::length));
            return output;
        };
        System.out.println(varargsInterface.returnTheLongest("leo", "leonid", "hello", "kopa", "leon", "leolokol"));
        // System.out.println(ex.myMethod("hello", 6));
        System.out.println(dosmth("hello", 6, (String a, int b) -> a.repeat(b)));
    }

    public static String dosmth(String a, int b, FuncINterfaceString c) {
        return c.myMethod(a, b);
    }
}
