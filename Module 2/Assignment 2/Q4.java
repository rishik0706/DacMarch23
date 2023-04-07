package Assignment;
import java.util.Scanner;
class ElectricityBill{
    private String customerName;
    private double unitsConcumed;
    private double billAmount;

    public ElectricityBill(){
        this.customerName=null;
        this.unitsConcumed=0.0;
    }
    //getter methods
    public String getCustomerName(){
        return this.customerName;
    }
    public double getUnitsConumed(){
        return this.unitsConcumed;
    }
    public double getBillAmount(){
        return this.billAmount;
    }
    //setter mothods
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setunitsConsumed(double unitsConcumed){
        this.unitsConcumed=unitsConcumed;
    }
    public void setBillAmount(double billAmount){
        this.billAmount=billAmount;
    }
    //calculate bill Amount
    public double calculateBillAmount(){
        
            if(this.unitsConcumed<=100){
                this.billAmount = this.unitsConcumed*5;
            }
            else if(this.unitsConcumed<=200){
                this.billAmount= 500+7*(this.unitsConcumed-100);
            }
            else{
                this.billAmount = 500+1400+10*(this.unitsConcumed-300);
            }
        return this.billAmount;
        }
    }
    

public class Q4{
    public static void main(String args[]){
        ElectricityBill eb = new ElectricityBill();
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Name : ");
        eb.setCustomerName(sc.nextLine());
        System.out.println("Units Consumed : ");
        eb.setunitsConsumed(sc.nextInt());
        System.out.println("Total Bill Amount : "+eb.calculateBillAmount());

        
    }
}
 