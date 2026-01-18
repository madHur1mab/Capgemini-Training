package array_2D;
import java.util.*;

public class MatrixMultiplication {
	 public static void multiply(int[][] a, int[][] b, int r1, int c1, int c2) {
	        int[][] res = new int[r1][c2];

	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++) {
	                for (int k = 0; k < c1; k++) {
	                    res[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        for (int i = 0; i < r1; i++) {
	            for (int j = 0; j < c2; j++)
	                System.out.print(res[i][j] + " ");
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter number of rows for 1st matrix: ");
	        int r1 = sc.nextInt();
	        System.out.println("Enter number of columns for 1st matrix");
	        int c1 = sc.nextInt();
	        int[][] a = new int[r1][c1];
	        
	        System.out.println("Enter number of rows 2nd matrix: ");
	        int r2 = sc.nextInt();
	        System.out.println("Ente number of columns for 2nd matrix: ");
	        int c2 = sc.nextInt();
	        int[][] b = new int[r2][c2];

	        for (int i = 0; i < r1; i++)
	            for (int j = 0; j < c1; j++)
	                a[i][j] = sc.nextInt();

	        for (int i = 0; i < r2; i++)
	            for (int j = 0; j < c2; j++)
	                b[i][j] = sc.nextInt();

	        multiply(a, b, r1, c1, c2);
	    }
}
