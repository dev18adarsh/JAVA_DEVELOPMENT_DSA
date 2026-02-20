package Projects.Portfolio;

import java.util.Arrays;

public class User extends Details{
    private String user_id;
    private String psd;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPsd(){
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public void PrintName(){
        System.out.println("Name : " + getName());
    }

    public void PrintEmail(){
        System.out.println("Email : " + getEmail());
    }

    public void PrintAge(){
        System.out.println("Age : " + getAge());
    }

    public void PrintAddress(){
        System.out.println("Address : " + getAddress());
    }

    public void PrintSkills(){
        System.out.println("Skills : " + Arrays.toString(getSkills()));
    }
}

