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
    }
}
