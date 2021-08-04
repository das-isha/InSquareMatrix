import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

/**
 * This class is the testing harness implementation for the inMatrix method in the A2P1 class 
 */

public class A2P1Test {
	
	//Tests if a number exists in the the 1-D matrix 
	@Test
	void testInMatrixFor1D() throws FileNotFoundException {
		
		int matrixdimension = 1;
		String filePath = "matrix_1D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 23: ", false ,A2P1.inMatrix(matrix, 23));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
	}
	
	//Tests if a number exists the 2-D matrix 
	@Test
	void testInMatrixFor2D() throws FileNotFoundException {
		
		int matrixdimension = 2;
		String filePath = "matrix_2D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 23: ", false ,A2P1.inMatrix(matrix, 23));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 4: ", true ,A2P1.inMatrix(matrix, 4));
		
	}

	//Tests if a number exists the 3-D matrix 
	@Test
	void testInMatrixFor3D() throws FileNotFoundException {
		
		int matrixdimension = 3;
		String filePath = "matrix_3D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 23: ", false ,A2P1.inMatrix(matrix, 23));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 7: ", true ,A2P1.inMatrix(matrix, 7));
	}
	
	//Tests if a number exists the 4-D matrix
	@Test
	void testInMatrixFor4D() throws FileNotFoundException {
		
		int matrixdimension = 4;
		String filePath = "matrix_4D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 23: ", false ,A2P1.inMatrix(matrix, 23));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 9: ", true ,A2P1.inMatrix(matrix, 9));
	}
   
	//Tests if a number exists the 5-D matrix
	@Test
	void testInMatrixFor5D() throws FileNotFoundException {
		
		int matrixdimension = 5;
		String filePath = "matrix_5D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 23: ", false ,A2P1.inMatrix(matrix, 23));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 12: ", true ,A2P1.inMatrix(matrix, 12));
	}
	
	//Tests if a number exists the 6-D matrix
	@Test
	void testInMatrixFor6D() throws FileNotFoundException {
		
		int matrixdimension = 6;
		String filePath = "matrix_6D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 99: ", false ,A2P1.inMatrix(matrix, 99));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 13: ", true ,A2P1.inMatrix(matrix, 13));
	}
	
	//Tests if a number exists the 7-D matrix
	@Test
	void testInMatrixFor7D() throws FileNotFoundException {
		
		int matrixdimension = 7;
		String filePath = "matrix_7D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 99: ", false ,A2P1.inMatrix(matrix, 99));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 15: ", true ,A2P1.inMatrix(matrix, 15));
	}
	
	//Tests if a number exists the 8-D matrix
	@Test
	void testInMatrixFor8D() throws FileNotFoundException {
		
		int matrixdimension = 8;
		String filePath = "matrix_8D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 99: ", false ,A2P1.inMatrix(matrix, 99));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 18: ", true ,A2P1.inMatrix(matrix, 18));
	}
	
	//Tests if a number exists the 9-D matrix
	@Test
	void testInMatrixFor9D() throws FileNotFoundException {
		
		int matrixdimension = 9;
		String filePath = "matrix_9D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 99: ", false ,A2P1.inMatrix(matrix, 99));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 23: ", true ,A2P1.inMatrix(matrix, 23));
	}

	//Tests if a number exists the 10-D matrix
	@Test
	void testInMatrixFor10D() throws FileNotFoundException {
		
		int matrixdimension = 10;
		String filePath = "matrix_10D.txt";
		int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
		
		assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));	
		assertEquals("Testing for 10: ", false ,A2P1.inMatrix(matrix, 10));
		assertEquals("Testing for 99: ", false ,A2P1.inMatrix(matrix, 99));
		assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
		//Testing for bottom left number in the matrix which is the worst case scenario 
		assertEquals("Testing for 26: ", true ,A2P1.inMatrix(matrix, 26));
	}
	//Tests if a number exists in the the 100-D matrix 
		@Test
		void testInMatrixFor100D() throws FileNotFoundException {
			
			int matrixdimension = 100;
			String filePath = "matrix_100D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 101: ", true ,A2P1.inMatrix(matrix, 101));
		}
		
		//Tests if a number exists the 200-D matrix 
		@Test
		void testInMatrixFor200D() throws FileNotFoundException {
			
			int matrixdimension = 200;
			String filePath = "matrix_200D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 201: ", true ,A2P1.inMatrix(matrix, 201));
			
		}

		//Tests if a number exists the 300-D matrix 
		@Test
		void testInMatrixFor300D() throws FileNotFoundException {
			
			int matrixdimension = 300;
			String filePath = "matrix_300D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 301: ", true ,A2P1.inMatrix(matrix, 301));
		}
		
		//Tests if a number exists the 400-D matrix
		@Test
		void testInMatrixFor400D() throws FileNotFoundException {
			
			int matrixdimension = 400;
			String filePath = "matrix_400D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 401: ", true ,A2P1.inMatrix(matrix, 401));
			
		}
	   
		//Tests if a number exists the 500-D matrix
		@Test
		void testInMatrixFor500D() throws FileNotFoundException {
			
			int matrixdimension = 500;
			String filePath = "matrix_500D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 501: ", true ,A2P1.inMatrix(matrix, 501));
		}
		
		//Tests if a number exists the 600-D matrix
		@Test
		void testInMatrixFor600D() throws FileNotFoundException {
			
			int matrixdimension = 600;
			String filePath = "matrix_600D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 601: ", true ,A2P1.inMatrix(matrix, 601));
			
		}
		
		//Tests if a number exists the 700-D matrix
		@Test
		void testInMatrixFor700D() throws FileNotFoundException {
			
			int matrixdimension = 700;
			String filePath = "matrix_700D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 701: ", true ,A2P1.inMatrix(matrix, 701));
			
		}
		
		//Tests if a number exists the 800-D matrix
		@Test
		void testInMatrixFor800D() throws FileNotFoundException {
			
			int matrixdimension = 800;
			String filePath = "matrix_800D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 801: ", true ,A2P1.inMatrix(matrix, 801));
		}
		
		//Tests if a number exists the 900-D matrix
		@Test
		void testInMatrixFor900D() throws FileNotFoundException {
			
			int matrixdimension = 900;
			String filePath = "matrix_900D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 901: ", true ,A2P1.inMatrix(matrix, 901));
			
		}

		//Tests if a number exists the 1000-D matrix
		@Test
		void testInMatrixFor1000D() throws FileNotFoundException {
			
			int matrixdimension = 1000;
			String filePath = "matrix_1000D.txt";
			int[][]matrix = A2P1.readMatrixFromFile(matrixdimension,filePath);
			
			assertEquals("Testing for 6: ", true ,A2P1.inMatrix(matrix, 6));
			assertEquals("Testing for 2001: ", false ,A2P1.inMatrix(matrix, 2001));
			assertEquals("Testing for 2300: ", false ,A2P1.inMatrix(matrix, 2300));
			assertEquals("Testing for 1: ", false ,A2P1.inMatrix(matrix, 1));
			//Testing for bottom left number in the matrix which is the worst case scenario 
			assertEquals("Testing for 1001: ", true ,A2P1.inMatrix(matrix, 1001));
			
		}
}
