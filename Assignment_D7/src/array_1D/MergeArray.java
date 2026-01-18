package array_1D;
import java.util.*;

public class MergeArray {
   public  static int[] merge_arrays(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i = 0; i < a.length; i++)
            c[k++] = a[i];

        for (int i = 0; i < b.length; i++)
            c[k++] = b[i];

        return c;
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

        int[] result = merge_arrays(a, b);

        for (int x : result)
            System.out.print(x + " ");
    }
}
