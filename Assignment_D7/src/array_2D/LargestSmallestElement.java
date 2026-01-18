package array_2D;
import java.util.*;

public class LargestSmallestElement {
	 public static void findMaxMin(int[][] a) {
	        int max = a[0][0], min = a[0][0];

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[0].length; j++) {
	                if (a[i][j] > max) max = a[i][j];
	                if (a[i][j] < min) min = a[i][j];
	            }
	        }

	        System.out.println("Largest = " + max);
	        System.out.println("Smallest = " + min);
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

	        findMaxMin(a);
	    }
	    
}
