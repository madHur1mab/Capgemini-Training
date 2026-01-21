package string;

public class BalancedParentheses {
	 public static boolean isBalanced(String s) {

	        int count = 0;

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            if (c == '(') 
	            	count++;
	            else if (c == ')') 
	            	count--;

	            if (count < 0) 
	            	return false;
	        }
	        return count == 0;
	    }
	 
	 public static void main(String[] args) {
		System.out.println(isBalanced("({{[]}})"));
	}
}
