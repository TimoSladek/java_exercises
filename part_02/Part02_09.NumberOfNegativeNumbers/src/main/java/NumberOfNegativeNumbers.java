
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                break;
            }
            if (command < 0) {
                result = result + 1;
            }
        }
        System.out.println("Number of negative numbers: " + result);
    }
}
