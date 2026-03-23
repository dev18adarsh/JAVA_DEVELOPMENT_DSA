package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.PrintAge();
        p1.PrintName();

        Teacher t1 = new Teacher();
        t1.PrintName();
        t1.PrintAge();
        t1.PrintSalary();
        t1.PrintSubject();

        Car c1 = new Car();
        c1.setBrand("Ferrari");
        c1.setSpeed(350);

        System.out.println(c1.getBrand());
        System.out.println(c1.getSpeed());
    }
}
