package Loops_In_Java;

import java.util.*;

public class table_question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println(n + " * " + i + " = " + table);
        }
    }

}
