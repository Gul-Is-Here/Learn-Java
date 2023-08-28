package Loops_In_Java;

import java.util.*;

import Basic_Introduction_Java.sum;

public class question_01 {
    // Some of natural number
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Total sum of Natural Number :" + sum);
    }

}
