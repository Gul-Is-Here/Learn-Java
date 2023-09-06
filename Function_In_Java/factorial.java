package Function_In_Java;

import java.util.Scanner;

public class factorial {

    public static void factorialFuction(int n) {
        if (n < 0) {
            System.out.println("Invalid Input");
            return;
        } else {
            int factorial = 1;
            for (int i = n; i >= 1; i--) {
                factorial = factorial * i;

            }
            System.out.println("Factorial Of Number : " + factorial);

        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        factorialFuction(n);
    }

}
