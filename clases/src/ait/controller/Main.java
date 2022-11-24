package ait.controller;

import ait.model.Chiken;

public class Main {
    public static void main(String[] args) {
        Chiken coco = new Chiken("Cocosha", 5.8, true);
        coco.say();
        int eggs= coco.chickenEggs(5);
        System.out.println("I have "+ eggs + " eggs for you.");
        coco.chickenTalking();
        System.out.println("***************************");
        Chiken kudax = new Chiken("Kudaxtalka", 4, true);
        Chiken cock = new Chiken("Petushara", 10, false);
        kudax.say();
        cock.say();
    }
}