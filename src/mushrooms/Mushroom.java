package mushrooms;

public abstract class Mushroom {
    private String color;
    private int height;
    private boolean isEdible;
    private String placeWhereItGrows;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHight() {
        return height;
    }

    public void setHight(int hight) {
        this.height = hight;
    }

    public boolean getIsEdible() {
        return isEdible;
    }

    public void setIsEdible(boolean edible) {
        isEdible = edible;
    }

    public String getPlaceWhereItGrows() {
        return placeWhereItGrows;
    }

    public void setPlaceWhereItGrows(String placeWhereItGrows) {
        this.placeWhereItGrows = placeWhereItGrows;
    }

    public Mushroom(String color, int hight, boolean isEdible, String placeWhereItGrows) {
        this.color = color;
        this.height = hight;
        this.isEdible = isEdible;
        this.placeWhereItGrows = placeWhereItGrows;
    }

    @Override
    public String toString() {
        return "Mushroom" +
                "color: '" + color + '\'' +
                ", hight: " + height +
                ", isEdible: " + isEdible +
                ", placeWhereItGrows: '" + placeWhereItGrows + '\'';
    }

    public void printInfo() {

    }
}
