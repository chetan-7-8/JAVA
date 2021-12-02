package section6;

public class BookDemo {
    public static void main(String args[]){
    Book java = new Book("Zemoso","Java","Tech",100);
    Book physic = new Book("HC Verma","Physics", "physics",200);
    Book chem = new Book("Rs Aggarwal","Chemistry","chem",100);

//    printDetails(java);
//    printDetails(physic);
//    printDetails(chem);
        java.printDetails();
        physic.printDetails();
        chem.printDetails();
    }


}
