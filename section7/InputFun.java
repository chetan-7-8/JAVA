package section7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputFun {
    public static void main(String[] args) {

        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            while (inFile.hasNext()) {
                int k = inFile.nextInt();
                System.out.println(k);
            }

            inFile.close();
        } catch (FileNotFoundException var3) {
            System.out.println("File not found");
        }

    }
}
