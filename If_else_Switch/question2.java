package If_else_Switch;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println(" Equal ");
        } else if (a < b) {
            System.out.println("a is less then b");
        } else {
            System.out.println("a is greater then b");
        }
    }

}
