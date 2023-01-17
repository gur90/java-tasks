package Bycycle;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(new Bicycle(25, 75, "Merida"));
        bicycles.add(new Bicycle(16, 50, "Silver"));
        bicycles.add(new Bicycle(28, 79, "Mangoost"));
        Collections.sort(bicycles);
        for (Bicycle el : bicycles
        ) {
            System.out.println(el);
        }

        
    }
}
