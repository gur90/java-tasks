package ship;

public class Ship {
    private String name;
    private boolean isDiesel;
    private boolean isTurbo;
    private int power;

    public Ship(String name, boolean isDiesel, boolean isTurbo, int power) {
        this.name = name;
        this.isDiesel = isDiesel;
        this.isTurbo = isTurbo;
        this.power = power;
    }

    public void calculateCosts() {
        int costOfDiesel = 60;
        int costOfPetrol = 70;
        double costOfFuel = 0;
        if (isDiesel && isTurbo) {
            costOfFuel = getPower() * costOfDiesel * 1.3;
        } else if (isDiesel && !isTurbo) {
            costOfFuel = getPower() * costOfDiesel;
        } else if (!isDiesel && isTurbo) {
            costOfFuel = getPower() * costOfPetrol * 1.3;
        } else if (!isDiesel && !isTurbo) {
            costOfFuel = getPower() * costOfPetrol;
        }
        System.out.println("The cost of fuel: " + costOfFuel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiesel() {
        return isDiesel;
    }

    public void setDiesel(boolean diesel) {
        isDiesel = diesel;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
