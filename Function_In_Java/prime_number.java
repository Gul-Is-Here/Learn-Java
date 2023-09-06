package Function_In_Java;

import java.util.Scanner;

public class prime_number {
    public static boolean chcek_prime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = chcek_prime(number);
        if (isPrime) {
            System.out.println(number + " Number is Prime");
        } else {
            System.out.println(number + " Number is not Prime");
        }
    }

}
