package Climbing;

import java.util.Arrays;

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
        climbing.addMember(new Mountaineer("Anna", 32, 2, "magnesia"));
        climbing.addMember(new Mountaineer("Julia", 30, 3, "rock shoes"));
        climbing.addMember(new Mountaineer("Alex", 35, 5, "safety rope"));
        System.out.println("-----------");
        System.out.println(Arrays.toString(climbing.getAllByEquipment("rock shoes")));
        System.out.println("==========");
        climbing.sortByAge();
        System.out.println("==========");
        System.out.println(Arrays.toString(climbing.sortByLevel()));
        System.out.println("____DELETE______");
        System.out.println(Arrays.toString(climbing.deleteByName("vadim")));
    }
}
