package parta;

public class Car extends Vehicle{
    private int numberOfDoors;
    private boolean isElectric;

    //constructor for subclass
    Car(String colour, String manufacturer, double speed, double topSpeed, int wheels, int year, int numberOfDoors, boolean isElectric){
        super(colour, manufacturer, speed, topSpeed, wheels, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    //Setters
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    //Getters
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public boolean isElectric() {
        return isElectric;
    }

    //accelerate
    public void accelerate(){
        super.accelerate(2);
    }
    @Override
    public void accelerate(double inputSpeed){
        super.accelerate(inputSpeed);
    }
    @Override
    public String toString() {
        String retStr = super.toString() +" it has "+ numberOfDoors +" doors and is "+ (this.isElectric()?"":"not ") + "electric";

        return retStr;
    }
}
