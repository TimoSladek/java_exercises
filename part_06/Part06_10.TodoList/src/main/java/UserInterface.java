import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todo;

    public UserInterface(TodoList todo, Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }

    public void start() {
        label:
        while (true) {
            System.out.println("Command: ");
            String string = scanner.nextLine();
            switch (string) {
                case "stop":
                    break label;
                case "add":
                    System.out.print("To add: ");
                    String toAdd = scanner.nextLine();
                    this.todo.add(toAdd);
                    break;
                case "list":
                    this.todo.print();
                    break;
                case "remove":
                    System.out.print("Which one is removed? ");
                    int number = Integer.valueOf(scanner.nextLine());
                    this.todo.remove(number);
                    break;
            }
        }
    }
}
