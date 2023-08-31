package Patterns_advance_Question;

public class solid_rombus {
    public static void main(String[] args) {
        // solid Rombus
        int n = 5;
        // spaces
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // * loop
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
