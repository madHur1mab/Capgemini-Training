package array_2D;
import java.util.*;

public class SaddlePoint {
	public static void findSaddle(int[][] a) {

        for (int i = 0; i < a.length; i++) {

            int min = a[i][0];
            int col = 0;

            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                    col = j;
                }
            }

            boolean saddle = true;
            for (int k = 0; k < a.length; k++) {
                if (a[k][col] > min) {
                    saddle = false;
                    break;
                }
            }

            if (saddle) {
                System.out.println("Saddle Point = " + min);
                return;
            }
        }
        System.out.println("No Saddle Point");
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

        findSaddle(a);
    }
}
