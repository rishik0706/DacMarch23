import java.util.Scanner;
class Py_Pattern5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of pyramid you want !");
		int n =sc.nextInt();
		for(int i=n;i>=1;i--){
			
			for(int k=1;k<i;k++){
				System.out.print("  ");
			}
			
			for(int j=i;j<=n;j++){
			
				System.out.print(j+ " ");
			}
			
			for(int k=n-1;k>=i;k--){
			
				System.out.print(k+ " ");
			}
			
			System.out.println();
		}
	
	}

}