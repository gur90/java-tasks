package cars;

public class Mechanic {
    private String name;
    private double salary;
    private int experience;
    private int account;
    private int amountOfChanging = 0;

    public Mechanic(String name, int salary, int experience, int account) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Mechanic: " +
                "name: " + name +
                ", salary: " + salary +
                ", experience: " + experience + " years" +
                ", account: " + account;
    }

    public int getAmountOfChanging() {
        return amountOfChanging;
    }

    public void setAmountOfChanging(int amountOfChanging) {
        this.amountOfChanging = amountOfChanging;
    }

    public Car changeTires(Car input, Tire newTire) {
        input.setTire(newTire);
        setAmountOfChanging(getAmountOfChanging() + 1);
        setSalary(changeSalary());
        return input;
    }

    public double changeSalary() {
        return getSalary() + 50 * (experience * 1.05);
    }

    public void checkSalary() {
        System.out.println("Salary now: " + getSalary() + " for " + getAmountOfChanging() + " tires changing");
    }
}
