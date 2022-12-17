package sport;

public class Sportsman {
    private int age;
    private int experience;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Sportsman() {

    }

    public void say() {

    }

    public Sportsman(int age, int experience) {
        this.age = age;
        this.experience = experience;
    }
}
