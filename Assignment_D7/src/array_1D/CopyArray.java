package array_1D;
import java.util.*;

public class CopyArray {
	public static int[] copyElements(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
        return copy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] copy = copyElements(arr);

        for (int k = 0; k<copy.length;k++)
            System.out.print(copy[k] + " ");
    }
}
