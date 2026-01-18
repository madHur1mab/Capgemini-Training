package array_1D;
import java.util.*;

public class DuplicateElements {
	public static void printDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1)
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }

            if (count > 1)
                System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        printDuplicates(arr);
    }
}
