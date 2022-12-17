package mushrooms;

public class FlyAgaric extends Mushroom {
    public FlyAgaric(String color, int height, boolean isEdible, String placeWhereItGrows) {
        super(color, height, isEdible, placeWhereItGrows);
    }

    @Override
    public void printInfo() {
        if (getIsEdible()) {
            System.out.println("It is ok, you can cook something from me");
        } else {
            System.out.println("Do not touch me!!!");
        }
    }

    @Override
    public String toString() {
        return "FlyAgaric: " + getColor() + " " + getPlaceWhereItGrows() + " " + getHight() + " " + getIsEdible();
    }
}
