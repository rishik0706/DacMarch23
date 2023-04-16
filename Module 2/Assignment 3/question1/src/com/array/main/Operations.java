package com.array.main;
import java.util.Scanner;

public class Operations{
	public static int addArr(int[] array) {
		int sum=0; 
		for(int i=0; i<array.length;++i) {
			sum = sum +array[ i ];
		}
		return sum;
	}

	public static void displayArray(int[] array) {
		for( int i=0 ; i<array.length ; i++) {
			System.out.println("Array [ "+ i +" ] :"+array[i]);
		}
	}

	public static int[] getArray() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int [] arr = new int[sc.nextInt()];
		
		for(int i =0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static double average(int[] array) {
		double avg= addArr(array) / array.length;
		return avg;
	}

	public static int Min(int[] array) {
		int min=array[0];
		for(int i=0 ; i< array.length ; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int Max(int[] array) {
		int max=array[0];
		for(int i=0 ; i< array.length ; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		return max;	
	}

	public static int[] sort(int[] array) {
		
			for(int i = 0; i<array.length ; ++i ) {
				for(int j = 0 ; j<array.length ; ++j) {
				if(array[i]< array[j]) {
					int temp1 = array[i];
					array[i] = array[j];
					array[j] = temp1;
				}
			  }
			}	
		return array;
	}
	
}
