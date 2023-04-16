package com.resturant.main;

import java.util.Scanner;

/*
 * create a program that helps a restaurant manage their menu. The restaurant has 10 
dishes on their menu, and they want to be able to add, remove, and modify dishes 
easily.
Your task is to create a Java program that uses arrays to store the menu items and 
their corresponding prices. The program should have a menu that allows the user to 
perform the following actions:
a. View the current menu with prices
b. Add a new dish to the menu
c. Remove a dish from the menu
d. Modify the price of a dish on the menu
e. Exit the program
When the user chooses to add a new dish, the program should prompt the user for 
the name of the dish and its price. The new dish should be added to the end of the 
menu array.
When the user chooses to remove a dish, the program should prompt the user for 
the index of the dish they want to remove. The dish at that index should be removed 
from the menu array.

When the user chooses to modify the price of a dish, the program should prompt the 
user for the index of the dish they want to modify and the new price. The price of the 
dish at that index should be updated in the menu array.
After each action, the program should display the updated menu with prices. When 
the user chooses to exit the program, the program should display a farewell message 
and terminate
 */

public class Program {
	static Scanner sc= new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add New Dish");
		System.out.println("2.Remove Current Dish");
		System.out.println("3.Modify New Price for the Dish");
		System.out.println("4.View menu");
		
		return sc.nextInt();
	}
	
	public static void addMenu(Dish dish) {
		System.out.println("Enter the dish name");
		sc.nextLine();
		dish.setDishName(sc.nextLine());
		System.out.println("Enter the Price");
		dish.setPrice(sc.nextInt());
		
	}
	
	public static void main(String[] args) {
			int choice ;
			Resturant rest = new Resturant();
			while((choice = menuList()) != 0 ) {
				switch (choice) {
				case 1:
						Dish dish= new Dish();
						addMenu(dish);
						rest.addDish(dish);
					break;
				case 2:	
						System.out.println("Enter Name of dish to remove");
						sc.nextLine();
					 	boolean removed = rest.removeDish(sc.nextLine());
						System.out.println(removed? "the dish is removed" : "Dish not found");
					break;
				case 3:
						System.err.println("Enter the name of dish");
						sc.nextLine();
						rest.editPrice(sc.nextLine());
						
					break;
				case 4: rest.viewMenu();
					break;

				default:
					break;
				}
			}
	}

	
}
