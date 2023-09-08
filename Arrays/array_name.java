package Arrays;

import java.util.Scanner;

public class array_name {
    public static void main(String[] args) {
        System.out.println("Enter Length of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] name = new String[size];
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        System.out.println("Enter names ");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name : " + name[i]);
        }
    }

}
