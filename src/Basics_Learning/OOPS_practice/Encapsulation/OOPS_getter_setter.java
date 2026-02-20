package Basics_Learning.OOPS_practice.Encapsulation;

public class OOPS_getter_setter {
    public static void main(String[] args) {
        Employee_ harry = new Employee_();
        harry.SetName("Harry");
        String name_harry = harry.GetName();

        harry.SetId(32);
        int harry_id = harry.GetId();

        System.out.println(name_harry);
        System.out.println(harry_id);
    }
}

class Employee_{
    private String name;
    private int id;

    public void SetName(String n){
        this.name = n;
    }

    public String GetName(){
        return name;
    }

    public void SetId(int no){
        this.id = no;
    }

    public int GetId(){
        return id;
    }
}
