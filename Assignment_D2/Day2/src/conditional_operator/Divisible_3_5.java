package conditional_operator;

public class Divisible_3_5 {
	public static void main(String[] args) {
		int n = 45;
		String res = (n%3 == 0 && n%5 == 0)? "Divisible" : "Not Divisible";
		System.out.println(res);
	}
}
