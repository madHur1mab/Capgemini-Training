package methods;

import java.util.Scanner;

public class Convert_decimal {
	public static int binary_to_decimal(int num) {
		int decimal = 0;
	    int base = 1;   

	    while (num > 0) {
	        int rem = num % 10;     
	        decimal = decimal + rem * base;
	        base = base * 2;
	        num = num / 10;
	    }

	    return decimal;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		
		System.out.println(binary_to_decimal(n));
	}
}


