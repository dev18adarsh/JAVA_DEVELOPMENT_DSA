package Basics_Learning.OOPS_practice.Encapsulation;

import java.util.Scanner;
public class OOPs_get_set_practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius : ");
        double radius = in.nextInt();

        Circle c1 = new Circle();
        c1.setRadius(radius);

        c1.showArea();
        c1.showPerimeter();
    }
}

class Circle{
    private double radius;
    final double pi = 3.142;

    public void setRadius(double r){
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }

   public double getPerimeter(){
        return 2 * pi * radius;
   }

    public void showArea(){
        System.out.println(getArea());
    }

    public void showPerimeter(){
        System.out.println(getPerimeter());
    }
}
