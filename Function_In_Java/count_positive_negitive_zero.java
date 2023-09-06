package Function_In_Java;

import java.util.Scanner;
import java.util.Scanner.*;

public class count_positive_negitive_zero {
    /*
     * Write a program to enter the numbers till the user
     * wants and at the end it should display the count
     * of positive, negitive and zero entered.
     */
    public static void getTotalCount() {
        Scanner sc = new Scanner(System.in);
        int pcount = 0;
        int ncount = 0;
        int zero = 0;

        System.out.println(" Press 1 to continue & 0 to exit");
        int input = sc.nextInt();
        while (input == 1) {
            System.out.print("Enter a your number : ");
            int n = sc.nextInt();

            if (n > 0) {
                pcount = pcount + 1;
            } else if (n < 0) {
                ncount = ncount + 1;
            } else {
                zero = zero + 1;
            }
        }

        System.out.println(" Press 1 to continue & 0 to exit");
        input = sc.nextInt();

        while (input == 0)

        {
            System.out.println(" Total Count of Positive Number : " + pcount);
            System.out.println(" Total Count of Negitive number :" + ncount);
            System.out.println(" Total Count of Zeros : " + zero);
        }
        return;
    }

    public static void main(String[] args) {
        getTotalCount();
    }

}
