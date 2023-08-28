package Loops_In_Java;

import java.util.*;

import If_else_Switch.Switch;

public class menu_driven_programme {
    /*
     * Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
     * If the user enters 1 then keep taking input from the user for a student’s
     * marks(out of 100).
     * 
     * If they enter 0 then stop.
     * 
     * If he/ she scores :
     * 
     * Marks >=90 -> print “This is Good”
     * 
     * 89 >= Marks >= 60 -> print “This is also Good”
     * 
     * 59 >= Marks >= 0 -> print “This is Good as well”
     * 
     * Because marks don’t matter but our effort does.
     * 
     * (Hint : use do-while loop but think & understand why)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        do {
            System.out.println("Press 1 for Enterig Grade Press 0 for Exit");
            switch (number) {

                case 0:
                    break;
                case 1:
                    System.out.println("Enter Grade");
                    int grade = scan.nextInt();
                    if (grade >= 90) {
                        System.out.println("This very is good");
                    } else if (grade >= 60) {
                        System.out.println("This is Good");
                    } else if (grade <= 59 || grade >= 0) {
                        System.out.println("This is Good as Well");
                    } else {
                        System.out.println("invalid");
                    }

                    break;
                default:
                    System.out.println();
                    break;

            }

            number++;

        } while (number == 1);

    }
}
