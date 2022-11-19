package parta;

public class Pickup extends Car{
    Pickup(String colour, String manufacturer, double speed, double topSpeed, int wheels, int year, int numberOfDoors, boolean isElectric){
        super(colour, manufacturer, speed, topSpeed, wheels, year, numberOfDoors, isElectric);

    }
    public void accelerate(){
        super.accelerate(1.5);
    }
}
