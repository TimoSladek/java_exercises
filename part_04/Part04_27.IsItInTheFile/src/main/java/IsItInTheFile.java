
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        int a = 0;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            while (reader.hasNextLine()) {
                if (reader.nextLine().equals(searchedFor)) {
                    a = 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file  " + e.getMessage() + " failed.");
        }
        if (a == 1) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
