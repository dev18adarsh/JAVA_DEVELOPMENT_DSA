package Projects.Portfolio;

import java.util.Objects;

public class User {
    private final String username;
    private String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;
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
