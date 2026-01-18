package array_2D;
import java.util.*;

public class BoundaryElements {
	public static void printBoundary(int[][] a) {
        int r = a.length;
        int c = a[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows in matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns in matrix: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        printBoundary(a);
    }
}
