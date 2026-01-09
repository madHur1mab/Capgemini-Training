package looping_statements;

public class Even_odd_digits {
	public static void main(String[] args) {
		int n = 536;
		int even = 0;
		int odd = 0;
		
		while(n != 0) {
			int rem = n % 10;
			if(rem % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
			n = n / 10;
		}
		System.out.println("Even digits :" + even);
		System.out.println("Odd digits :" + odd);
	}
	
}
