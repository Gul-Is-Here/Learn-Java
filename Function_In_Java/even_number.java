package Function_In_Java;

import java.util.Scanner;

public class even_number {
    public static boolean evenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean chcek_even(int number) {
        boolean isEven = evenNumber(number);
        if (isEven) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " not Even");
        }
        return isEven;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        chcek_even(number);
    }

}
