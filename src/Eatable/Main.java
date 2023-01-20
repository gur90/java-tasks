package Eatable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Container container = new Container<>("Camelos", 5.6, new Potatoes("Macho Potato", 3));
        System.out.println(container);
        Container dinner = new Container<>("Peror", 3.9, new Spagetty("Shebekino", 5));
        System.out.println(dinner);
        Container supper = new Container<>("Loush", 1.9, new Brocolli("Mega broc", 2));
        System.out.println(supper);
        container.content.print();
    }
}
