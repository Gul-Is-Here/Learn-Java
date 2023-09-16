package string_in_java.Home__Task;

import java.util.Scanner;

public class task3 {
    /*
     * Input an email from user. You have to create a username from the email
     * by deleting the part that comes aftrt '@'. Display that user name to the user
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        System.out.println("Enter your String");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                break;
            } else {
                username += str.charAt(i);
            }

        }
        System.out.println("Email : " + str);
        System.out.println("User name is : " + username);

    }
}
