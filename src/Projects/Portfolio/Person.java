package Projects.Portfolio;

public class Person extends User{
    public Person(String username, String password) {
        super(username, password);
        System.out.println("Account created.");
    }

    private String name;
    private int age;
    private String address;
    private String[] skills;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String[] getSkills(){
        return skills;
    }

    public void setSkills(String[] skills){
        this.skills = skills;
    }
}
