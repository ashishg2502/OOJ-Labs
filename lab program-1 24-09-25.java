import java.util.*;

public class quad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();

        System.out.print("Enter b: ");
        int b = input.nextInt();

        System.out.print("Enter c: ");
        int c = input.nextInt();
        input.close();

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else {
            double d = (b * b) - (4 * a * c);
            if (d > 0) {
                double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
                double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
                System.out.println("Two real and distinct roots: " + r1 + " and " + r2);
            } else if (d == 0) {
                double r = -b / (2.0 * a);
                System.out.println("Two real and equal roots: " + r + " and " + r);
            } else {
                double realPart = -b / (2.0 * a);
                double imagPart = Math.sqrt(-d) / (2.0 * a);
                System.out.println("Complex roots: " + realPart + " + " + imagPart + "i and " +
                                   realPart + " - " + imagPart + "i");
            }
        }
    }
}
