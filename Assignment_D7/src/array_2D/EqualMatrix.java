package array_2D;
import java.util.*;

public class EqualMatrix {
	public static void checkEqual(int[][] a, int[][] b) {

        boolean equal = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        checkEqual(a, b);
    }
}
