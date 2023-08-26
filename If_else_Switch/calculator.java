package If_else_Switch;

import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Which Operatin You want to perform\n");
        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Substraction");
        System.out.println("Press 3 For Multiplication");
        System.out.println("Press 4 For Devision");
        System.out.println("Press 5 For Moduls");
        int operation = sc.nextInt();
        if (operation == 1) {
            System.out.println("SUM : " + (a + b));
        } else if (operation == 2) {
            System.out.println("Substract :" + (a - b));
        } else if (operation == 3) {
            System.out.println("Multiplication : " + (a * b));
        } else if (operation == 4) {
            System.out.println("Division :" + (a / b));
        } else if (operation == 5) {
            System.out.println("Moduls :" + (a % b));
        } else {
            System.out.println("Invalid Operation Number");
        }
    }
}
