package Projects.UserManagementSystem;

public class User extends Person{
    private final String username;
    private String password;

    public User(String username,String password,String name,int age){
        super(name,age);
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
}
