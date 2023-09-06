package Function_In_Java;

import java.util.Scanner;

public class greatest_common_divisor {
    /*
     * Write function that calculate the greatest common divisor of 2 numbers
     */
    public static void greatestCommonDivison(int a, int b) {
        for (int i = 2; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {

                System.out.println(" Greatest common Divisor : " + i);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbr");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        greatestCommonDivison(a, b);
    }

}
