package TwoDArray;

import java.util.Scanner;

public class find_x_in_array {
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
        // Find x in 2 D array
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x Find at location " + "( " + i + "," + j + " )");

                }
            }
            System.out.println();
        }

    }
}
