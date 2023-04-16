package com.practise.non;

import java.util.Scanner;


public class AirlineSystem {
	  int ROWS = 10;
      int SEATS = 10;
    
    private  boolean[][] reservations = new boolean[ROWS][SEATS];
    
     public void reserveSeat() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter row number (1-10)");
            int row = scanner.nextInt() - 1;
            System.out.println("Enter seat number (1-10)");
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
            System.out.println("Enter row number (1-10)");
            int row = scanner.nextInt() - 1;
            System.out.println("Enter seat number (1-10)");
            int seat = scanner.nextInt() - 1;

            if (row < 0 || row >= ROWS || seat < 0 || seat >= SEATS) {
                System.out.println("Invalid row or seat number");
                continue;
            }

            if (reservations[row][seat]) {
                System.out.println("Seat is not reserved");
                continue;
            }

            reservations[row][seat] = false;
            System.out.println("Reservation cancelled");
            break;
       
   }
}
   
}
