package Basics_Learning.OOPS_practice.Practice_Polymorphism;

import Basics_Learning.OOPS_practice.Polymorphism.AccessModifiers;

public class main {
    public static void main(String[] args) {
        AccessModifiers am1 = new AccessModifiers();
        am1.a = 8;
        test1 t1 = new test1();
        System.out.println(t1.no);
        t1.Show();
        am1.show();
    }
}
