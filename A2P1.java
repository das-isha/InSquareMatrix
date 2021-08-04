import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A2P1 {

	// Since, we can ignore constants the complexity of the inMatrix function is
	// O(N).
	// Summing the time-complexity statements from each line we get:
	// O(1)+ O(1)+O(1)+ O(1) + O(1) +(O(2N) * O (1))) => O(2N) => O(N)
	public static boolean inMatrix(int[][] matrix, int x) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) // O(1)
			return false; // O(1)

		int n = matrix.length; // (Number of rows) O(1)
		int m = matrix[0].length; // (Number of columns)O(1)

		int i = 0; // O(1)
		int j = m - 1; // O(1)

		// start from top right corner of the matrix
		while (i < n && j >= 0) { // O(N) + O(N) => O(2N)=> O (N) ((Where N is the number of rows and N is the
									// number of columns of matrix)

			if (matrix[i][j] == x) { // O(1)
				return true; // O(1)
			} else if (matrix[i][j] > x) { // O(1)
				j--; // move left //O(1)
			} else {
				i++; // move down O(1)
			}

		}

		// element not found
		return false; // O(1)
	}

	public static void main(String[] args) {
		try {

			int matrixdimension = Integer.parseInt(args[0]);
			String filePath = args[1];

			// Populates file data in 2-D matrix by calling readMatrixFromFile method
			int[][] matrix = readMatrixFromFile(matrixdimension, filePath);

			// prints the result of the matrix
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			// using System.nanoTime() finds the difference between the time right before
			// and after inMatrix is invoked
			long startTime_inMatrixLinearSearch = System.nanoTime();
			boolean isFound = inMatrix(matrix, 6);
			long endTime_inMatrixLinearSearch = System.nanoTime();

			System.out.println("Result of inMatrix: " + isFound);
			System.out.println("Running-Time for inMatrix is: "
					+ (endTime_inMatrixLinearSearch - startTime_inMatrixLinearSearch) + "ms");
			System.out.println("Matrix Dimension: " + matrixdimension);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter valid inputs (dimension or file name or both) : " + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("File not found error occured: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error occured: " + e.getMessage());
		}

	}

	// Read from a file and fill a local two-dimensional array (matrix) with the
	// specified dimensions.
	public static int[][] readMatrixFromFile(int dimension, String filePath) throws FileNotFoundException {

		int rows = dimension;
		int columns = dimension;
		int[][] myArray = new int[rows][columns];

		File inputFile = new File(filePath);
		Scanner sc = new Scanner(inputFile);
		// The file will follow a format where a space indicates a new number and a new
		// line indicates a new row
		while (sc.hasNextLine()) {
			for (int i = 0; i < myArray.length; i++) {
				String[] line = sc.nextLine().trim().split(" ");
				for (int j = 0; j < line.length; j++) {
					myArray[i][j] = Integer.parseInt(line[j]);
				}
			}
		}
		sc.close();
		return myArray;

	}

}
