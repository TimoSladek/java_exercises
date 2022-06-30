
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0, i = 0, odd = 0, even = 0;
        double average = 0;
        System.out.println("Give numbers:");
        while (true) {
            int first = Integer.valueOf(scanner.nextLine());
            if (first == -1) {
                break;
            }
            i++;
            sum += first;
            if (first % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        average = sum / (double) i;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + i);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
