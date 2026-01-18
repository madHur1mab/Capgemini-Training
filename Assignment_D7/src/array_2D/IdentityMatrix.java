package array_2D;
import java.util.*;

public class IdentityMatrix {
	 public static void checkIdentity(int[][] a) {
	        boolean flag = true;

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a.length; j++) {
	                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
	                    flag = false;
	            }
	        }

	        if (flag)
	            System.out.println("Identity Matrix");
	        else
	            System.out.println("Not an Identity Matrix");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter rows and columns of matrix: ");
	        int n = sc.nextInt();
	        int[][] a = new int[n][n];

	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                a[i][j] = sc.nextInt();

	        checkIdentity(a);
	    }
}
