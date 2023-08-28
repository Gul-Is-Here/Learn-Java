package Loops_In_Java;

import java.util.*;

public class check_prime {
    public static void main(String[] argds) {
        Scanner scan = new Scanner(System.in);
        int prime = scan.nextInt();

        for (int i = 2; i < prime / 2; i++) {
            if (prime % i == 1) {
                System.out.println("prime");
            } else {
                System.out.println("kk");
            }

        }
    }
}