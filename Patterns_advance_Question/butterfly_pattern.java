package Patterns_advance_Question;

public class butterfly_pattern {
    public static void main(String[] args) {
        int n = 4;
        // Upper half
        for (int i = 1; i <= n; i++) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces Part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        // Lower Half
        for (int i = n; i >= 1; i--) {
            // 1st Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            // Spaces Part
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 2nd Part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

}
