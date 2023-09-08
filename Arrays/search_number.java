package Arrays;

import java.util.Scanner;

public class search_number {
    // --------> Take an Array as input from user. Search for given number x and
    // print the index which it occures.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Siz : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        int[] marks = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter searching Index ");
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i]) {
                System.out.println(" x Find at index : " + i);
            }

        }
    }

}
