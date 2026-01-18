package array_1D;
import java.util.*;

public class ReverseUsingArray {
	public static int[] reverseUsingArray(int[] arr) {
        int[] rev = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--)
            rev[index++] = arr[i];

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] res = reverseUsingArray(arr);

        for (int k = 0; k<res.length; k++)
            System.out.print(res[k] + " ");
    }
}
