package Projects.Calculator;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        System.out.println("Enter another number : ");
        int b = in.nextInt();
        System.out.println("Enter your operator : ");
        char ch = in.next().charAt(0);

        if (ch == '+') {
            System.out.println("The addition of the numbers is : " + add(a,b));
        }
        else if(ch == '-'){
            System.out.println("The difference of the numbers is : " + sub(a,b));
        }
        else if(ch == '*'){
            System.out.println("The multiplication of the numbers is : " + mul(a,b));
        }
        else if(ch == '/'){
            System.out.println("The division of the numbers is : " + div(a,b));
        }
        else{
            System.out.println("Enter a valid character.");
        }
    }
    static int add(int a,int b){
        return a + b;
    }

    static int sub(int a , int b){
        return a - b;
    }

    static int mul(int a,int b){
        return a * b;
    }
    static int div(int a,int b){
        return a / b;
    }
}
