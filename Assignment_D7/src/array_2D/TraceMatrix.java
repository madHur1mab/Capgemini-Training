package array_2D;
import java.util.*;


public class TraceMatrix {
	public static void findTrace(int[][] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i][i];

        System.out.println("Trace = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        findTrace(a);
    }
}
