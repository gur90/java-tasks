package TestString;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutStringTest {

    @Test
    @DisplayName("check string\"January makes me wanna fly\" ")
    void cutString() {
        String expected = "Janua...";
        String test = "January makes me wanna fly";
        Assertions.assertEquals(expected, CutString.cutString(test));
    }

    @Test
    @DisplayName("check string\"\" ")
    void cutString2() {
        String expected = "enter the string";
        String test = "";
        Assertions.assertEquals(expected, CutString.cutString(test));
    }

    @Test
    @DisplayName("check null  ")
    void cutString3() {
        String expected = "enter the string";
        String test = null;
        Assertions.assertEquals(expected, CutString.cutString(test));
    }

    @Test
    @DisplayName("check short string  ")
    void cutString4() {
        String expected = "Anna";
        String test = "Anna";
        Assertions.assertEquals(expected, CutString.cutString(test));
    }
}