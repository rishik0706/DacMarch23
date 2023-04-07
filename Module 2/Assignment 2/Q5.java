package Assignment;
import java.util.Scanner;
class TelephoneBill{
    private String customerName;
    private long phoneNumber;
    private int numberOfCalls;
    private float durationOfCalls;
    private double bill;
    //setter methods
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setPhoneNumber(Long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setNumberOfCalls(int numberOfCalls){
        this.numberOfCalls=numberOfCalls;
    }
    public void setDurationOfCalls(float durationOfCalls){
        if(durationOfCalls<1){
            durationOfCalls=1;
        }
        this.durationOfCalls=durationOfCalls;
    }
    public double calculateBill(){
        if(this.numberOfCalls<=100){
            this.bill=10+0.5*(this.numberOfCalls);
        }
        else{
            this.bill=10+50+0.25*(this.numberOfCalls-100);
        }
        return this.bill;
    }
}
public class Q5 {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    TelephoneBill tb = new TelephoneBill();
    System.out.println("Customer Name : ");
    tb.setCustomerName(sc.nextLine());
    System.out.println("Phone Number : ");
    tb.setPhoneNumber(sc.nextLong());
    System.out.println("Number of calls made : ");
    tb.setNumberOfCalls(sc.nextInt());
    System.out.println("Duration of calls (in minute) : ");
    tb.setDurationOfCalls(sc.nextFloat());
    System.out.println("Total Bill Amount : "+tb.calculateBill());

}
}
