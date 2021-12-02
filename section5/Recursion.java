package section5;

public class Recursion {
    public static void main(String args[]){
//countDown(9);
countUpto(1,9);
    }

    public static void countDown(int n ){
       //base Case
        if(n<=0){
            return;
        }

        //Calculation
        System.out.println(n);

        //recursive call
        countDown(n-1);
    }

    public static void countUpto(int start, int end){
        if(start==end){
            System.out.println(start);
            return;
        }

        System.out.println(start);

        countUpto(start+1,end);
    }
}
