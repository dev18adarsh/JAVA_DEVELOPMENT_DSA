package Projects.Portfolio;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Want to create an account : ");
        char choice = in.nextLine().charAt(0);
        if(choice == 'y'){
            User u1 = new User();
            u1.setUser_id(CreateUser());
            u1.setPsd(CreatePass());
            System.out.println("Account created.");

            System.out.println();

            System.out.println("Enter your username : ");
            String id = in.next();
            System.out.println("Enter your password : ");
            String pass = in.next();

            if(Objects.equals(id, u1.getUser_id()) && Objects.equals(pass, u1.getPsd())){
                System.out.println("Account logged in successfully.");

                System.out.println();

                u1.setName(InputName());
                u1.setAge(InputAge());
                u1.setEmail(InputEmail());
                u1.setAddress(InputAddress());
                u1.setSkills(InputSkills());

                System.out.println();
                System.out.println(":::::::::::::::::: User Details ::::::::::::::::::");
                //print all details.
                u1.PrintName();
                u1.PrintEmail();
                u1.PrintAge();
                u1.PrintAddress();
                u1.PrintSkills();
            }
            else{
                System.out.println("Credentials didn't match,Try again.");
            }
        }
        else if(choice == 'n'){
            in.close();
        }
        else {
            System.out.println("Enter either 'y' or 'n'.");
        }

        //closing scanner object.
        in.close();

    }
    public static String CreateUser(){
        System.out.println("Enter a valid username : ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String CreatePass(){
        System.out.println("Enter a strong password : ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int InputAge(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age : ");
        return in.nextInt();
    }

    public static String InputName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name : ");
        return in.nextLine();
    }

    public static String InputEmail(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Email-id : ");
        return in.nextLine();
    }

    public static String InputAddress(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your address : ");
        return in.nextLine();
    }

    public static String[] InputSkills(){
        Scanner in = new Scanner(System.in);
        System.out.println("How many skills do you have : ");
        int no = in.nextInt();
        System.out.println("Enter your skills : ");
        String[] TechSkills = new String[no];
        for(int i = 0;i < no;i++){
            TechSkills[i] = in.nextLine();
        }
        return TechSkills;
    }
}