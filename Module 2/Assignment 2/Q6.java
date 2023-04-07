package Assignment;
import java.util.Scanner;

class Bank{
    private String accHolderName;
    private int accNumber;
    private double accBalance;
    
    Bank(){
        this.accHolderName=null;
        this.accNumber=1;
        this.accBalance=0.0;
    }
    public void setAccHolderName(String accHolderName){
        this.accHolderName=accHolderName;
    }
    public void setAccNumber(){
        this.accNumber++;
    }
    public void setAccBalance(double accBalance){
        this.accBalance=accBalance;
    }
    public String setAccHolderName(){
        return this.accHolderName;
    }
    public int getAccNumber(){
        return this.accNumber;
    }
    public double getAccBalance(){
        return this.accBalance;
    }
    public String getAccHolderName(){
        return this.accHolderName;
    }
}

class BankTest{
    private Scanner sc = new Scanner(System.in);
    private Bank b = new Bank();
    
    public void createAcc(){
        System.out.println("Enter Account holder's name :");
        sc.nextLine();
        b.setAccHolderName(sc.nextLine());
        // System.out.println("Enter Account Number : ");
        b.setAccNumber();
        // System.out.println("Enter Account balance : ");
        b.setAccBalance(0.0f);
    }
    public void accInfo(){
        System.out.println("Account holder's name : "+b.getAccHolderName());
        System.out.println("Account number : "+b.getAccNumber());
        System.out.println("Account balance : "+b.getAccBalance());
    }
    public void displayAccBalance(){
        System.out.println("Enter Account number : ");
        int accNum = sc.nextInt();
        if(b.getAccNumber()!=accNum){
            System.out.println("Please enter valid account number!!!");
        }
        else{
            System.out.println("Account Balance : "+b.getAccBalance());
        }
    }
    public void depositeMoney(){
        System.out.println("Enter Account number : ");
        int accNum = sc.nextInt();
        if(b.getAccNumber()!=accNum){
            System.out.println("Please enter valid account number!!!");
        }
        else{
            System.out.println("Enter Deposite amount: ");
            b.setAccBalance(b.getAccBalance()+sc.nextDouble());
        }
    }
    public void withdrawMoney(){
        System.out.println("Enter Account number : ");
        int accNum = sc.nextInt();
        if(b.getAccNumber()!=accNum){
            System.out.println("Please enter valid account number!!!");
        }
        else{
            System.out.println("Enter Withdraw amount: ");
            b.setAccBalance(b.getAccBalance()-sc.nextDouble());
        }
    }
    public int menuList(){
        System.out.println("Enter your choice : ");
        System.out.println("1. Create a new account");
        System.out.println("2 .Deposit money into an account");
        System.out.println("3. Withdraw money from an account");
        System.out.println("4. Display the account balance");
        System.out.println("5. Display the account holder's information");
        System.out.println("6. Exit");
        return sc.nextInt();
    }
}

public class Q6 {
    public static void main(String args[]){
        BankTest test = new BankTest();
        int choice;
        while((choice=test.menuList())!=6){
            switch(choice){
                case 1:
                    test.createAcc();
                    break;
                case 2:
                    test.depositeMoney();
                    break;
                case 3:
                    test.withdrawMoney();
                    break;
                case 4:
                    test.displayAccBalance();
                    break;
                case 5:
                    test.accInfo();
                    break;
                default:
                    System.out.println("Enter valid choice : ");
                    break;
            }
        }
    }
}

