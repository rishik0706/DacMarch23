class Pattern9{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++){
			char ch='A';
			for(int j=5-i;j>=1;j--){
			
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
			
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
			
		}
		
	
	}

}