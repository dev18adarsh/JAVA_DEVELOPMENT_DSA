package Projects.ParkingSystem;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter which Vehicle : ");
        Scanner in = new Scanner(System.in);
        String vehicle = in.nextLine();

        if (return_kind(vehicle).equals("car")){
            Car c1 = new Car();
            System.out.println("Enter your size : ");
            String size = in.nextLine();
            c1.setSize(size);
            System.out.println("Enter your time in minutes : ");
            double time = in.nextDouble();
            c1.setTime(time);
            System.out.println("The total bill is : " + c1.SetBillCar());
        }

        if (return_kind(vehicle).equals("bike")){
            Bike b1 = new Bike();

            System.out.println("Enter how much time : ");
            double time = in.nextDouble();
            b1.setTime(time);

            double bill = b1.SetBillBike();
            System.out.println("The total bill is : " + bill);
        }

        if(return_kind(vehicle).equals("Option not found.")){
            System.out.println("This vehicle can't be parked.");
        }

    }
    public static String return_kind(String vehicle){
        if(Objects.equals(vehicle, "car")){
            return "car";
        }
        if(Objects.equals(vehicle, "bike")){
            return "bike";
        }
        return "Option not found.";
    }
}

class Vehicle{
    private double time;
    private String size;

    public void setTime(double time){
        this.time = time;
    }

    public double getTime(){
        return time;
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}

class Car extends Vehicle{
    public double getPricePerMin(String size){
        if(Objects.equals(size, "12 * 8")){
            return 4.575;
        }
        if(Objects.equals(size, "14 * 7")){
            return 5.000;
        }
        if(Objects.equals(size, "15 * 9")){
            return 6.000;

        }
        return 0;
    }

    double pricePerMin = getPricePerMin(getSize());
    double time = getTime();

    public double SetBillCar(){
        return pricePerMin * time;
    }
}

class Bike extends Vehicle{
    double time = getTime();
    public double SetBillBike(){
        return time * 2.985;
    }
}
