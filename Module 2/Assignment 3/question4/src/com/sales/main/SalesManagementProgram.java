package com.sales.main;

import java.util.Scanner;

public class SalesManagementProgram {

    static Scanner scanner = new Scanner(System.in);
    static Salesperson[] salespersons = new Salesperson[10];
    static int numSalespersons = 0;

    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("Sales Management Program");
            System.out.println("1. Add a new salesperson");
            System.out.println("2. Update an existing salesperson");
            System.out.println("3. View total sales for a salesperson");
            System.out.println("4. View total sales for all salespersons");
            System.out.println("5. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addSalesperson();
                    break;
                case 2:
                    updateSalesperson();
                    break;
                case 3:
                    viewTotalSalesForSalesperson();
                    break;
                case 4:
                    viewTotalSalesForAllSalespersons();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    static void addSalesperson() {
        System.out.print("Enter name of salesperson: ");
        String name = scanner.next();
        System.out.print("Enter ID of salesperson: ");
        int id = scanner.nextInt();
        int[] sales = new int[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter sales for month " + (i+1) + ": ");
            sales[i] = scanner.nextInt();
        }
        Salesperson salesperson = new Salesperson(name, id, sales);
        salespersons[numSalespersons] = salesperson;
        numSalespersons++;
        System.out.println("Salesperson added successfully.");
    }

    static void updateSalesperson() {
        System.out.print("Enter ID of salesperson to update: ");
        int id = scanner.nextInt();
        Salesperson salesperson = getSalespersonById(id);
        if (salesperson == null) {
            System.out.println("Salesperson not found.");
            return;
        }
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter sales for month " + (i+1) + ": ");
            salesperson.getSales()[i] = scanner.nextInt();
        }
        System.out.println("Salesperson updated successfully.");
    }

    private static Salesperson getSalespersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	static void viewTotalSalesForSalesperson() {
        System.out.print("Enter ID of salesperson to view total sales for: ");
        int id = scanner.nextInt();
        Salesperson salesperson = getSalespersonById(id);
        if (salesperson == null) {
            System.out.println("Salesperson not found.");
            return;
        }
        int totalSales = 0;
        for (int i = 0; i < 12; i++) {
            totalSales += salesperson.getSales()[i];
        }
        System.out.println("Total sales for " + salesperson.getName() + " (ID " + salesperson.getId() + "): " + totalSales);
    }

    static void viewTotalSalesForAllSalespersons() {
        System.out.println("Total sales for all salespersons:");
        System.out.println("Name\tID\tTotal Sales");
       /* for (int i = 0; i < numSalespersons; i++) {
        Salesperson salesperson = salespersons[i];
            int totalSales = 0;
            //for  */
        	}
}


