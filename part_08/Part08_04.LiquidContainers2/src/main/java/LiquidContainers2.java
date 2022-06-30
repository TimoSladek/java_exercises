
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();

        System.out.println(container.output());
        while (true) {
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container.add(amount);
            }
            if (command.equals("move")) {
                container.move(amount);
            }
            if (command.equals("remove")) {
                container.remove(amount);
            }
            System.out.println(container.output());
        }
    }
}
