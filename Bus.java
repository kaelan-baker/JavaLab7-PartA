package parta;

public class Bus extends Vehicle {
    private int seats;
     //constructor for subclass
     Bus(String colour, String manufacturer, double speed, double topSpeed, int wheels, int year, int seats){
        super(colour, manufacturer, speed, topSpeed, wheels, year);
        this.seats = seats;
    }

    //Setters
    public void setSeats(int seats) {
        this.seats = seats;
    }

    //Getters
    public int getSeats() {
        return seats;
    }


    //accelerate
    public void accelerate(){
        super.accelerate(.5);
    }
  

    @Override
    public String toString() {

        String retStr = super.toString() +" it has "+ seats +" seats";

        return retStr;
    }
}
