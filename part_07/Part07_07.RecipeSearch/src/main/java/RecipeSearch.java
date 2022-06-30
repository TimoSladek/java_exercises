import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();
        System.out.println("\nCommands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient\n");

        FileReader fileReader = new FileReader(file);
        UserInterface ui = new UserInterface(fileReader, scanner);

        ui.start();
    }

}
