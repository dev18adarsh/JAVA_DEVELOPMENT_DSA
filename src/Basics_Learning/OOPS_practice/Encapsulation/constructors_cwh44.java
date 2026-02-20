package Basics_Learning.OOPS_practice.Encapsulation;

public class constructors_cwh44 {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(18,76);
        c1.setHeight(45);
        c1.setRadius(18);

        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());

        System.out.println("The area of the cylinder is : " + c1.getArea());
        System.out.println("The volume of the cylinder is : " + c1.getVolume());

        Rectangle r1 = new Rectangle(34,45);

        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Rectangle r2 = new Rectangle(4);

        System.out.println(r2.getPerimeter());
        System.out.println(r2.getArea());
    }
}

class Cylinder{
    private int radius;
    private int height;
    final int pi = 3;

    public Cylinder(int r,int h){
        this.radius = r;
        this.height = h;
    }

    public void setRadius(int r){
        this.radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public int getHeight(){
        return height;
    }

    public int getArea(){
        return (2 * pi * radius * (radius + height));
    }

    public int getVolume(){
        return (pi * radius * radius * height);
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }

    public Rectangle(int l){
        this.length = l;
        this.breadth = l;
    }

    public int getArea(){
        return length * breadth;
    }

    public int getPerimeter(){
        return 2 * (length + breadth);
    }
}