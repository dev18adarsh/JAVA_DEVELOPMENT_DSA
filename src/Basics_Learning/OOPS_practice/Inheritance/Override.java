package Basics_Learning.OOPS_practice.Inheritance;

public class Override {
    public static void main(String[] args) {
        MultiWheeler m1 = new MultiWheeler();
        m1.Run();
        m1.ShowWheels(4);
    }
}

class Vehicle{
    public void Run(){
        System.out.println("Vehicle is running.");
    }
    public void ShowWheels(int n){
        System.out.println("No of Wheels : " + n);
    }
}

class MultiWheeler extends Vehicle{
    public void ShowWheels(int n){
        System.out.println("No of Wheels is : " + n);
        if(n == 3){
            System.out.println("Auto");
        }
        if(n == 4){
            System.out.println("Car");
        }
    }
}