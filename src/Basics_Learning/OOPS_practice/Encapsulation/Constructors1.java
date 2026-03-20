package Basics_Learning.OOPS_practice.Encapsulation;

public class Constructors1 {
    public static void main(String[] args) {

        myMainEmployee m1 = new myMainEmployee("adarsh",5488);
//        m1.setId(486);
        System.out.println(m1.getId());
        System.out.println(m1.getName());

        myMainEmployee m2 = new myMainEmployee("Adi");

        System.out.println(m2.getId());
        System.out.println(m2.getName());
    }
}

class myMainEmployee{
    private int id;
    private String name;

    public myMainEmployee(String MyName,int id_){
        id = id_;
        name = MyName;
    }

    public myMainEmployee(String MyName){
        id = 1;
        name = MyName;
    }

    public void setName(String s){
        this.name = s;
    }

    public String getName(){
        return name;
    }

    public void setId(int n){
        this.id = n;
    }

    public int getId(){
        return id;
    }
}