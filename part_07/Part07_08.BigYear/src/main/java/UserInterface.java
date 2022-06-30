import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Birds> birds;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.birds = new ArrayList<>();
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birds.add(new Birds(name, latinName));
            }
            if (command.equals("Observation")) {
                int a = 0;
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(name)) {
                        birds.get(i).observation();
                        a++;
                    }
                }
                if (a == 0) {
                    System.out.println("Not a bird!");
                }
            }
            if (command.equals("All")) {
                for (int i = 0; i < birds.size(); i++) {
                    System.out.println(birds.get(i).toString());
                }
            }
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(bird)) {
                        System.out.println(birds.get(i).toString());
                        break;
                    }
                }
            }
        }
    }
}
