package Function_In_Java;

import java.util.Scanner;

public class average_three_number {
    public static int threeNumberAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        System.out.println("Average of Three number are : " + average);
        return average;
    }

    public static void main(String[] args) {
        System.out.println("Enter 1st Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c = sc.nextInt();
        threeNumberAverage(a, b, c);
    }

}
