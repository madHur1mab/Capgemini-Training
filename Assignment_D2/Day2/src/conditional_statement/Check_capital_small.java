package conditional_statement;

public class Check_capital_small {
	public static void main(String[] args) {
		char c = 'c';
		if (c >= 'A' && c<= 'Z'){
			System.out.println("Capital");
		}
		else if (c >= 'a' && c<= 'z'){
			System.out.println("small");
		}
		else {
			System.out.println("Not an alphabet");
		}
	}
}		

