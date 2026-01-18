package array_1D;
import java.util.*;

public class DupliatePrime {
	public static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void duplicate_prime(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            if (!isPrime(arr[i]))
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > 1)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        duplicate_prime(arr);
    }
}
