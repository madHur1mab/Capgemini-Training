package array_1D;
import java.util.*;

public class ZigZag {
	public static void zigZag(int[] a, int[] b) {

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            System.out.print(a[i++] + " ");
            System.out.print(b[j++] + " ");
        }

        while (i < a.length)
            System.out.print(a[i++] + " ");

        while (j < b.length)
            System.out.print(b[j++] + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        zigZag(a, b);
    }
}
