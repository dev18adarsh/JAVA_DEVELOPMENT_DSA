package Basics_Learning.OOPS_practice.Encapsulation_Inheritance_Practice;

public class Student {
    private String name;
    private int marks;

    public String getName(){
        return name;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks = marks;
        }
        else{
            System.out.println("Enter valid marks.");
        }
    }
}
