package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class Teacher extends Person{
    String subject = "CS";
    int salary = 10000;

    public void PrintSubject(){
        System.out.println(subject);
    }

    public void PrintSalary(){
        System.out.println(salary);
    }
}
