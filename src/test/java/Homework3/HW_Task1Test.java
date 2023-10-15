package Homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет,
// является ли переданное число четным или нечетным. (код приложен в презентации)
class HW_Task1Test {
    HW_Task1 number;
    @BeforeEach
    void setUp(){
        number = new HW_Task1();
    }


    // Положительное четное число
    @Test
    public void evenOddNumberPositiveEvenNumberTrue() {
        boolean result = number.evenOddNumber(4);
        assertTrue(result);
    }
    // Положительное нечетное число
    @Test
    public  void evenOddNumbePositiveNumberFalse() {
        boolean result = number.evenOddNumber(5);
        assertTrue(result);
    }
    // Отрицательное четное число.
    @Test
    public  void evenOddNumberNegativNumberTrue() {
        boolean result = number.evenOddNumber(-6);
        assertTrue(result);
    }
    //Отрицательное нечетное число
    @Test
    public  void evenOddNumberNegativNumberFalse() {
        boolean result = number.evenOddNumber(-9);
        assertTrue(result);
    }
    // ноль
    @Test
    public  void evenOddNumberZerroTrue() {
        boolean result = number.evenOddNumber(0);
        assertTrue(result);
    }

}

