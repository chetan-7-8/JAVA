package Assignment;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Java2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        if(str.toLowerCase()
                .replaceAll("[^a-z]","")          //eliminating all the characters except alphabet
                .replaceAll("(.)(?=.*\\1)","")    //eliminating duplicates
                .length()==26){                                   //checking the length
             System.out.println("All the characters present");
        }
        else{
            System.out.println("Not all the characters are present");
        }

        //Big-O-Complexity of this approach tends to O(n).

    }
}
