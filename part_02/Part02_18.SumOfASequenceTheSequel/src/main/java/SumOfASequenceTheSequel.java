
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int end = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= end; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
