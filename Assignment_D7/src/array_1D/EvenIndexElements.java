package array_1D;
import java.util.*;

public class EvenIndexElements {
	public static void printEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i += 2)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printEvenIndex(arr);
    }
}
