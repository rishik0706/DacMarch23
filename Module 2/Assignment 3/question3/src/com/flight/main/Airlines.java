package com.flight.main;
import java.util.Scanner;
import com.cdac.Q3.Registration;

public class Airlines {
	private String[] flights = { "Flight 1"};
		  int ROWS = 5;
	      int SEATS = 5;
	    
	    private  boolean[][] reservations = new boolean[ROWS][SEATS];
	    
	    public void AvailableFlights() {
	    	for(int i=0; i<flights.length; i++) {
	    		System.out.println(flights[i]);
	    		viewReservations();
	    	}
	    }
	    
	     public void reserveSeat() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter row number (1-5)");
	            int row = scanner.nextInt() - 1;
	            System.out.println("Enter seat number (1-5)");
	            int seat = scanner.nextInt() - 1;

	            if (row < 0 || row >= ROWS || seat < 0 || seat >= SEATS) {
	                System.out.println("Invalid row or seat number");
	                continue;
	            }

	            if (reservations[row][seat]) {
	                System.out.println("Seat is already reserved");
	                continue;
	            }

	            reservations[row][seat] = true;
	            System.out.println("Seat reserved");
	            System.out.println(" Your seat is : "+"row : "+row+1+" "+"Coloumn : "+seat+1);
	            break;
	        }
	    }

	    public void viewReservations() {
	        for (int row = 0; row < ROWS; row++) {
	            for (int seat = 0; seat < SEATS; seat++) {
	                System.out.print(reservations[row][seat] ? "R" : "-");
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }

	   public void cancelReservation() {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Enter row number (1-5)");
	            int row = scanner.nextInt() - 1;
	            System.out.println("Enter seat number (1-5)");
	            int seat = scanner.nextInt() - 1;

	            if (row < 0 || row >= ROWS || seat < 0 || seat >= SEATS) {
	            	reservations[row][seat] = false;
	            	System.out.println("Invalid row or seat number");
	                break;
	            }

	            else if (reservations[row][seat]) {
	            	reservations[row][seat] = false;
	            	System.out.println("Reservation cancelled");
	                break;
	            }
	        	}	        	 
	}
	   
	}
