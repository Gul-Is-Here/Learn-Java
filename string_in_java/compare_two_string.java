package string_in_java;

import java.util.Scanner;

public class compare_two_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 1st String ");
        String a_string = sc.nextLine();
        System.out.println(" Enter 2nd String");
        String b_String = sc.nextLine();
        // CompareTo function using compre to Strings
        /*
         * It compare Strings using three methods
         * 1st if "a>b" it returns +ve value
         * 2nd if " a_String == b_String " it returns 0
         * 3rd if " a_String< b_String " it return -ve value
         * Do not use " == " to check the equality in some cases it gives incorrect
         * answer
         */

        if (a_string.compareTo(b_String) == 0) {
            System.out.println("Strings are equals");

        } else {
            System.out.println(" Strings are not equal");
        }
    }
}
