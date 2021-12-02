package section4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();

        for(int i=0;i<5;i++){
            System.out.println("Enter the name");
            String k = s.nextLine();
            Name.add(k);
            System.out.println(" ");

            System.out.println("Enter the age");
            int p = s.nextInt();
            s.nextLine();
            age.add(p);
        }

        for(int i=0;i<5;i++){
            System.out.println(Name.get(i)+" is of age "+age.get(i));
        }

    }
}
