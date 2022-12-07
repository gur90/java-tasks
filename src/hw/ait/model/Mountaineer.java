package hw.ait.model;

public class Mountaineer {
    private String name;
    private int age;
    private int level;
    private String equipment;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEquipment() {
        return this.equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Mountaineer() {

    }

    public Mountaineer(String name, int age, int level, String equipment) {
        this.name = name;
        this.age = age;
        this.level = level;
        this.equipment = equipment;
    }

    public String toString() {
        return "Mountaineer name: " + this.name + ", \n age: " + this.age + ", \n level: " + this.level + ", \n equipment: " + this.equipment + "\n";
    }
}
