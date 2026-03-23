package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void PrintName(){
        System.out.println(name);
    }

    public void PrintAge(){
        System.out.println(age);
    }
}
