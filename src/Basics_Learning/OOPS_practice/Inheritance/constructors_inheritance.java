package Basics_Learning.OOPS_practice.Inheritance;

public class constructors_inheritance {
    public static void main(String[] args) {

        Child_Derived cd1 = new Child_Derived(1,2,3);
    }
}

class Base1{
    int x;

    public Base1(){
        System.out.println("I am a constructor representing the parent class.");
    }

    public Base1(int x){
        System.out.println("I am a constructor with an argument with x : " + x);
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }
}

class Derived1 extends Base1{
    int y;

    public Derived1(){
        System.out.println("I am constructor representing the derived class.");
    }

    public Derived1(int x,int y){
        super(x);
        System.out.println("This is an overloaded constructor of the derived class with y : " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Child_Derived extends Derived1{
    public Child_Derived(){
        System.out.println("I am the constructor of Child_Derived.");
    }
    public Child_Derived(int x,int y,int z){
        super(x,y);
        System.out.println("This is an overloaded constructor with value of z : " + z);
    }
}