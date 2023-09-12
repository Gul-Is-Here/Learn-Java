package Arrays;

import java.util.Scanner;

public class assending_desending {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        Scanner sc = new Scanner(System.in);
        boolean isAssending = false;
        int size = sc.nextInt();
        int[] number = new int[size];
        System.out.println("Enter Array");

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] < number[i + 1]) {
                isAssending = true;
            }

        }
        if (isAssending) {
            System.out.println("Sourted array Assending order");
        } else {
            System.out.println("Not sorted in Accending Order");
        }

    }
}