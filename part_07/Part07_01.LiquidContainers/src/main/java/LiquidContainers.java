
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");
        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                if (amount + first <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }

            if (command.equals("move") && amount > 0) {
                if (amount + second <= 100) {
                    if (first - amount >= 0) {
                        first -= amount;
                        second += amount;
                    } else {
                        second += first;
                        first = 0;

                    }
                } else {
                    if (first - amount >= 0) {
                        first -= amount;
                        second = 100;
                    } else {
                        second += first;
                        first = 0;

                    }
                }
            }

            if (command.equals("remove") && amount > 0) {
                if (second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
        }
    }

}
