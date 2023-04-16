package com.example.main;

import java.util.Scanner;

public class Menu {
	private Dish[] dishes = Dish.values();
	private static Scanner sc = new Scanner(System.in);
	private float[][] billData = new float[4][2];
	{	int n=4;
		for(int i = 0 ; i<n ; i++) {
			billData[0] = new float[] {0,0};
		}
	}
	
	public void takeOrder() {
		int choice;
		System.out.println("Welcome to XYZ Restro");
		while ( (choice = printMenu())!=5 ) {
		}
	}
	
	public int printMenu() {
		System.out.println("Chose one of the following");
		int index = 1;
		for (Dish dish : dishes) {
			System.out.println(index +" " + dish.getName() + " Rs. " + dish.getPrice());
			index++;
		}
		System.out.println("5. Exit");
		System.out.print("Please enter the dish number you wish to order : ");
		int choice = sc.nextInt();
		if (choice == 5)
			return choice;
		System.out.print("Please enter the quantity to order             : ");
		int quant = sc.nextInt();
		if (choice(choice, quant)) {
			if (!repeat()) {
				bill();
				System.out.println("Thank you for Eating with us");
				return 5;
			}
		}else {
			System.out.println("Enter valid Choice /Quantity");
		}
		return choice;
	}
	
	private void bill() {
		
		for (int i = 0 ; i< billData.length; i++) {
			if (billData[i][0] != 0) {
				System.out.println(dishes[i] + " " + billData[i][0] +" Rs " + billData[i][1]);
			}
		}
		
	}

	public boolean  choice(int choice, int quantity) {
		if (quantity < 1 || choice < 1 || choice > 5 )
			return false;
		billData[choice-1][0] +=quantity;
		billData[choice-1][1] = billData[choice-1][0] * dishes[choice-1].getPrice();
		System.out.println("Total Cost: "+ billData[choice-1][1]);
		return true;
	}
	
	public boolean repeat() {
		System.out.println("Do you want to eat another dish Y/N");
		char c = sc.next().charAt(0);
		if (c == 'Y') {
	
			return true;
		}else if(c == 'N') {
			
			return false;
		}else {
			System.out.println("Enter valid input");
			return repeat();
		}
	}
	
}
