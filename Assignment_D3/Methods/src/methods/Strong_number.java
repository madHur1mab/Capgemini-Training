package methods;

import java.util.Scanner;

public class Strong_number {
	
	public static int factorial(int num) {
		if(num == 0)
	        return 1;
	        
	    return num * factorial(num-1);
	}
	
	public static boolean check_strong_number(int num) {
	 
		int sum = 0;
	    int temp = num;
	    int rem;
	    
	    while(temp!=0){
	        rem = temp % 10;
	        
	        sum = sum + factorial(rem);
	        temp /= 10;
	    }
	    
	    return sum == num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(check_strong_number(n));
	}
}
