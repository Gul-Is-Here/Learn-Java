package string_in_java.Home__Task;

import java.util.Scanner;

public class task2 {
    /*
     * Take a String input from user. Create a new String called "result" in which
     * you will
     * replace letter 'e' in the original string letter 'i'.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("Enter your String");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }

        }
        System.out.println(result);

    }
}
