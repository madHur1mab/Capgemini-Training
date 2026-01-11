package methods;

import java.util.Scanner;

public class Convert_octal {
	public static int decimal_to_octal(int num) {
		int octal = 0;
	    int place = 1;

	    while (num > 0) {
	        int rem = num % 8;
	        octal = octal + rem * place;
	        place = place * 10;
	        num = num / 8;
	    }

	    return octal;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int n = sc.nextInt();
		
		System.out.println(decimal_to_octal(n));
	}
}
