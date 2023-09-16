package string_in_java;

import java.util.Scanner;

public class string_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fname = sc.nextLine();
        String lname = sc.nextLine();
        System.out.println(fname + " " + lname);
    }

}
