package com.matirxoperation.main;

import java.util.Scanner;

public class MatrixOperations {
	public int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
		int rows = matrixA.length;
		int cols = matrixA[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		return result;
	}

	public int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
		int rows = matrixA.length;
		int cols = matrixA[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrixA[i][j] - matrixB[i][j];
			}
		}
		return result;
	}

	public int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
		int rows = matrixA.length;
		int cols = matrixA[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = matrixA[i][j] * matrixB[i][j];
			}
		}
		return result;
	}

	public int[][] transposeMatrix(int[][] matrix) {

		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// result[i][j] = result[j][i];
				result[i][j] = matrix[j][i];
			}
		}
		return result;
	}

	public void displayMatrix(int[][] result) {
		int rows = result.length;
		int cols = result[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
