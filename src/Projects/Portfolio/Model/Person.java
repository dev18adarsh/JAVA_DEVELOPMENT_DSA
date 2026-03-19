package Projects.Portfolio.Model;

import java.util.Enumeration;

public class Person {
    private String name;
    private String Uid;
    private int age;
    private String address;

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address != null && !address.isEmpty()){
            this.address = address;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
    }

    public String getUid() {
        return Uid;
    }

    public void setId(String id) {
        if(id != null && !id.isEmpty()){
            this.Uid = id;
        }
    }
}
