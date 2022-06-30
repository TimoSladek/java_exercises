
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        System.out.println("First: 0/100");
        System.out.println("Second: 0/100");
        while (true) {
            String input = scan.nextLine();
            System.out.println("");
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add") && amount > 0) {
                if (first + amount <= 100) {
                    first += amount;
                } else {
                    first = 100;
                }
            }
            if (command.equals("move") && amount > 0) {
                if (first - amount >= 0) {
                    first -= amount;
                    if (second + amount <= 100) {
                        second += amount;
                    } else {
                        second = 100;
                    }
                } else {
                    if (second + first <= 100) {
                        second += first;
                        first = 0;
                    } else {
                        second = 100;
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
