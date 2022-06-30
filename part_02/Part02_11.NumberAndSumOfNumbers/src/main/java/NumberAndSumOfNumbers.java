
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int numberOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                break;
            }
            result = result + command;
            numberOfNumbers = numberOfNumbers + 1;
        }
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + result);
    }
}
