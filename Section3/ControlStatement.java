package Section3;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Pub and Griller");
        System.out.println("Enter your age please");
        int age = s.nextInt();

        if(age>=21){
            System.out.println("Have a beer");
        }
        else{
            System.out.println("Have a Coke");
        }

        System.out.println("Thanks for coming");
    }
}
