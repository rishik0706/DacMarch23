import java.util.Scanner;

public class Q31 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int i = Integer.parseInt(str);
        System.out.println("This was sucessful and the value if integer is now: "+i);
        scan.close();
    }
}
