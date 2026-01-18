package array_1D;
import java.util.*;

public class RightRotate {
	public static void rightRotate(int[] arr) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--)
            arr[i] = arr[i - 1];

        arr[0] = last;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        rightRotate(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
