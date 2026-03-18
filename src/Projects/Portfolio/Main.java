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
                //create ChangePassword object.
                System.out.println("Forgot Password?");
                    String opt = in.next();
                    if(Objects.equals(opt, "no")){
                        System.out.println("Okay.");
                    }
                    else{
                        ChangePassword cp1 = new ChangePassword();
                        System.out.println("Enter your username : ");
                        String un_input = in.nextLine();
                        cp1.setUsername(un_input);

                        System.out.println();
                        System.out.println();

                        System.out.println("OTP : " + cp1.GenerateOtp());

                        System.out.println();
                        System.out.println();

                        System.out.println("Enter OTP : ");
                        int otp = in.nextInt();

                        if(otp == cp1.getOtp()){
                            System.out.println("Create new password : ");
                            String new_pas = in.nextLine();
                            System.out.println("Confirm Password : ");
                            String cnf_pass = in.nextLine();

                            if(Objects.equals(new_pas, cnf_pass)){
                                u1.setPsd(cnf_pass);
                                System.out.println("Login again.");
                            }

                            System.out.println("Enter username : ");
                            String user_name = in.nextLine();
                            System.out.println("Enter password : ");
                            String pass_word = in.nextLine();

                            if(Objects.equals(user_name, u1.getUser_id()) && Objects.equals(pass_word, u1.getPsd())){
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
                        }
                        else {
                            System.out.println("Credentials don't match.");
                        }
                    }
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
            TechSkills[i] = in.next();
        }
        return TechSkills;
    }
}