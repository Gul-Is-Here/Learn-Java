package string_in_java.Home__Task;

import java.util.Scanner;

public class task1 {
    /*
     * Take an array of String input from user and find the cumulative (combined)
     * length of all those Strings
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] array = new String[size];
        int total = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLine();
            total = total + array[i].length();
        }
        System.out.println(total);
    }

}
