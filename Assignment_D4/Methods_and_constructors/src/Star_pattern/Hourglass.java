package Star_pattern;

public class Hourglass {
	int n;

    Hourglass(int n) {
        this.n = n;
    }

    void printPattern() {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                if (i == 0 || j == 0 || j == (2 * (n - i) - 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                if (i == 0 || j == 0 || j == (2 * (n - i) - 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hourglass hg = new Hourglass(5);
        hg.printPattern();
    }
}
