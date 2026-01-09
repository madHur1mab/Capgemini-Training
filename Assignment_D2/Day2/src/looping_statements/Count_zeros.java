package looping_statements;

public class Count_zeros {
	public static void main(String[] args) {
		int n = 53604506;
		int zeros = 0;
		
		while(n != 0) {
			int rem = n % 10;
			if(rem == 0) {
				zeros++;
			}
			n = n / 10;
		}
		System.out.println("Number of zeros are :" + zeros);
	}
}
