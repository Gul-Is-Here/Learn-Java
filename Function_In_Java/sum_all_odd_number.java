package Function_In_Java;

import java.util.Scanner;

public class sum_all_odd_number {
    public static int sumOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {
                sum = sum + i;
                System.out.println(i);

            }

        }
        System.out.println("Sum of Odd Number : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sumOddNumbers(number);
    }

}
