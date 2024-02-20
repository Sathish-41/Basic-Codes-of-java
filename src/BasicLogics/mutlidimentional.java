package BasicLogics;
import java.util.Arrays;
public class mutlidimentional {

	public class AddTwoMatrices {
		 
	    private static void sumOfMatrices(int[][] a, int[][] b) {
	 
	        System.out.println("Matrix A :" + Arrays.deepToString(a));
	        System.out.println("Matrix B :" + Arrays.deepToString(b));
	         
	        int row = a.length;
	        int col = a.length;
	 
	        int[][] sum = new int[row][col];
	        int iRow = 0, iCol = 0;
	 
	        while (iRow < row) {
	 
	            while (iCol < col) {
	                sum[iRow][iCol] = a[iRow][iCol] + b[iRow][iCol];
	                iCol++;
	            }
	            iCol = 0;
	            iRow++;
	        }
	 
	        System.out.println("Sum (A+B) :" + Arrays.deepToString(sum));
	    }
	 
	    public static void main(String[] args) {
	        int[][] A = {{1, 2, 3},
	 
	                    {4, 5, 6},
	 
	                    {7, 8, 9}};
	 
	        int[][] B = {{11, 12, 13},
	 
	                    {14, 15, 16},
	 
	                    {17, 18, 19}};
	 
	        sumOfMatrices(A, B);
	    }
	}
}