package de.ait.Controller;

import de.ait.Array.tools.ArrayTools;
import de.ait.StringTools.StringTools;
import de.ait.model.Dog;
import de.ait.specialTools.SpecialTools;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog bobby = new Dog();
        System.out.println(bobby.age);
        System.out.println(bobby.name);
        bobby.name = "Bobby";
        bobby.age = 5;
        bobby.weight = 10;
        bobby.breed = "french bulldog";
        bobby.isAgressive = false;
        bobby.color = "white";
        System.out.println(bobby.name);
        bobby.displayDog();
        Dog rex = new Dog("Rex");
        System.out.println((rex.name));
        Dog tuzic = new Dog("Tuzic", 16);
        tuzic.displayDog();
        Dog kusya = new Dog("Kusya", 3, 5.6, false, "labrador");
        kusya.displayDog();
        //dinner();
        //takeASip(24);
        // String[] array = new String[]{"apple", "place", "dog", "plane"};
        // System.out.println(Arrays.toString(SpecialTools.cipherP(array)));
        /*String[] input1 = new String[]{"feat", "cloud"};
        System.out.println(Arrays.toString(StringTools.upArr(input1)));
        System.out.println(StringTools.whisper("HELLO"));
        //helloGay("Artur", 58);
        int[] input = new int[]{1, 2, 87, 77};
        ArrayTools.print(input);*/
    }

    private static void helloGay(String name, int age) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Hello, my dear friend %s! Are you sure that you are %d years old?\n", name, age);
        String answer = input.next();
        if (answer.equals("yes")) {
            System.out.println("Welcome!");
        } else if (answer.equals("no")) {
            System.out.println("Think carefully!");
        } else {
            System.out.println("You did not hit the right buttons.");
        }
    }

    private static void takeASip(int button) {
        switch (button) {
            case 1:
                System.out.println("Take your tea, please");
                break;
            case 2:
                System.out.println("Your cofee, nice man!");
                break;
            case 3:
                System.out.println("Would you like to drink some wine? Please, keep calm and take a sip!");
                break;
            case 4:
                System.out.println("It is a nice day to drink latte!");
                break;
            case 5:
                System.out.println("We cooked delicious cappuccino for you!");
                break;
            default:
                System.out.println("Error! try again, please!");
                break;
        }
    }

    public static void dinner() {
        int guestNumber = 13;
        switch (guestNumber) {
            case 0:
                System.out.println("I eat alone, it so sad");
                break;
            case 1:
                System.out.println("We will eat salade. " +
                        "And maybe drink some wine");
                break;
            case 2:
                System.out.println("Let's cook some pasta");
                break;
            case 3:
                System.out.println("We will cook a duck");
                break;
            case 7:
                System.out.println("let's go to the church");
                break;
            case 13:
                System.out.println("I will cook a black rooster");
                break;
            default:
                System.out.println("Lets go to the restaurant");
                break;
        }

    }
}
