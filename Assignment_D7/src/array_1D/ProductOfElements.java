package array_1D;
import java.util.*;

public class ProductOfElements {
	public static int findProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++)
            product *= arr[i];
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array:");

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(findProduct(arr));
    }
}
