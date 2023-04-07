package Assignment;
import java.util.Scanner;

class BMICalculator{
    private double height;
    private double weight;

    public BMICalculator(){
        // this.height=0.0f;
        // this.weight=0.0f;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setweight(double weight){
        this.weight=weight;
    }
    public double getWeight(){
        return this.weight;
    }
    public double calculateBMI(){
        return this.weight/(this.height*this.height);
    }
}



public class Q2 {
    public static void main(String args[]){
        BMICalculator b = new BMICalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height in meters : ");
        b.setHeight(sc.nextDouble());

        System.out.println("Enter Weight in kilograms : ");
        b.setweight(sc.nextDouble());

        System.out.println();
        System.out.printf("BMI is : %.2f",b.calculateBMI());

        
    }
}

