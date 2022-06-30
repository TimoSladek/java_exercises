
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                break;
            }
            result = result + command;
        }
        System.out.println("Sum of the numbers: " + result);
    }
}
