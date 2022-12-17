package sport;

public class Skier extends Sportsman {
    private String typeSki = "running";

    public String getTypeSki() {
        return typeSki;
    }

    public void setTypeSki(String typeSki) {
        this.typeSki = typeSki;
    }

    public Skier() {

    }

    public Skier(int age, int experience, String typeSki) {
        super(age, experience);
        this.typeSki = typeSki;
    }

    @Override
    public void say() {
        if (getExperience() > 3 && getTypeSki().equalsIgnoreCase("mountain")) {
            System.out.println("I am experienced mountain skier.");
        } else {
            System.out.println("I am skier.");
        }
    }

    @Override
    public String toString() {
        return String.format("Age: %d, experience: %d, type: %s",
                getAge(), getExperience(), typeSki);
    }
}
