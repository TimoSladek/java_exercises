
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int first = Integer.valueOf(scanner.nextLine());
        if (first >= 0 && first <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
