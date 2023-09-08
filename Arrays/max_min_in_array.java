package Arrays;

import java.util.Scanner;

public class max_min_in_array {
    public static void main(String[] args) {
        System.out.println("Enter array Length");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {

            if (number[i] < min) {
                min = number[i];
            }
            if (max < number[i]) {
                max = number[i];

            }
        }
        System.out.println(" Max Number : " + max);
        System.out.println(" Min Number : " + min);

        // for(int i=0; i<number.length;i++)
        // {
        // if(min>i)
        // }

    }
}
