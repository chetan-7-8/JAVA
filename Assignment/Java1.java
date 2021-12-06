package Assignment;

import java.io.File;
import java.util.regex.Pattern;

public class Java1 {
    public static void main(String args[]){
        File directory = new File("C:\\Users\\Chetan Singh");

        String[] flist = directory.list();

        boolean flag = false;

        if(flist==null){
            System.out.println("Empty Directory");
        }
        else{
            for(int i=0;i<flist.length;i++){
                if(Pattern.matches("[a-zA-Z]+",flist[i])){
                    System.out.println(directory.getPath()+"\\"+flist[i]);
                }
            }
        }
    }
}
