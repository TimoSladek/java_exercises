
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give an integer:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double b = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean c = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string "+string);
        System.out.println("You gave the integer "+a);
        System.out.println("You gave the double "+b);
        System.out.println("You gave the boolean "+c);
    }
}
