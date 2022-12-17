package mushrooms;

public class Chanterelle extends Mushroom {
    public Chanterelle(String color, int hight, boolean isEdible, String placeWhereItGrows) {
        super(color, hight, isEdible, placeWhereItGrows);
    }

    @Override
    public String toString() {
        return "Chanterelle: " + getColor() + " " + getPlaceWhereItGrows() + " " + getHight() + " " + getIsEdible();
    }

    @Override
    public void printInfo() {
        if (getColor().equalsIgnoreCase("red")) {
            System.out.println("The color of this mushroom is great!!!");
        } else {
            System.out.println("I am a good mushroom.");
        }
    }
}
