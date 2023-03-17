class Pattern11
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){

			for (int space=0;space<n-i ;space++){
				System.out.print("  ");
			}



			for(int j=1;(2*i)>j;j++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}