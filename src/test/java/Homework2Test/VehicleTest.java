package Homework2Test;

import Homework2.Car;
import Homework2.Motorcycle;
import Homework2.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        car = new Car("Lada", "Granta", 2015);
        motorcycle = new Motorcycle("Honda", "Sport", 2000);
    }

    @Test
    @DisplayName("Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).")
    void testCarInstanceOf() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Проверить, что объект Car создается с 4-мя колесами.")
    void testNumWheelsFor() {
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    @DisplayName("Проверить, что объект Motorcycle создается с 2-мя колесами.")
    void testNumWheelsTwo() {
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    @DisplayName(" Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).")
    void testDriveCar() {
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    @DisplayName(" Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).")
    void testDriveMotorcycle() {
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    @DisplayName("Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0)")
    void testParkCar() {
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    @DisplayName("Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).")
    void testParkMotorcycle() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(car.getSpeed(), 0);
    }

}
