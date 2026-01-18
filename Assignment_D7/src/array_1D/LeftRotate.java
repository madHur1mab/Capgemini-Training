package array_1D;
import java.util.*;
public class LeftRotate {
	public static void leftRotate(int[] arr) {

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];

        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        leftRotate(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
