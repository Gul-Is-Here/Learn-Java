package Loops_In_Java;

import java.util.*;

public class even_number {
    public static void main(String[] args) {
        // Print all the even number until n number
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
