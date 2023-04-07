package Assignment;

import java.util.Scanner;

class Rational{
    private int num;
    private int den;

    public Rational(){
        this.num=0;
        this.den=1;
    }
    public Rational(int num, int den){
        if(den==0){
            throw new IllegalArgumentException();
        }
        this.num=num;
        this.den=den;
        reduce();
    }

    public void setNum(int num){
        this.num=num;
    }
    public void setDen(int den){
        this.den=den;
    }
    public int getNum(){
        return this.num;
    }
    public int getDen(){
        return this.den;
    }

    public void reduce(){
        int min = this.num<this.den? this.num : this.den;
        int a =2;
        while(a<min){
            if(this.num%a==0 && this.den%a==0){
                this.num/=a;
                this.den/=a;
                continue;
            }
            else{
                a++;
            }
        }
    }
    public String toString(){
        reduce();
        if(this.den==1){
            return this.num+"";
        }
        else{
            return this.num+" / "+this.den;
        }
    }

}

class Operation{
    private Scanner sc = new Scanner(System.in);
    Rational r1 = new Rational();
    Rational r2 = new Rational();
    Rational r3 = new Rational();

    
    public String add(){
        r3.setNum((r1.getNum()*r2.getDen())+(r2.getNum()*r1.getDen()));
        r3.setDen((r1.getDen()*r2.getDen()));
        return r3.toString();
    }
    public String sub(){
        r3.setNum((r1.getNum()*r2.getDen())-(r2.getNum()*r1.getDen()));
        r3.setDen((r1.getDen()*r2.getDen()));
        return r3.toString();
    }
    public String mul(){
        r3.setNum(r1.getNum()*r2.getNum());
        r3.setDen((r1.getDen()*r2.getDen()));
        return r3.toString();
    }
    public String div(){
        r3.setNum(r1.getNum()*r2.getDen());
        r3.setDen((r1.getDen()*r2.getNum()));
        return r3.toString();
    }
    public void inputValues(){
        System.out.println("Enter First Rational number : ");
        System.out.println("Numerator : ");
        r1.setNum(sc.nextInt());
        System.out.println("Denominator : ");
        r1.setDen(sc.nextInt());
        System.out.println("Enter Second Rational number : ");
        System.out.println("Numerator : ");
        r2.setNum(sc.nextInt());
        System.out.println("Denominator : ");
        r2.setDen(sc.nextInt());
    }
    
    public int menuList(){
        System.out.println("Enter opeartion : ");
        System.out.println(" 1. Addition ");
        System.out.println(" 2. Subtraction ");
        System.out.println(" 3. Multiplication ");
        System.out.println(" 4. Division ");
        System.out.println(" 5. Exit ");
        return sc.nextInt();
    }
}

public class Q8 {
    public static void main(String args[]){
        Operation o = new Operation();
        int choice;
        while((choice = o.menuList())!=5){
            o.inputValues();
            switch(choice){
                case 1 :
                    System.out.println("Addition : "+o.add());
                    break;
                case 2 :
                    System.out.println("Subtraction : "+o.sub());
                    break;
                case 3 :
                    System.out.println("Multiplication : "+o.mul());
                    break;
                case 4 :
                    System.out.println("Division : "+o.div());
                    break;
                default :
                    System.out.println("Please enter valid choice !!");
                    break;
            }
        }
    }
}

