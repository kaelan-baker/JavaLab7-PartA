package parta;

public class Transport extends Vehicle {
    private double payload;

    //constructor for subclass
    Transport(String colour, String manufacturer, double speed, double topSpeed, int wheels, int year, double payload){
        super(colour, manufacturer, speed, topSpeed, wheels, year);
        this.payload = payload;
    }

    //setters
    public void setPayload(double payload) {
        this.payload = payload;
    }

    //getters
    public double getPayload() {
        return payload;
    }

   //accelerate
   public void accelerate(){
    super.accelerate(1);
}


@Override
public String toString() {

    String retStr = super.toString() +" it can carry a payload of "+ payload +" tonnes";

    return retStr;
}
    
}
