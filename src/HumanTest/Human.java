package HumanTest;

import java.sql.PreparedStatement;

public class Human {
    public int age;

    public Human(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human " +
                "age " + age;
    }

    public String displayAgeCategory() {
        String output = "";
        if (age >= 120) {
            output = null;
        } else if (age >= 70) {
            output = "senior";
        } else if (age >= 18) {
            output = "adult";
        } else if (age >= 12) {
            output = "teenager";
        } else if (age > 2) {
            output = "child";
        } else if (age > 0) {
            output = "infant";
        } else {
            output = null;
        }
        return output;
    }
}
