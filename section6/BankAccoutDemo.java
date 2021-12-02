package section6;

public class BankAccoutDemo {
    public static void main(String args[]){
       BankAccount myAccount = new BankAccount("Chetan");
       BankAccount yourAccount = new BankAccount("pulkit",5000);

       myAccount.deposit(100);
       System.out.println("Owner is "+myAccount.getOwner()+" and the balance is "+myAccount.getBalance());

    }
}
