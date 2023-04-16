package com.matirxoperation.main;

import java.util.Scanner;

public class Driver {
	static Scanner input = new Scanner(System.in);

	// display menu of options
	public static int menuList() {
		System.out.println("Choose an operation to perform:");
		System.out.println("0. Exit");
		System.out.println("1. Addition of two matrices");
		System.out.println("2. Subtraction of two matrices");
		System.out.println("3. Multiplication of two matrices");
		System.out.println("4. Transpose of a matrix");
		System.out.print("Enter your choice: ");
		return input.nextInt();

	}

	public static void main(String[] args) {
		MatrixOperations x = new MatrixOperations();

		// prompt user for number of rows and columns of matrix A
		System.out.print("Enter the number of rows for matrix A: ");
		int numRowsA = input.nextInt();
		System.out.print("Enter the number of columns for matrix A: ");
		int numColsA = input.nextInt();

		// prompt user for elements of matrix A
		int[][] matrixA = new int[numRowsA][numColsA];
		System.out.println("Enter the elements of matrix A:");
		for (int i = 0; i < numRowsA; i++) {
			for (int j = 0; j < numColsA; j++) {
				matrixA[i][j] = input.nextInt();
			}
		}

		// prompt user for number of rows and columns of matrix B
		System.out.print("Enter the number of rows for matrix B: ");
		int numRowsB = input.nextInt();
		System.out.print("Enter the number of columns for matrix B: ");
		int numColsB = input.nextInt();

		// prompt user for elements of matrix B
		int[][] matrixB = new int[numRowsB][numColsB];
		System.out.println("Enter the elements of matrix B:");
		for (int i = 0; i < numRowsB; i++) {
			for (int j = 0; j < numColsB; j++) {
				matrixB[i][j] = input.nextInt();
			}
		}

		// perform selected operation and display result
		int choice;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				if (numRowsA != numRowsB || numColsA != numColsB) {
					System.out.println("Error: matrices must have the same dimensions.");
				} else {
					int[][] result = x.addMatrices(matrixA, matrixB);
					x.displayMatrix(result);
				}
				break;
			case 2:
				if (numRowsA != numRowsB || numColsA != numColsB) {
					System.out.println("Error: matrices must have the same dimensions.");
				} else {
					int[][] result = x.subtractMatrices(matrixA, matrixB);
					x.displayMatrix(result);
				}
				break;
			case 3:
				if (numColsA != numRowsB) {
					System.out.println("Error: number of columns of matrix A must equal number of rows of matrix B.");
				} else {
					int[][] result = x.multiplyMatrices(matrixA, matrixB);
					x.displayMatrix(result);
				}
				break;
			case 4:
				System.out.print("Which matrix to transpose? (A or B): ");
				String matrixChoice = input.next();

				if (matrixChoice.equalsIgnoreCase("A")) {
					int[][] result = x.transposeMatrix(matrixA);
					x.displayMatrix(result);
				} else if (matrixChoice.equalsIgnoreCase("B")) {
					int[][] result = x.transposeMatrix(matrixB);
					x.displayMatrix(result);
				} else {
					System.out.println("Error: invalid matrix choice.");
				}
				break;
			default:
				System.out.println("Error: invalid choice.");
			}
		}
		System.out.print("You are exited successfully!! ");
	}

}