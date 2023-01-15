package Recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RecursionTest {

    @Test
    @DisplayName("sum of digits 2,3,1")
    void sumOfDigits() {
        Assertions.assertEquals(6, Recursion.sumOfDigits(231));
    }
}