package parta;

import java.util.Scanner;

//TODO: Make it so that the car can't have a negative speed on setup, make sure the top speed is greater than 0.
public class VehicleTest {
    public static void main(String[] args) {
        String inColour;
        String inManufacturer;
        String inType;
        double inSpeed;
        double inTopSpeed;
        int inWheels;
        int inYear;
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Let's build a vehicle!\n");
        System.out.printf("What colour is the vehicle? : ");
        inColour = keyboard.next();
        System.out.printf("What manufacturer made the vehicle? : ");
        inManufacturer = keyboard.next();
        System.out.printf("How fast is the vehicle currently going? : ");
        inSpeed = keyboard.nextDouble();
        System.out.printf("What is the vehicle's top speed? : ");
        inTopSpeed = keyboard.nextDouble();
        System.out.printf("How many wheels does the vehicle have? : ");
        inWheels = keyboard.nextInt();
        System.out.printf("What year was the %s %s made? : ", inColour, inManufacturer);
        inYear = keyboard.nextInt();
        System.out.printf("\n");

        System.out.printf("Alright! what type of car is it?\n");
        System.out.printf("You can choose from this list.\n");
        System.out.printf("Car, Bus, Transport, Sports Car, Pickup\n");

        System.out.printf("\n");


        inType = keyboard.next();
        inType = inType.toLowerCase();
        char type = inType.charAt(0);


        switch (type) {
            case 'c':// Car
                int inDoors;
                String inStrElectric;
                Boolean inElectric;
                System.out.printf("How many doors are on the car? : ");
                inDoors = keyboard.nextInt();
                System.out.printf("Is the car electric? (yes/no) : ");
                inStrElectric = keyboard.next();
                inStrElectric = inStrElectric.toLowerCase();
                if (inStrElectric == "yes") {
                    inElectric = true;
                } else {
                    inElectric = false;
                }

                
                Car o1 = new Car(inColour, inManufacturer, inSpeed, inTopSpeed, inWheels, inYear, inDoors, inElectric);

                System.out.printf("Use \"a\" to Accelerate, \"b\" to Brake, any other key to quit.\n");
                System.out.printf("The %5s is %-12s| %f | ", "Car", "Idling", o1.getSpeed());
                String val = keyboard.next();
                while (val.equals("a") || val.equals("b")) {
                    if (val.equals("a")) {// accelerate
                        o1.accelerate();
                        System.out.printf("The %5s is %12s| %3f | ", "Car", "Accelerating", o1.getSpeed());
                        val = keyboard.next();
                    } else if (val.equals("b")) {// brake
                        System.out.printf("%25s|:", "Brake by how much?");
                        double brakeVal = keyboard.nextDouble();
                        o1.brake(brakeVal);
                        System.out.printf("The %-5s is %12s| %3f | ", "Car", "Braking", o1.getSpeed());
                        val = keyboard.next();
                    }
                }
                System.out.println(o1.toString());
                break;


            case 'b':// Bus
                int inSeats;
                System.out.printf("How many seats are on the bus? ");
                inSeats = keyboard.nextInt();
                Bus o2 = new Bus(inColour, inManufacturer, inSpeed, inTopSpeed, inWheels, inYear, inSeats);
                System.out.printf("Use \"a\" to Accelerate, \"b\" to Brake, any other key to quit.\n");
                System.out.printf("The %5s is %-12s| %f | ", "Car", "Idling", o2.getSpeed());
                val = keyboard.next();


                while (val.equals("a") || val.equals("b")) {
                    if (val.equals("a")) {// accelerate
                        o2.accelerate();
                        System.out.printf("The %5s is %12s| %3f | ", "Bus", "Accelerating", o2.getSpeed());
                        val = keyboard.next();
                    } else if (val.equals("b")) {// brake
                        System.out.printf("%25s|:", "Brake by how much?");
                        double brakeVal = keyboard.nextDouble();
                        o2.brake(brakeVal);
                        System.out.printf("The %-5s is %12s| %3f | ", "Bus", "Braking", o2.getSpeed());
                        val = keyboard.next();
                    }
                }
                System.out.println(o2.toString());
                break;


            case 't':// Transport
                int inPayload;
                System.out.printf("How much payload can the transport carry? ");
                inPayload = keyboard.nextInt();
                Transport o3 = new Transport(inColour, inManufacturer, inSpeed, inTopSpeed, inWheels, inYear,
                        inPayload);


                System.out.printf("Use \"a\" to Accelerate, \"b\" to Brake, any other key to quit.\n");
                System.out.printf("The %5s is %-12s| %f | ", "Transport", "Idling", o3.getSpeed());
                val = keyboard.next();
                while (val.equals("a") || val.equals("b")) {
                    if (val.equals("a")) {// accelerate
                        o3.accelerate();
                        System.out.printf("The %5s is %12s| %3f | ", "Transport", "Accelerating", o3.getSpeed());
                        val = keyboard.next();
                    } else if (val.equals("b")) {// brake
                        System.out.printf("%25s|:", "Brake by how much?");
                        double brakeVal = keyboard.nextDouble();
                        o3.brake(brakeVal);
                        System.out.printf("The %-5s is %12s| %3f | ", "Transport", "Braking", o3.getSpeed());
                        val = keyboard.next();
                    }
                }
                System.out.println(o3.toString());
                break;


            case 'p':// Pickup
                System.out.printf("How many doors are on the pickup? : ");
                inDoors = keyboard.nextInt();
                System.out.printf("Is the pickup electric? (yes/no) : ");
                inStrElectric = keyboard.next();
                inStrElectric = inStrElectric.toLowerCase();
                if (inStrElectric == "yes") {
                    inElectric = true;
                } else {
                    inElectric = false;
                }


                Pickup o4 = new Pickup(inColour, inManufacturer, inSpeed, inTopSpeed, inWheels, inYear, inDoors,
                        inElectric);
                System.out.printf("The %5s is %-12s| %f | ", "Pickup", "Idling", o4.getSpeed());
                val = keyboard.next();
                while (val.equals("a") || val.equals("b")) {
                    if (val.equals("a")) {// accelerate
                        o4.accelerate();
                        System.out.printf("The %5s is %12s| %3f | ", "Pickup", "Accelerating", o4.getSpeed());
                        val = keyboard.next();
                    } else if (val.equals("b")) {// brake
                        System.out.printf("%25s|:", "Brake by how much?");
                        double brakeVal = keyboard.nextDouble();
                        o4.brake(brakeVal);
                        System.out.printf("The %-5s is %12s| %3f | ", "Pickup", "Braking", o4.getSpeed());
                        val = keyboard.next();
                    }
                }
                System.out.println(o4.toString());
                break;


            case 's':// Sports Car
                System.out.printf("How many doors are on the sports car? : ");
                inDoors = keyboard.nextInt();
                System.out.printf("Is the sports car electric? (yes/no) : ");
                inStrElectric = keyboard.next();
                inStrElectric = inStrElectric.toLowerCase();
                if (inStrElectric == "yes") {
                    inElectric = true;
                } else {
                    inElectric = false;
                }


                SportsCar o5 = new SportsCar(inColour, inManufacturer, inSpeed, inTopSpeed, inWheels, inYear, inDoors,
                        inElectric);
                System.out.printf("The %5s is %-12s| %f | ", "SportsCar", "Idling", o5.getSpeed());
                val = keyboard.next();
                while (val.equals("a") || val.equals("b")) {
                    if (val.equals("a")) {// accelerate
                        o5.accelerate();
                        System.out.printf("The %5s is %12s| %3f | ", "SportsCar", "Accelerating", o5.getSpeed());
                        val = keyboard.next();
                    } else if (val.equals("b")) {// brake
                        System.out.printf("%25s|:", "Brake by how much?");
                        double brakeVal = keyboard.nextDouble();
                        o5.brake(brakeVal);
                        System.out.printf("The %-5s is %12s| %3f | ", "SportsCar", "Braking", o5.getSpeed());
                        val = keyboard.next();
                    }
                }
                System.out.println(o5.toString());
                break;


            default:
                System.out.println("ERROR in switchcase");
                break;
        }
    }
}
