package Basics_Learning.algo;
import java.util.*;
public class recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = in.nextInt();
        //printing the factorial by recursive approach.
        System.out.println("The factorial of the number is : " + factorial(a));
        //printing the factorial by using iterative approach.
        System.out.println("The factorial found by iterative approach is : " + iterative_Factorial(a));
    }

    //recursive approach :-
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            n = n * factorial(n-1);
        }
        return n;
    }


    //found the factorial using iterative approach.
    static int iterative_Factorial(int n) {
        int product = 1;
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            for (int i = 2; i <= n; i++) {
                product *= i;
            }
        }
        return product;
    }
}
