class Hol_Inv_Half_Pyramid{
	public static void main(String args[]){
		
		for(int i=6;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				if(i==j || i==6 || j==1)
				System.out.print("*");
				else
					System.out.print(" ");
			}	
			System.out.println();
		}
	
	}

}