
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year:");
        int first = Integer.valueOf(scanner.nextLine());
        if (first % 100 == 0 && first % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (first % 4 == 0 && first % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
