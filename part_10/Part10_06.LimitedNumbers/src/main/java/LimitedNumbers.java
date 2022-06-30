
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }

        ArrayList<Integer> finalNumbers = numbers.stream()
                .filter(s -> s > 1 && s < 6)
                .collect(Collectors.toCollection(ArrayList::new));
        for (int number : finalNumbers) {
            System.out.println(number);
        }
    }
}
