package methods;

import java.util.Scanner;

public class Happy_number {
	
	public static boolean check_happy_number(int num) {
		if(num==1 || num==7) return true;
        else if(num<10) return false;
        else{
            int sum=0;
            while(num>0){
                int temp=num%10;
                sum+= temp*temp;
                num=num/10;
            }
            return check_happy_number(sum);
        }
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println(check_happy_number(n));
	}
}
