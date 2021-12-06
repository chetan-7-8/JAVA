package Assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Java3 {
    public static void main(String args[]) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ping");
//        list.add("www.google.com");

//        list.add("Ping");
        list.add("www.facebook.com");
        Java3.commands(list);
    }

    static void commands(ArrayList<String> commandList ) throws Exception{
        ProcessBuilder build = new ProcessBuilder(commandList);
        Process process=build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        BufferedReader Error = new BufferedReader(new InputStreamReader
                (process.getErrorStream()));
        String s = null;

        System.out.println("Standard output: ");
        while((s = input.readLine()) != null)
        {
            System.out.println(s);
        }
        System.out.println("error (if any): ");
        while((s = Error.readLine()) != null)
        {
            System.out.println(s);
        }
    }
}


