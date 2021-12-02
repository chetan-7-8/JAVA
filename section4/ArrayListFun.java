package section4;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String args[]){
        ArrayList list = new ArrayList<>();
        list.add("chetan");
        list.add("zemoso");
        list.add(1);
        list.add('c');

       for(Object p : list){

        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
