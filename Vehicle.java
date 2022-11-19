package parta;

public class Vehicle {
    private String colour;
    private String manufacturer;
    private double speed;
    private double topSpeed;
    private int wheels;
    private int year;

    Vehicle(String colour, String manufacturer, double speed, double topSpeed, int wheels, int year) {
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.topSpeed = topSpeed;
        this.wheels = wheels;
        this.year = year;
    }

    Vehicle(String manufacturer, double topSpeed, int year) {
        this.colour = "unknown";
        this.manufacturer = manufacturer;
        this.speed = 0;
        this.topSpeed = topSpeed;
        this.wheels = 4;
        this.year = year;
    }

    // setters
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // getters
    public String getColour() {
        return colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getSpeed() {
        return speed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getYear() {
        return year;
    }

    // accelerate and brake speed.
    public void accelerate(double inputSpeed) {
        if ((speed + inputSpeed) <= topSpeed) {
            speed += inputSpeed;
        } else {
            speed = topSpeed;
        }
    }

    public void brake(double inputBrake) {
        if ((speed - inputBrake) >= 0) {
            speed -= inputBrake;
        } else {
            speed = 0;
        }
    }

    public String toString() {
        String returnString = (year + " " + colour + " " + manufacturer + " is travelling " + speed
                + "kph with a total speed of " + topSpeed + "kph");
        return returnString;
    }

}