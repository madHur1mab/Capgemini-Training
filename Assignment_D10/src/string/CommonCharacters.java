package string;

public class CommonCharacters {
	public static String findCommon(String s1, String s2) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) != -1) {
                boolean alreadyPresent = false;

                for (int j = 0; j < res.length(); j++) {
                    if (res.charAt(j) == c) {
                        alreadyPresent = true;
                        break;
                    }
                }

                if (!alreadyPresent) {
                    res.append(c).append(" ");
                }
            }
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(findCommon("apple", "grape"));
    }
}
