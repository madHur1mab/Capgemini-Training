package array_1D;
import java.util.*;

public class LinearSearch {
	public static int linear_search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();

        int index = linear_search(arr, key);

        if (index == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + index);
    }
}
