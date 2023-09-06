package Function_In_Java;

import java.util.Scanner;

public class person_eligible_vote {
    public static void personEligibleToVote(int age) {
        if (age >= 18) {
            System.out.println(" Person is Eligible To vote");
        } else {
            System.out.println(" Not Eligible to vote");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Person : ");
        int age = sc.nextInt();
        personEligibleToVote(age);
    }
}
