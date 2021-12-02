package section4;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class StringFun {
    public static void main(String args[]){
        String name1 ="Chetan";
        String name2= "Chetan";
        String name3 = "chetan";

        if(name1.equals(name2)){
            System.out.println("Names are same");
        }else{
            System.out.println("Names are same");
        }

        if(name1.compareTo(name3)>0){
            System.out.println("name1>name3");
        }else{
            System.out.println("name1<=name3");
        }
    }
}
