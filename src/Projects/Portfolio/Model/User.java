package Projects.Portfolio.Model;

import java.util.Objects;

public class User extends Person{
    private  String username;
    private String password;
    private String[] skills;

    public User(String username,String Password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public boolean checkPassword(String input){
        return password.equals(input);
    }

    public boolean changePassword(String old_pass,String new_pass){
        if(this.password.equals(old_pass)){
            this.password = new_pass;
            return true;
        }
        return false;
    }

    public String[] getSkills(){
        return skills;
    }

    public void setSkills(String[] skills){
        this.skills = skills;
    }
}

