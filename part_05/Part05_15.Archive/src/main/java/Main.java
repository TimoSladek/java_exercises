
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> identifiers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            if (identifiers.size() == 0) {
                identifiers.add(identifier);
            }
            for (int i = 0; i < identifiers.size(); i++) {
                if (identifier.equals(identifiers.get(i))) {
                    break;
                }
                if (i == identifiers.size() - 1) {
                    identifiers.add(identifier);
                }
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            if (identifiers.size() == names.size() + 1) {
                names.add(name);
            }
        }

        System.out.println("==Items==");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(identifiers.get(i) + ": " + names.get(i));
        }
    }
}
