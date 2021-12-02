package section7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputFun {
    public static void main(String args[]){

        try
        {
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello there");
            pw.println("My name is chetan");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage()+" ");
        }
    }
}
