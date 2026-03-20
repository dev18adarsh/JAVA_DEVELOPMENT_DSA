package Projects.Portfolio;

import java.util.Random;
import java.util.Scanner;

public class User {
    private String username;
    private String password;

    public User(String username,String password){
        if(username != null && !username.isEmpty()){
            this.username = username;
        }
        else{
            System.out.println("Enter a valid username");
        }
        if(password != null && !password.isEmpty()){
            this.password = password;
        }
        else{
            System.out.println("Enter a valid password.");
        }
    }

    public String getUsername() {
        return username;
    }

    public int GenerateOTP(){
        Random rand = new Random();
        int min = 1000;
        int max = 9999;
        return rand.nextInt(max,min);
    }

    public void changePassword(int otp,String new_pass){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter otp : ");
        int OTP = in.nextInt();
        if(otp == OTP){
            this.password = new_pass;
            System.out.println("Password changed successfully.");
        }
        else{
            System.out.println("Incorrect OTP.");
        }
    }
}
