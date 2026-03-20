package Projects.Portfolio;

import java.util.Objects;

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

    public void changePassword(String old_pass,String new_pass){
        if(Objects.equals(old_pass, password)){
            this.password = new_pass;
        }
    }
}
