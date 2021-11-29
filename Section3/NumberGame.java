package Section3;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int ans= r.nextInt(100)+1;
        int chance=0;

        while(true){
            int guess=s.nextInt();
            chance++;
            if(guess==ans){
                System.out.println("Congratulations you guessed the number in "+chance+" chances");
            }
            else if(guess>ans){
                System.out.println("Guess is too high");
            }
            else{
                System.out.println("Guess is very low");
            }
        }
    }
}
