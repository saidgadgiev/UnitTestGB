package Homework2;

public class Car extends Vehicle{
    public Car(String company, String model, int year) {

        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }
    public void testDrive() { this.speed = 60; }
    public void park() { this.speed = 0; }
    public String getCompany() { return company; }
    public String getModel() { return model; }
    public int getYearRelease() { return yearRelease; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }

}
