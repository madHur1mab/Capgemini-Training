package array_1D;
import java.util.*;

public class NthLargestElement {
	public static int findLargest(int[] arr, int n) {
      
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int n = sc.nextInt();

        System.out.println(findLargest(arr, n));
    }
}
