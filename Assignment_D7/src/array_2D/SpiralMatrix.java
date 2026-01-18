package array_2D;
import java.util.*;

public class SpiralMatrix {
	public static void spiralPrint(int[][] a) {

        int top = 0, bottom = a.length - 1;
        int left = 0, right = a[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(a[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(a[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(a[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(a[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of coluns: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        spiralPrint(a);
    }
}
