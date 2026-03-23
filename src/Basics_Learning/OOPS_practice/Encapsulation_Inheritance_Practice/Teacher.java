package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class Teacher extends Person{
    String subject = "CS";
    int salary = 10000;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
        super();
    }

    public void PrintSubject(){
        System.out.println(subject);
    }

    public void PrintSalary(){
        System.out.println(salary);
    }
}
