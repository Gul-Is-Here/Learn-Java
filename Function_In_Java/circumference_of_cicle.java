package Function_In_Java;

import java.util.Scanner;

public class circumference_of_cicle {
    public static double getCircumference(double radius) {
        double circumference = 2 * 3.1416 * (radius);
        System.out.println(" Circumference of Circle : " + circumference);
        return circumference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radis of Circle");
        double radis = sc.nextInt();
        getCircumference(radis);
    }
}
