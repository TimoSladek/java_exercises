
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int number = 0;
        while (true) {
            System.out.println("Give a number:");
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                break;
            }
            result = result + command;
            number = number + 1;
        }
        double average = result / (double) number;
        System.out.println("Average of the numbers: " + average);
    }
}
