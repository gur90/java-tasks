package sport;

public class Cyclist extends Sportsman {
    @Override
    public void say() {
        if (getExperience() > 3) {
            System.out.println("I am experienced rider!");
        } else {
            System.out.println("I am rider!");
        }
    }

    public Cyclist() {
    }

    public Cyclist(int age, int experience) {
        super(age, experience);
    }

    @Override
    public String toString() {
        return "Age: " + getAge() + " experience: " + getExperience();
    }
}
