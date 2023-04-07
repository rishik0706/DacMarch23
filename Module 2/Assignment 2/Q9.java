package Assignment;


import java.util.Scanner;
import java.util.GregorianCalendar;
	import java.time.DayOfWeek;
	import java.time.LocalDate;

	class Date{
	    private int day;
	    private int month;
	    private int year;
	    private LocalDate date;

	    public Date(){
	        this.day=0;
	        this.month=0;
	        this.year=0;
	    }
	    public Date(int day, int month, int year){
	        this.day=day;
	        this.month=month;
	        this.year=year;
	    }
	    public int getDay(){
	        return this.day;
	    }
	    public int getMonth(){
	        return this.day;
	    }
	    public int getYear(){
	        return this.day;
	    }
	    public void setDay(int day){
	        this.day = day;
	    }
	    public void setMonth(int month){
	        this.month = month;
	    }
	    public void setYear(int year){
	        this.year = year;
	    }

	    public boolean isValid(){
	        try{
	            // GregorianCalendar g = new GregorianCalendar(this.year,this.month,this.day);
	            this.date = LocalDate.of(this.year,this.month,this.day);
	            return true;
	        }catch(Exception e){
	            // System.out.println(e.getMessage());
	            return false;
	        }
	    }
	    public String getDayOfWeek(){
	        return date.getDayOfWeek().name();
	    }
	    public boolean isLeapYear(){
	        return (this.year%4==0 && this.year%400==0 && this.year%100==0)? true : false;
	    }
	    public LocalDate getNextDay(){
	        return date.plusDays(1);
	    }
	    public LocalDate getPreviousDay(){
	        return date.minusDays(1);
	    }
	}

	class DateTest{
	    private static Scanner sc = new Scanner(System.in);
	    Date d = new Date();

	    public void result(){
	        System.out.println("Enter Day : ");
	        d.setDay(sc.nextInt());
	        System.out.println("Enter Month : ");
	        d.setMonth(sc.nextInt());
	        System.out.println("Enter Year : ");
	        d.setYear(sc.nextInt());
	        if(d.isValid()){
	            System.out.println("Valid Date");
	            System.out.println("Week Day : "+d.getDayOfWeek());
	            System.out.println(d.isLeapYear()? "Leap year : " : "Not a Leap year");
	            System.out.println("Next Day (YYYY-MM-DD) : "+d.getNextDay());
	            System.out.println("Previous Day (YYYY-MM-DD) : "+d.getPreviousDay());

	        }
	        else{
	            System.out.println("Not a Valid Date, try again !!!");
	        }

	    }

	}

	class Q9{

	    public static void main(String args[]){
	        DateTest dt = new DateTest();
	        dt.result();
	    }
	}

