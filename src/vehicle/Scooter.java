package vehicle;

public class Scooter extends Vehicle {
    private int numberOfWheels = 3;
    private boolean isSignal = true;
    private boolean isFlashLight = true;

    public Scooter() {

    }

    public Scooter(double speed, int capacity, double weight, int numberOfWheels, boolean isSignal, boolean isFlashLight) {
        super(speed, capacity, weight);
        this.numberOfWheels = numberOfWheels;
        this.isSignal = isSignal;
        this.isFlashLight = isFlashLight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isSignal() {
        return isSignal;
    }

    public void setSignal(boolean signal) {
        isSignal = signal;
    }

    public boolean isFlashLight() {
        return isFlashLight;
    }

    public void setFlashLight(boolean flashLight) {
        isFlashLight = flashLight;
    }

    @Override
    public String toString() {
        return "Scooter \n" +
                "numberOfWheels=" + numberOfWheels +
                ", Signal: " + (isSignal ? "yes" : "no") +
                ", FlashLight: " + (isFlashLight ? "yes" : "no") + ", Speed: " + super.getSpeed() + ", Capacity: " +
                super.getCapacity() + ", Weight: " + super.getWeight();
    }
}
