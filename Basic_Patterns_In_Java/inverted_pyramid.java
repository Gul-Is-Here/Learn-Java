package Basic_Patterns_In_Java;

public class inverted_pyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.print(" ");
    }

}
