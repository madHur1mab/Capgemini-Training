package array_1D;
import java.util.*;

public class FibonacciElements {
	public static boolean isFibonacci(int num) {

        int a = 0, b = 1;

        while (a <= num) {
            if (a == num)
                return true;

            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

    public static void printFibonacci(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (isFibonacci(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printFibonacci(arr);
    }
}
