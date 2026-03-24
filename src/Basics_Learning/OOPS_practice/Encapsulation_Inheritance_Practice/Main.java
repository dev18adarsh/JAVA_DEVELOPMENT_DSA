package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adarsh",23);
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
        Student s1 = new Student("Adarsh",15,34);
        System.out.println(s1.getMarks());
        System.out.println(s1.getName());

        Dog d1 = new Dog();
        Cat cat1 = new Cat();
        Animal a1 = new Animal();

        a1.Sound();
        cat1.Sound();
        d1.Sound();
    }
}
