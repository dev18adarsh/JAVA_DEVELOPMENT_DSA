package Projects.Portfolio;

import java.util.Arrays;
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(input()));
    }
    public static String[] input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of args : ");
        int no = in.nextInt();
        String[] args = new String[no];
        for(int i = 0;i < args.length;i++){
            args[i] = in.next();
        }
        return args;
    }
}
