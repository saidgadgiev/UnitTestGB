package Seminar_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
//    @Test
//    public void testAddition() {
//        Calculator calculator = new Calculator();
//        int result = calculator.add(2, 3);
//        assertEquals(5, result);
//    }

    @Test
    public void testAddAcceptsIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testdivideAcceptsdouble() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        assertThat(result).isEqualTo(2);
    }
    @Test
    public void testAddDoesNotAcceptChar() {
        Calculator calculator = new Calculator();
        try {
            char invalidChar = 'a';
            int result = calculator.add(2, invalidChar);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage()).isEqualTo("Input must be an integer.");
        }
    }
}
