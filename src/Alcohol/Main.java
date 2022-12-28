package Alcohol;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrongDrink vodka = new StrongDrink(60.0, "Russian Vodka", 0.5);
        System.out.println(vodka.getAlcoholContent());
        StrongDrink visky = new StrongDrink(30.0, "J Lawsons", 0.5);
        StrongDrink konjak = new StrongDrink(40.0, "Armiansky", 0.5);
        StrongDrink wine = new StrongDrink(8.0, "Lichny", 0.5);
        StrongDrink martini = new StrongDrink(12.0, "Bianco", 0.5);
        SoftDrink juice = new SoftDrink(50.0, "Apple juice", 1.0);
        SoftDrink water = new SoftDrink(0.0, "Water", 1.0);
        SoftDrink mineralW = new SoftDrink(10.0, "Mineral water", 1.0);
        ArrayList<StrongDrink> miniBar = new ArrayList<>();
        ArrayList<Drink> soft = new ArrayList<>();
        miniBar.add(vodka);
        miniBar.add(visky);
        miniBar.add(konjak);
        miniBar.add(wine);
        miniBar.add(martini);
        soft.add(juice);
        soft.add(water);
        soft.add(mineralW);
        System.out.println(miniBar);
        System.out.println("-------");
        System.out.println(filterDrinksStrongerThan20(miniBar));
    }

    public static ArrayList filterDrinksStrongerThan20(ArrayList<StrongDrink> input) {
        boolean temp = true;
        while (temp) {
            temp = false;
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i).getAlcoholContent() < 20) {
                    input.remove(input.get(i));
                    temp = true;
                }
            }
        }
        return input;
    }
}
