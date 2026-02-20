package Basics_Learning.OOPS_practice.Inheritance;

import java.util.Scanner;
import java.util.Objects;

public class inheritance_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the OS type : ");
        String os = in.next();
        Phone p1 = new Phone(os);

        System.out.println("Enter the screen size : ");
        String screen_size = in.next();
        p1.setScreen_size(screen_size);
        System.out.println("The size of the phone is : " + p1.getScreen_size());
        p1.Call();
        p1.playGames();

        FoldPhone fp1 = new FoldPhone();
        fp1.screen_size = p1.getScreen_size();
        System.out.println("Enter your second screen's size : ");
        String ss2 = in.next();
        fp1.setScreen_size_2(ss2);

        System.out.println("The screen sizes are : 1st : " + fp1.getScreen_size() + " 2nd : " + fp1.getScreen_size_2());
        fp1.Call();
        fp1.FoldOpen();
        fp1.playGames();
    }
}

class Phone{
    String screen_size;

    public Phone(){
        System.out.println("This is a phone.");
    }

    public Phone(String os){
        if(Objects.equals(os, "ios")){
            System.out.println("This is an IOS phone.");
        }

        else{
            System.out.println("It is an Android phone.");
        }
    }

    public void setScreen_size(String size){
        this.screen_size = size;
    }

    public String getScreen_size() {
        return screen_size;
    }

    public void playGames(){
        System.out.println("Playing games.");
    }

    public void Call(){
        System.out.println("Calling.");
    }
}

class FoldPhone extends Phone{
    String screen_size_2;
    public void setScreen_size_2(String size) {
        super.setScreen_size(size);
    }

    public String getScreen_size_2() {
        return screen_size_2;
    }

    public void FoldOpen(){
        System.out.println("Folding and opening.");
    }
}

