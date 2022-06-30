
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int first = Integer.valueOf(scanner.nextLine());
        double a;
        if (first < 5000) {
            System.out.println("No tax!");
        } else if (first < 25000) {
            a = (100 + ((first - 5000) * 0.08));
            System.out.println("Tax: " + a);
        } else if (first < 55000) {
            a = (1700 + ((first - 25000) * 0.1));
            System.out.println("Tax: " + a);
        } else if (first < 200000) {
            a = (4700 + ((first - 55000) * 0.12));
            System.out.println("Tax: " + a);
        } else if (first < 1000000) {
            a = (22100 + ((first - 200000) * 0.15));
            System.out.println("Tax: " + a);
        } else {
            a = (142100 + ((first - 1000000) * 0.17));
            System.out.println("Tax: " + a);
        }
    }
}
