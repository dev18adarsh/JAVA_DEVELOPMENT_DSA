package Projects.Portfolio;

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
        return (int) (Math.random() * 9000) + 1000;
    }

    public void changePassword(int User_otp,int generatedOTP,String new_pass){
        if(User_otp == generatedOTP){
            this.password = new_pass;
            System.out.println("Password changed successfully.");
        }
        else{
            System.out.println("Incorrect OTP.");
        }
    }
}
