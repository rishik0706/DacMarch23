package Assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Q1 {
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the day");
	        int day=sc.nextInt();
	        System.out.println("enter the month");
	        int month=sc.nextInt();
	        month=month-6;
	        System.out.println("enter the year");
	        int year=sc.nextInt();
	        year = year +1900;
	        System.out.println("enter the hour");
	        int hour=sc.nextInt();
	        System.out.println("enter the minute");
	        int minute=sc.nextInt();
	        System.out.println("enter the seconds");
	        int seconds=sc.nextInt();

	       
	        Calendar cd= Calendar.getInstance();
	        System.out.println("Enter the choice \n 1. DD/MM/YYYY  \n 2. MM/DD/YYYY  \n "
	        		+ "3. YYYY/MM/DD \n 4. HH:mm:ss \n 5. hh:mm:ss a \n 6. HH:mm  \n"
	        		+ " 7. dd/MM/yyy HH:mm:ss \n 8. MM/dd/yyyy hh:mm:ss a \n 9. yyyy/MM/dd HH:mm");
	        int choice = sc.nextInt();
	        String pattern="";
	        switch(choice){
	            case 1: pattern= "dd/MM/yyyy";
	            break;
	            case 2: pattern= "MM/dd/yyyy";
	            break;
	            case 3: pattern= "yyyy/MM/dd";
	            break;
	            
	            case 4: pattern= "HH:mm:ss";
	            break;
	            case 5: pattern= "hh:mm:ss a";
	            break;
	            case 6: pattern= "HH:mm";
	            break;
	            case 7: pattern= "dd/MM/yyy HH:mm:ss";
	            break;
	            case 8: pattern= "MM/dd/yyyy hh:mm:ss a";
	            break;
	            case 9: pattern= "yyyy/MM/dd HH:mm";
	            break;
	        }
	        cd.set(day ,month , year ,hour ,minute,seconds );
	        SimpleDateFormat sdf11= new SimpleDateFormat(pattern);
	   
	        System.out.println(sdf11.format(cd.getTime()));

	    }
}
