package Basics_Learning.OOPS_practice.Inheritance;

public class this_super {
    public static void main(String[] args) {
        C2 c2 = new C2(45);
        c2.Greet();

        C2 c3 = new C2();
        c3.Greet();
    }
}

class C1{
    public C1() {
        System.out.println("Hello I am C1");
    }

    public C1(int a) {
        System.out.println("Hello I am C1 with a : " + a);
    }

    public void Greet(){
        System.out.println("Hello");
    }
}

class C2 extends C1{
    public C2(){
        super();
        System.out.println("Hello I am C2");
    }

    public C2(int a){
        super(34);
        System.out.println("C2 with a : " + a);
    }
}