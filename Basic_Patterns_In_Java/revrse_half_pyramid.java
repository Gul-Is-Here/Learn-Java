package Basic_Patterns_In_Java;

public class revrse_half_pyramid {
    public static void main(String[] args) {
        // Reverse Pyramid
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
