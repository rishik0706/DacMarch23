package com.practise.non;

import java.util.Scanner;

public class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			AirlineSystem a = new AirlineSystem();

		    while (true) {
		        System.out.println("Enter 1 to reserve a seat");
		        System.out.println("Enter 2 to view existing reservations");
		        System.out.println("Enter 3 to cancel a reservation");
		        System.out.println("Enter 4 to exit");

		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                a.reserveSeat();
		                break;
		            case 2:
		                a.viewReservations();
		                break;
		            case 3:
		                a.cancelReservation();
		                break;
		            case 4:
		                System.out.println("Exit");
		                System.exit(0);
		                break;
		            default:
		                System.out.println("Invalid choice");
		        }
		        
		   }
		}
}