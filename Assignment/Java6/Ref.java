package Assignment.Java6;

public class Ref {
    public Ref(String st){
        System.out.println("Heyyy"+st);
    }
}

class Main{
    public static void main(String args[]){
        Ref[] arr = new Ref[2];
//        Ref obj1,obj2;

        arr[0]=new Ref("Chetan");
        arr[1]=new Ref("Zemoso");

        System.out.println(arr[0]);

    }
}
