package Assignment;

public class Java5 {

    public static void main(String args[]){
        Chetan c1 = new Chetan();
        c1.printInstance();

        // c1.print();

        Singleton s1 = new Singleton();

        s1.print();

    }
}

class Singleton{
    String email;

    public static Singleton setEmail(String email){
//        this.email=email;

        return new Singleton();
    }

    public void print(){
        System.out.println(this.email);
    }


}

class Chetan{
    int age;
    char gender;


    public void printInstance(){
        System.out.println(this.age+" "+this.gender);
    }


   /* public void print(){
        int age;
        char gender;
        System.out.println(age+" "+gender);
    }
   // We cant print local variables without printing them.
   */
}
