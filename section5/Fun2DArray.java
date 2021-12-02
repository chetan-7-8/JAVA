package section5;

import java.util.Random;

public class Fun2DArray {
    public static void main(String args[]){
        int [][] arr = new int[3][3];
        fill2DArray(arr);
        print2DArray(arr);
        DoubleTheValue(arr);
        print2DArray(arr);
    }

    public static void fill2DArray(int[][] arr){
        Random r = new Random();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                arr[i][j]=r.nextInt(100);
            }
        }
    }

    public static void print2DArray(int [][] arr){
        for(int[] a : arr){
            for(int num : a){
                System.out.print(num+" ");
            }
            System.out.println(" ");
        }
    }

    public static void DoubleTheValue(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]*=2;
            }
        }
    }
}
