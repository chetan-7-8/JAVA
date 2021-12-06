package Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class Java4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of test cases");
        int tc = s.nextInt();
        s.nextLine();

        while(tc-->0){
            System.out.println("Enter the signup date in the format of dd-mm-yyyy");
            String signupDate = s.nextLine();

            System.out.println("Enter the current date in the format of dd-mm-yyyy");
            String currentDate = s.nextLine();

            helpDate(signupDate,currentDate);
        }
    }

    public static void helpDate(String inputSignupDate, String inputCurrentDate){
        try{
            Date signupDate,currentDate;
            String stringStartDate, stringEndDate;
            Date startDate,endDate;

            //String to date conversion
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            signupDate=dateFormat.parse(inputSignupDate);
            currentDate=dateFormat.parse(inputCurrentDate);

            if(signupDate.after(currentDate)){
                System.out.println("No Range");
            }
            else{
                startDate = signupDate;

                //setting up year to current year
                startDate.setYear(currentDate.getYear());

                //creating calendar object->Return current date instance
                Calendar calendar = Calendar.getInstance();

                //setting start date as calendar current date
                calendar.setTime(startDate);

                //subtract 30 from the current date
                calendar.add(Calendar.DATE,-30);
                startDate=calendar.getTime();

                //add 60 days to the calendar

                calendar.add(Calendar.DATE,60);

                endDate=calendar.getTime();

                //checking if current date is less than current date
                if(endDate.after(currentDate)){
                    endDate=currentDate;
                }

                stringStartDate=dateFormat.format(startDate);
                stringEndDate=dateFormat.format(endDate);

                System.out.println(stringStartDate+" "+stringEndDate);
            }
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
