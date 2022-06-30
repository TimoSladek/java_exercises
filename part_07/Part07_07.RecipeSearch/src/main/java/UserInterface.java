import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private FileReader fileReader;

    public UserInterface(FileReader filereader, Scanner scanner) {
        this.fileReader = filereader;
        this.scanner = scanner;
    }

    public void start() {
        this.fileReader.readFile();
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                this.fileReader.printMeals();
            }
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                System.out.println("\nRecipes:");
                this.fileReader.printByName(searchedWord);
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes:");
                this.fileReader.printByTime(maxCookingTime);
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes:");
                this.fileReader.printByIngredient(ingredient);
            }
        }
    }


}
