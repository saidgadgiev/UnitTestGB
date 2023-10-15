package Homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Разработайте и протестируйте метод numberInInterval, который проверяет, попадает
// ли переданное число в интервал (25;100).

class HW_Task2Test {

    HW_Task2 test;
    @BeforeEach
    void setUp(){
        test = new HW_Task2();
    }
    @Test
    public void numberInIntervalTrue() {
        boolean result = test.numberInInterval(50);
        assertTrue(result);
    }

    @Test
    public void numberInIntervalFalseMin() {
        boolean result = test.numberInInterval(5);
        assertTrue(result);
    }
    @Test
    public void numberInIntervalFalseMax() {
        boolean result = test.numberInInterval(101);
        assertTrue(result);
    }

}