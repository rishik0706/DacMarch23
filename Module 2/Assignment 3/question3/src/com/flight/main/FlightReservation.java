package com.flight.main;

import java.util.Scanner;
import com.cdac.Q3.Registration;


public class FlightReservation {
	static Scanner sc=new Scanner(System.in);
	private static void acceptRecord(Registration user) {
		System.out.println("Enter your name : ");
		sc.nextLine();
		user.setName(sc.nextLine());
		System.out.println("Enter your Email ID : ");
		user.setEmail(sc.nextLine());
		System.out.println("Enter your contact number : ");
		user.setContactNumber(sc.nextLine());
	}
	private static int menuList() {
		System.out.println("Press 1. To register");
		System.out.println("Press 2. To check flight availability");
		System.out.println("Press 3. For seat reservation");
		System.out.println("Press 4. To view reservation");
		System.out.println("Press 5. To cancel reservation");
		System.out.println("Press 0. To Exit");
		return sc.nextInt();
	}


	public static void main(String[] args) {
		int choice;
		Airlines a = new Airlines();
		while((choice=FlightReservation.menuList())!=0) {
			switch(choice) {
			case 1:
				Registration user=new Registration();
				FlightReservation.acceptRecord(user);
				user.register(user);
				break;
			case 2:
				a.AvailableFlights();
				break;
			case 3:
				a.reserveSeat();
				break;				
			case 4:
				a.viewReservations();
				break;
			case 5 : 
				a.cancelReservation();
				break;
			}
	}

	}

}
