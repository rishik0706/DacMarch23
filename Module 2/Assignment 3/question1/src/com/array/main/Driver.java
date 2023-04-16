package com.array.main;

public class Driver {
	public static void main(String[] args) {
		
		int [] array = Operations.getArray();
		System.out.println("Array	:	");
		Operations.displayArray(array);
		System.out.println("Array element's sum	:	");
		System.out.println(Operations.addArr(array));
		System.out.println("Array element's average	:	");
		System.out.println(Operations.average(array));
		System.out.println("Array element's Min	:	");
		System.out.println(Operations.Min(array));
		System.out.println("Array element's Max	:	");
		System.out.println(Operations.Max(array));
		System.out.println("Sorted Array	:	");
		Operations.sort(array);
		Operations.displayArray(array);
		
		
	}	
}
