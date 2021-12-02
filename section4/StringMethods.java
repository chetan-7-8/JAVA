package section4;

import java.util.Locale;

public class StringMethods {
    public static void main(String args[]){
        String myName="Chetan Singh";

        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();

        int index= myName.indexOf('h');

        String lastName = myName.substring(7);

        System.out.println("UpperCase is : "+upper);

        System.out.println("LowerCase is : "+lower);


        System.out.println("LastName is : "+lastName);
    }
}
