
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Last number?");
        int result = 0;
        int end = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= end; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
