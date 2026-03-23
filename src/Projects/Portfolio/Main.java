package Projects.Portfolio;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Want to create an account : ");
        String opt = in.nextLine();
        if(Objects.equals(opt,"yes")){
            System.out.println("Enter your username : ");
            String username = in.nextLine();
            System.out.println("Enter your password : ");
            String password = in.nextLine();

            Person p1 = new Person(username,password);

            System.out.println("Enter your username : ");
            String user = in.next();
            System.out.println("Enter your password : ");
            String pass = in.next();

            if(Objects.equals(user, p1.getUsername()) && Objects.equals(pass,password)){
                System.out.println("Account logged in successfully.");
                p1.setName(InputName());
                p1.setAge(InputAge());
                p1.setSkills(InputSkills());
                p1.setAddress(InputAddress());

                System.out.println("#/#/#/#/#/#/#/#/#/#/#/#/ Your Details #/#/#/#/#/#/#/#/#/#/#/#/");
                System.out.println("Name : " + p1.getName());
                System.out.println("Age : " + p1.getAge());
                System.out.println("Address : " + p1.getAddress());
                System.out.println("Skills : " + Arrays.toString(p1.getSkills()));
            }
            else {
                System.out.println("Forgot password : ");
                String ch = in.next();
                System.out.println("Enter new password : ");
                String new_pass = in.next();

                System.out.println("Otp : " + p1.GenerateOTP());
                System.out.println("Enter OTP : ");
                int otp = in.nextInt();

                if(Objects.equals(ch, "y")){
                    p1.changePassword(otp,p1.GenerateOTP(),new_pass);
                    System.out.println("Enter your username : ");
                    String user_name = in.next();
                    System.out.println("Enter your password : ");
                    String psd = in.next();

                    if(Objects.equals(user_name, p1.getUsername()) && Objects.equals(psd,new_pass)){
                        System.out.println("Account logged in successfully.");
                        p1.setName(InputName());
                        p1.setAge(InputAge());
                        p1.setSkills(InputSkills());
                        p1.setAddress(InputAddress());

                        System.out.println("#/#/#/#/#/#/#/#/#/#/#/#/ Your Details #/#/#/#/#/#/#/#/#/#/#/#/");
                        System.out.println("Name : " + p1.getName());
                        System.out.println("Age : " + p1.getAge());
                        System.out.println("Address : " + p1.getAddress());
                        System.out.println("Skills : " + Arrays.toString(p1.getSkills()));
                    }
                }
            }
        } else if (Objects.equals(opt,"no")) {
            System.out.println("Thanks for visiting.");
        }else{
            System.out.println("Enter either yes or no.");
        }
    }

    public static String InputName(){
        System.out.println("Enter your name : ");
        return in.nextLine();
    }

    public static int InputAge(){
        System.out.println("Enter your age : ");
        return in.nextInt();
    }

    public static String InputAddress(){
        System.out.println("Enter your address : ");
        return in.next();
    }

    public static String[] InputSkills(){
        String[] skills = new String[3];
        System.out.println("Enter only 3 primary skills of yours : ");
        for(int i = 0;i < skills.length;i++){
            skills[i] = in.next();
        }
        return skills;
    }
}
