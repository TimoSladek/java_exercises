
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if (command > 0) {
                result = result + command;
                number = number + 1;
            }
        }
        double average = result / (double) number;
        if (result == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
