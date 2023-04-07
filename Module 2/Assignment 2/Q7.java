package Assignment;

import java.util.Scanner;

class TollBooth{
    private String vehicleType;
    private int numberAxles;
    private double distanceTravelled;
    private double tollFee;
    private double totalAmountDue;
    final String a[]= {"car","van","bus","truck"};

    public TollBooth(){
        this.vehicleType=null;
        this.numberAxles=0;
        this.distanceTravelled=0.0;
        this.tollFee=0.0;
        this.totalAmountDue=0.0;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public int getNumberAxles(){
        return this.numberAxles;
    }
    public double getDistanceTravelled(){
        return this.distanceTravelled;
    }
    public double getTollFee(){
        return this.tollFee;
    }
    public double getTotalAmountDue(){
        return this.totalAmountDue;
    }
    //setter
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public void setNumberAxles(int numberAxles){
        this.numberAxles=numberAxles;
    }
    public void setDistanceTravelled(double distanceTravelled){
        this.distanceTravelled=distanceTravelled;
    }
    public void setTollFee(double tollFee){
        this.tollFee=tollFee;
    }
    public void setTotalAmountDue(double totalAmountDue){
        this.totalAmountDue=totalAmountDue;
    }
}

class Test{
    
    private Scanner sc = new Scanner(System.in);
    TollBooth t = new TollBooth();
    public double calculateTollFee(){
         if(t.getVehicleType()=="car"||t.getVehicleType()=="van"||t.getVehicleType()=="bus"){
            t.setTollFee(t.getDistanceTravelled()*t.getNumberAxles()*0.25);
         }
         else{
            t.setTollFee(t.getDistanceTravelled()*t.getNumberAxles()*0.50);
         }
         t.setTotalAmountDue(t.getTollFee()+2);
         return t.getTollFee();
    }
    public void generateBill(){
        calculateTollFee();
        System.out.println("Pay the bill bro!!");
         System.out.println("Vehicle type : "+t.getVehicleType());
         System.out.println("Number of Axle : "+t.getNumberAxles());
         System.out.println("Distance traveled (in Miles) : "+t.getDistanceTravelled());
         System.out.println("Toll fee : "+t.getTollFee());
         System.out.println("Total amount due : "+t.getTotalAmountDue());
    }
    public void validVahicle(String vehicleType){
        String a[]= {"car","van","bus","truck"};
        boolean flag=false;
        for (String type:a){
            if(type.equals(vehicleType.toLowerCase())){
                flag=true;
                break;
            }
        }
        if(flag){
            t.setVehicleType(vehicleType);
        }
        else{
            System.out.println("Please enter proper vehicle type");
            validVahicle(sc.nextLine());
        }
    }
    
    public void showMenu(){
        
        System.out.println("Enter Vehicle Type (Car/Van/Bus/Truck) : ");
        sc.nextLine();
        validVahicle(sc.nextLine());
        System.out.println("Enter number of axles : ");
        t.setNumberAxles(sc.nextInt());
        System.out.println("Enter distance travelled : ");
        t.setDistanceTravelled(sc.nextDouble());
    }
    public int menuList(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Enter Vehicle Data");
        System.out.println("2. Calculate toll fee");
        System.out.println("3. Generate bill");
        System.out.println("4. Exit");
        return sc.nextInt();
    }

}

public class Q7{
    public static void main(String args[]){
        Test t = new Test();
        int choice;
        while((choice=t.menuList())!=4){
            switch(choice){
                case 1 :
                    t.showMenu();
                    break;
                case 2 :
                    System.out.println("Toll fee : "+t.calculateTollFee());
                    break;
                case 3 :
                    t.generateBill();
                    break;
                default :
                    break;

            }
        }
    }
}

