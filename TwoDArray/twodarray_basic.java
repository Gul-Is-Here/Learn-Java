package TwoDArray;

import java.util.Scanner;

public class twodarray_basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Colums : ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // Print the 2 D Array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }

}
