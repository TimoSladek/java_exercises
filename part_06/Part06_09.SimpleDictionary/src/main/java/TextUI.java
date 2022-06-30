import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleD;

    public TextUI(Scanner scanner, SimpleDictionary object) {
        this.scanner = scanner;
        this.simpleD = object;
    }

    public void start() {
        label:
        while (true) {
            System.out.print("Command: ");
            String string = scanner.nextLine();
            switch (string) {
                case "end":
                    System.out.println("Bye bye!");
                    break label;
                case "add":
                    System.out.print("Word: ");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    this.simpleD.add(word, translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String toBeTranslated = scanner.nextLine();
                    if (this.simpleD.translate(toBeTranslated) == null) {
                        System.out.println("Word " + toBeTranslated + " was not found");
                    } else {
                        System.out.print("Translation: ");
                        System.out.println(this.simpleD.translate(toBeTranslated));
                    }
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
