package array_2D;
import java.util.*;

public class MatrixDiagonal {
	public static void printDiagonals(int[][] a) {

        System.out.print("Main Diagonal: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i][i] + " ");

        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i][a.length - 1 - i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows and columns: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        printDiagonals(a);
    }
}
