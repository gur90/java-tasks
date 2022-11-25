package ait.controller;

import ait.model.Chiken;

public class Main {
    public static void main(String[] args) {
        Chiken coco = new Chiken("Cocosha", 5.8, true,56.7);
        coco.say();
        int eggs= coco.chickenEggs(5);
        System.out.println("I have "+ eggs + " eggs for you.");
        coco.chickenTalking();
        System.out.println("***************************");
        Chiken kudax = new Chiken("Kudaxtalka", 4, true, 87.9);
        Chiken cock = new Chiken("Petushara", 10, false, 100);
        kudax.say();
        cock.say();
        System.out.println(cock.getCost());
        cock.setCost(125);
        System.out.println("new cost:  "+ cock.getCost());
    }
}
