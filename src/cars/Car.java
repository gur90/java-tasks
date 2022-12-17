package cars;

public class Car {
    private String numberPlate;
    private int year;
    private String brand;
    private String model;
    private Tire tire;

    public Car() {

    }

    public Car(String numberPlate, int year, String brand, String model, Tire tire) {
        this.numberPlate = numberPlate;
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.tire = tire;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Car: " + '\n' +
                "numberPlate= " + numberPlate + '\n' +
                "year= " + year + '\n' +
                "brand= " + brand + '\n' +
                "model= " + model + '\n' +
                "tire= [" + tire + ']' + '\n';
    }
}
