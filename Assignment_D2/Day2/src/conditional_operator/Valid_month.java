package conditional_operator;

public class Valid_month {
	public static void main(String[] args) {
		int n = 13;
		String res = (n>=1 && n<=12)? "valid" : "invalid";
		System.out.println(res);
	}
}
