
public class half_pyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 && j == 1) {
                    System.out.print("*");
                } else if (i == 2 && j <= 2) {
                    System.out.print("*");
                } else if (i == 3 && j <= 3) {
                    System.out.print("*");
                } else if (i == 4 && j <= 4) {
                    System.out.print("*");
                }

            }
            System.out.println();

        }

        // Best Approach
        System.out.println("\nBest Approach\n");
        for (int k = 1; k <= 4; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
