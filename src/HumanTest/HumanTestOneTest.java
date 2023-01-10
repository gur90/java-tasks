package HumanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTestOneTest {
    @Test
    void displayAgeCategory() {
        String expect = "infant";
        Human child = new Human(2);
        Assertions.assertEquals(expect, child.displayAgeCategory());
    }

    @Test
    void displayAgeCategory2() {
        String expect = "adult";
        Human child = new Human(52);
        Assertions.assertEquals(expect, child.displayAgeCategory());
    }

    @Test
    void displayAgeCategory3() {
        String expect = "adult";
        Human child = new Human(70);
        Assertions.assertEquals(expect, child.displayAgeCategory());
    }

    @Test
    void displayAgeCategory4() {
        String expect = "senior";
        Human child = new Human(70);
        Assertions.assertEquals(expect, child.displayAgeCategory());
    }
}