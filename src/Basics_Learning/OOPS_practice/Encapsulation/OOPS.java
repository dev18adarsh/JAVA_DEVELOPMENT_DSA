package Basics_Learning.OOPS_practice.Encapsulation;

public class OOPS {
    public static void main(String[] args) {
        Employee adarsh = new Employee();
        adarsh.setName("Adarsh");
        System.out.println(adarsh.getName());
        adarsh.setSalary(45566667);
        int salary_Adarsh = adarsh.getSalary();
        System.out.println(salary_Adarsh);

        Cellphone a35 = new Cellphone();
        a35.call();
        a35.ringing();
        a35.vibrating();
        a35.play();

        Square s1 = new Square();
        s1.setSide(445.56);
        System.out.println("Length of each side : " + s1.getSide());
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
//problem 1
class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s){
        salary = s;
    }
}

//problem2
class Cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }

    public void vibrating(){
        System.out.println("Vibrating...");
    }

    public void call(){
        System.out.println("calling friend..");
    }

    public void play(){
        System.out.println("Playing games...");
    }
}


//problem 3
class Square{
    double side;

    public void setSide(double length){
        side = length;
    }

    public double getSide(){
        return side;
    }

    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }
}