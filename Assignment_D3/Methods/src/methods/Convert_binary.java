package methods;

import java.util.Scanner;

public class Convert_binary {
	
	public static int decimal_to_binary(int num) {
		int bin = 0;
	    int pos = 1;

	    while (num > 0) {
	        int rem = num % 2;
	        bin = bin + rem * pos;
	        pos = pos * 10;
	        num = num / 2;
	    }

	    return bin;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		
		System.out.println(decimal_to_binary(n));
	}
}
