package hw.ait.controller;

import hw.ait.model.Band;
import hw.ait.model.Musician;

public class Main {
    public static void main(String[] args) {
        Musician classical = new Musician();
        Musician valera = new Musician("Valera", "Cheburekov", "guitar", "dzhaz", 56);
        System.out.println(valera);
        valera.setName("Korney");
        System.out.println(valera.getMusicianInstrument());
        System.out.println(valera);
        Band babushkinSecret = new Band("Babushkin Secret", new Musician[]{
                new Musician("Vova", "Rostovsky", "baraban", "rock", 23),
                new Musician("Fedya", "Petrov", "guitar", "rock", 25),
                new Musician("Petr", "Ascolthev", "scripka", "classic", 34)
        }
        );
        System.out.println(babushkinSecret);
    }
}
