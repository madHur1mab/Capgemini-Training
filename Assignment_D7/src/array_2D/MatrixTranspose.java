package array_2D;
import java.util.*;

public class MatrixTranspose {
	 static void transpose(int[][] a) {
	        for (int j = 0; j < a[0].length; j++) {
	            for (int i = 0; i < a.length; i++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter number of rows: ");
	        int r = sc.nextInt();
	        System.out.println("Enter number of columns: ");
	        int c = sc.nextInt();
	        int[][] a = new int[r][c];

	        for (int i = 0; i < r; i++)
	            for (int j = 0; j < c; j++)
	                a[i][j] = sc.nextInt();

	        transpose(a);
	    }
}
