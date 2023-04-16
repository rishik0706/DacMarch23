package com.resturant.main;

import java.util.Scanner;

public class Resturant{
	Dish [] arr;
	int index;
	
	Resturant(){
		this(5);
	}
	
	Resturant(int size){
		this.arr = new Dish[size];
	}
	
	public void addDish(Dish arr) {
		System.out.println("Please enter the new Dish");
		if(index < this.arr.length) {
			this.arr[index] = arr;
			index ++;
		}
	}
	
	public boolean removeDish(String string ) {
		
			for(int i=0 ; i< this.arr.length ;i++) {
				if(arr[i] != null && arr[i].getDishName().equals(string)) {
					arr[i]=null;
					return true;
				}
			}
		return false;	
	}

	public void editPrice(String str) {
		Scanner sc= new Scanner(System.in);
		for(int i=0 ; i< this.arr.length ;i++) {
			if(arr[i] != null && arr[i].getDishName().equals(str)) {
				System.out.println("Enter the new price");
				arr[i].setPrice(sc.nextFloat());
				
			}
		}
		
	}

	public void viewMenu() {
		
		for(Dish i : arr) {
			if( i != null)
			System.out.println(i);
		}
		
	}
}
