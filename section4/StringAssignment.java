package section4;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the full Name");
        String in = s.nextLine();

        int index = in.indexOf(' ');

        String firstName=in.substring(0,index).toUpperCase();
        String lastName = in.substring(index+1).toLowerCase();

        System.out.println("First Name is : "+firstName);
        System.out.println("Last Name is : "+lastName);

    }
}
