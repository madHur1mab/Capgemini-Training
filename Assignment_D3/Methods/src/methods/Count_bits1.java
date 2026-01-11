package methods;

import java.util.Scanner;

public class Count_bits1 {
	public static int decimal_to_binary(int num) {
	    int binary = 0;
	    int pos = 1;

	    while (num > 0) {
	        int rem = num % 2;
	        binary = binary + rem * pos;
	        pos = pos * 10;
	        num = num / 2;
	    }

	    return binary;
	}
	
	public static int count_bits(int n) {
	    int bin = decimal_to_binary(n);
	    int count = 0;

	    while (bin > 0) {
	        if (bin % 10 == 1)
	            count++;
	        bin = bin / 10;
	    }

	    return count;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		
		System.out.println("Number of bits which are 1 : " + count_bits(n));
	}
}
