package Projects.ToDoList;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tasks t1 = new Tasks();
        System.out.println("Enter the number of tasks : ");
        int no_tasks = in.nextInt();
        for(int i = 0;i < no_tasks;i++){
            t1.tasks.add(t1.add_Tasks());
        }

        for(int i = 0,j = 1;i < t1.tasks.size();i++){
            System.out.println(j++ + ". " + t1.tasks.get(i));
        }

        int size_of_list = t1.tasks.size();

        while(size_of_list > 0){
            System.out.println("Have you completed task : ");
            String response = in.next();
            if(Objects.equals(response, "y")) {
                System.out.println("Enter your completed task : ");
                String completed_Task = in.next();

                int taskToBeRemoved_no = findIndex(t1.tasks, completed_Task);
                t1.tasks.remove(taskToBeRemoved_no);

                size_of_list--;
                if(taskToBeRemoved_no == -1){
                    System.out.println("task not found.");
                }
            }
            else if(Objects.equals(response,"n")){
                System.out.println("Complete soon...don't waste time.");
            }

            else{
                System.out.println("Enter a valid response : ");
            }

            if(size_of_list == 0){
                System.out.println("Yes...Dude..you...did it...come on...keep working!!!!");
            }
        }
    }
    public static int findIndex(ArrayList<String> list, String target){
        for(int i = 0;i < list.size() + 1;i++){
            if (Objects.equals(list.get(i), target)){
                return i;
            }
        }
        return -1;
    }
}

class Tasks {
    ArrayList<String> tasks = new ArrayList<>();
    public String add_Tasks(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter task : ");
        return in.nextLine();
    }
}