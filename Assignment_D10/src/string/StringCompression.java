package string;

public class StringCompression {
	public static String compress(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(compress("abbccc"));
	}
}
