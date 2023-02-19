package com.prog2.labs;

/**
 * @author adinashby
 *
 */

public class LabFive {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
	 */

	public boolean isMagicSquare(int[][] matrix) {
    int n = matrix.length;
    int magicSum = n * (n * n + 1) / 2; // Calculate the magic sum
    
    // Check the sum of each row
    for (int i = 0; i < n; i++) {
        int rowSum = 0;
        for (int j = 0; j < n; j++) {
            rowSum += matrix[i][j];
        }
        if (rowSum != magicSum) {
            return false;
        }
    }
    
    // Check the sum of each column
    for (int j = 0; j < n; j++) {
        int colSum = 0;
        for (int i = 0; i < n; i++) {
            colSum += matrix[i][j];
        }
        if (colSum != magicSum) {
            return false;
        }
    }
    
    // Check the sum of the diagonal from top left to bottom right
    int diag1Sum = 0;
    for (int i = 0; i < n; i++) {
        diag1Sum += matrix[i][i];
    }
    if (diag1Sum != magicSum) {
        return false;
    }
    
    // Check the sum of the diagonal from top right to bottom left
    int diag2Sum = 0;
    for (int i = 0; i < n; i++) {
        diag2Sum += matrix[i][n - i - 1];
    }
    if (diag2Sum != magicSum) {
        return false;
    }
    
    // If all checks pass, the square is a magic square
    return true;
}






		
	

	public int[][] magicSquareGenerator(int arraySize) {
		int[][] square = new int[arraySize][arraySize];
                int row = arraySize - 1;
                int col = arraySize / 2;
                square[row][col] = 1;
    
    for (int i = 2; i <= arraySize * arraySize; i++) {
        if (square[(row + 1) % arraySize][(col + 1) % arraySize] == 0) {
            row = (row + 1) % arraySize;
            col = (col + 1) % arraySize;
        } else {
            row = (row - 1 + arraySize) % arraySize;
        }
        square[row][col] = i;
    }
    
    return square;
}
}
