package Basic_Patterns_In_Java;

public class solid_rombus {
    public static void main(String[] args) {
        /*
         * Solid Rombous Pyramid
         *****
         *****
         *****
         *****
         *****
         * 
         */
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
