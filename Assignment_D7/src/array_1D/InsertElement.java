package array_1D;
import java.util.*;

public class InsertElement {
	public static int[] insertAtIndex(int[] arr, int element, int index) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++)
            newArr[i] = arr[i];

        newArr[index] = element;

        for (int i = index; i < arr.length; i++)
            newArr[i + 1] = arr[i];

        return newArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int element = sc.nextInt();
        int index = sc.nextInt();

        int[] result = insertAtIndex(arr, element, index);

        for (int k = 0; k<result.length; k++)
            System.out.print(result[k] + " ");
    }
}
