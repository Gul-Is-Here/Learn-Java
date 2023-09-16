package string_in_java;

import java.util.Scanner;

public class output_strings {
    /*
     * Access character of Strings using ChatAt function
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fname = sc.nextLine();

        for (int i = 0; i < fname.length(); i++) {
            System.out.println(fname.charAt(i));
        }
    }

}