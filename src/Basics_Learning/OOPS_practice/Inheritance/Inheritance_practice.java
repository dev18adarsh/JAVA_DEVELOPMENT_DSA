package Basics_Learning.OOPS_practice.Inheritance;

public class Inheritance_practice {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        AdvCalc ac1 = new AdvCalc();
        VeryAdvCalc vac1 = new VeryAdvCalc();

        System.out.println(c1.add(56,456));
        System.out.println(c1.sub(69,2));

        System.out.println(ac1.div(69,3));
        System.out.println(ac1.multiply(67,90));

        int add_adv = ac1.add(45,45);
        int sub_adv = ac1.sub(67,-2);

        System.out.println(add_adv);
        System.out.println(sub_adv);

        System.out.println(vac1.power(34,2));
    }
}

class Calculator{
    public int add(int a,int b){
        return a + b;
    }

    public int sub(int a,int b){
        return a - b;
    }
}

class AdvCalc extends Calculator{
    public int multiply(int a,int b){
        return a * b;
    }

    public int div(int a,int b){
        return a / b;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double power(int a,int b){
        return Math.pow(a,b);
    }
}
