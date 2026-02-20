package Basics_Learning.OOPS_practice.Polymorphism;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.test();

        obj = new B();
        obj.test();

        obj = new C();
        obj.test();
        // ////////////////////////// //
        Computer obj1 = new Laptop();
        obj1.Code();
    }
}

class A{
    public void test(){
        System.out.println("This is a class 'A'.");
    }
}

class B extends A{
    public void test() {
        System.out.println("This is class 'B'.");
    }
}

class C extends A{
    public void test(){
        System.out.println("This is class 'C'.");
    }
}

class Computer{
    public void Code(){
        System.out.println("This can run code.");
    }
}
class Laptop extends Computer{}