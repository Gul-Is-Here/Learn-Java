import java.util.*;

public class calculate_radius_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cirumfirence = sc.nextInt();
        double radius = cirumfirence / (2 * 3.14);
        System.out.println("Radius :" + radius);
        double area = 3.14 * (radius * radius);
        System.out.println("Area :" + area);
    }
}
