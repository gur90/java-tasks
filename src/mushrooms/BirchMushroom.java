package mushrooms;

public class BirchMushroom extends Mushroom {
    public BirchMushroom(String color, int hight, boolean isEdible, String placeWhereItGrows) {
        super(color, hight, isEdible, placeWhereItGrows);
    }

    @Override
    public String toString() {
        return "BirchMushroom: " + getColor() + " " + getPlaceWhereItGrows() + " " + getHight() + " " + getIsEdible();
    }

    @Override
    public void printInfo() {
        System.out.println("the soup from me is amazing!!!");
    }
}
