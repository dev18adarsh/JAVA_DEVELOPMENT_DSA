package Projects.TaxiBookingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Want to book a ride : ");
        String ch = in.nextLine();

        String[] choices = {"Car", "Bike", "Auto"};

        if (ch.equals("yes")) {
            System.out.println("What kind of ride : ");
            System.out.println("The choices are : ");
            for (String choice : choices) {
                System.out.println(choice);
            }
            System.out.println("Enter your choice : ");
            String choice = in.nextLine();

            switch (choice) {
                case "Bike":
                    Bike b1 = new Bike();

                    System.out.println("Enter your distance_bike : ");
                    double distance_bike = in.nextDouble();
                    b1.setDistance(distance_bike);

                    //setting max wait time.
                    System.out.println("Set your max waiting time in minutes : ");
                    double max_time_bike = in.nextDouble();
                    b1.setWaiting_time(max_time_bike);

                    //setting wait time fare.
                    b1.setWaiting_fare(2.4575);

                    //setting fare per km
                    b1.setPrice_per_km(23.25);
                    System.out.println("The total bill is : " + b1.TotalFare());
                    break;

                case "Car":
                    Car c1 = new Car();
                    System.out.println("Enter your distance : ");
                    double distance_car = in.nextDouble();
                    c1.setDistance(distance_car);

                    //setting max wait time.
                    System.out.println("Set your max waiting time in minutes : ");
                    double max_time_car = in.nextDouble();
                    c1.setWaiting_time(max_time_car);

                    //setting wait time fare.
                    c1.setWaiting_fare(5.5);

                    //setting fare per km
                    c1.setPrice_per_km(77.25);
                    System.out.println("The total bill is : " + c1.TotalFare());
                    break;

                case "Auto":
                    Auto a1 = new Auto();
                    System.out.println("Enter your distance : ");
                    double distance_auto = in.nextDouble();
                    a1.setDistance(distance_auto);
                    //setting max wait time.
                    System.out.println("Set your max waiting time in minutes : ");
                    double max_time_auto = in.nextDouble();
                    a1.setWaiting_time(max_time_auto);

                    //setting wait time fare.
                    a1.setWaiting_fare(3.385);

                    //setting fare per km
                    a1.setPrice_per_km(58.25);
                    System.out.println("The total bill is : " + a1.TotalFare());
                    break;
            }
        }
    }
}
class Vehicle{
    double distance;
    double price_per_km;
    double waiting_time;
    double waiting_fare;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setPrice_per_km(double distance){
        this.price_per_km = distance;
    }

    public double getPrice_per_km() {
        return price_per_km;
    }

    public void setWaiting_time(double time){
        this.waiting_time = time;
    }

    public double getWaiting_time() {
        return waiting_time;
    }

    public void setWaiting_fare(double fare){
        this.waiting_fare = fare;
    }

    public double getWaiting_fare() {
        return waiting_fare;
    }

    public double TotalFare(){
        return (getDistance() * getPrice_per_km()) + (getWaiting_time() * getWaiting_fare());
    }
}

class Bike extends Vehicle{}
class Car extends Vehicle{}
class Auto extends Vehicle{}

