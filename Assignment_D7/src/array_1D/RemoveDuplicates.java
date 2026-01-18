package array_1D;
import java.util.*;

public class RemoveDuplicates {
	public static int[] removeDuplicates(int[] arr) {

        int[] temp = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[count++] = arr[i];
            }
        }

        int[] result = new int[count];
        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] unique = removeDuplicates(arr);

        for (int k = 0; k<unique.length;k++)
            System.out.print(unique[k] + " ");
    }
}
