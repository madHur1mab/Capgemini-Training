package array_2D;
import java.util.*;

public class RowColumnSearch {
	public static void search(int[][] a, int key) {

        int i = 0;
        int j = a[0].length - 1;

        while (i < a.length && j >= 0) {
            if (a[i][j] == key) {
                System.out.println("Found at position (" + i + "," + j + ")");
                return;
            } else if (a[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Element not found");
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

        int key = sc.nextInt();
        search(a, key);
    }
}
