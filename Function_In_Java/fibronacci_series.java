package Function_In_Java;

import java.util.Scanner;

public class fibronacci_series {
    public static void getFebronacciSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getFebronacciSeries();
    }

}
