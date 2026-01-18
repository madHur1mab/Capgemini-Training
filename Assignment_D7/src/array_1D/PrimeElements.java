package array_1D;
import java.util.*;

public class PrimeElements {
	public static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimes(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printPrimes(arr);
    }
}
