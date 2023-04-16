package com.mange.main;

import java.util.Scanner;

import com.manage.sale.SalesPerson;

public class Driver {
	static Scanner sc= new Scanner(System.in);
	static Management manage = new Management();
	static SalesPerson person = new SalesPerson();
	private static void addSalesPerson() {
		 
		 
		 sc.nextLine();
		 
		 System.out.println("Enter the name of the sales person");
		 person.setName(sc.nextLine());
		 
		 
		 System.out.println("Enter sales figure for monthly basis : ");
		 float[] salesFigure = new float[12];
		 for(int i =0 ; i <salesFigure.length; i++ ) {
			 System.out.println("sales Figure for "+(i+1) +" : ");
			 salesFigure[i] = sc.nextFloat();
		 }
		 person.setSalesFigure(salesFigure);	 
	}
	
	
	private static void calculateAllSales() {
		System.out.println("Enter the employee id");
		int id = sc.nextInt();
		for (int i = 0 ; i< person.length ; i++) {
			if (salesPersons[i] != null && salesPersons[i].getId() == id) {
				System.out.println("Total Sales are " +  salesPersons[i].totalSales());
				return true;
			}
		}
		System.out.println("Employee Not found");
		return false;
		
	}

	private static void calculateFigOfSalesperson() {
		System.out.println("enter the id of sales person");
		SalesPerson person = manage.findSalesPerson(sc.nextInt());
		if(person == null) {
			System.out.println("Id not found or is invalid");
			return;
		}
		System.out.println("Total figure of salesperson : "+ person.caltotFig() );
	}

	private static void updateSalesFigure() {
		System.out.println("enter the id of sales person");
		manage.updateSaleFigure(sc.nextInt());
	}

	

	private static int displayMenu() {
		System.out.println("0.Exit");
		System.out.println("1.Add a New SalesPerson");
		System.out.println("2.Update an existing salesperson");
		System.out.println("3.View total sales for a salesperson");
		System.out.println("4.View total sales for all salespersons");
		return sc.nextInt();
	}
	
	private static void switchMenu() {
		int choice ; 
		
		while( ( choice = displayMenu() ) != 0 ) {
			switch (choice) {
			case 1: addSalesPerson();
				break;
				
			case 2:updateSalesFigure();
				break;
			case 3:calculateFigOfSalesperson();
				break;
			case 4:calculateAllSales();
				break;

			default:
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		
		switchMenu();
	}

	
	
}
