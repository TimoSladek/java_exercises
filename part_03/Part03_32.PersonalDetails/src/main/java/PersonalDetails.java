
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        double avg = 0;
        String name = "e";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            int length = parts[0].length();
            if (length > name.length()) {
                name = parts[0];
            }
        }
        avg = 1.0 * sum / count;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + avg);

    }
}
