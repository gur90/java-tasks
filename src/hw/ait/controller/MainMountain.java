package hw.ait.controller;

import hw.ait.model.Mountaineer;
import hw.ait.model.TheGroupOfClimbers;

public class MainMountain {
    public static void main(String[] args) {
        Mountaineer another = new Mountaineer();
        Mountaineer volodya = new Mountaineer("Vladimir", 34, 4, "safety rope");
        System.out.println(volodya);
        volodya.setAge(76);
        volodya.getAge();
        System.out.println(volodya);
        TheGroupOfClimbers climbing = new TheGroupOfClimbers("climbing Brothers", new Mountaineer[]{volodya,
                new Mountaineer("Sergey", 32, 5, "rock shoes"),
                new Mountaineer("Vadim", 24, 1, "magnesia")
        }
        );
        System.out.println(climbing);
        climbing.addMember(new Mountaineer("Natasha", 54, 3, "hook"));
        System.out.println(climbing);
        System.out.println("-----------");
        climbing.findMember("Natasha");
    }
}
