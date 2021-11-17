package sumofdigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    SumOfDigits sum = new SumOfDigits();

    @Test
    void sumOfDigitsTest () {
        assertEquals(21, sum.getSumOfDigits(123456));
        assertNotEquals(11, sum.getSumOfDigits(12345));
    }
}