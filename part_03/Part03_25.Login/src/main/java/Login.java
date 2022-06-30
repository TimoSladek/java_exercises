
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String us1 = "alex";
        String pass1 = "sunshine";
        String us2 = "emma";
        String pass2 = "haskell";
        System.out.println("Enter username:");
        String us = scanner.nextLine();
        if (us.equals(us1)) {
            System.out.println("Enter password:");
            String pass = scanner.nextLine();
            if (pass.equals(pass1)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else if (us.equals(us2)) {
            System.out.println("Enter password:");
            String pass = scanner.nextLine();
            if (pass.equals(pass2)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Enter password:");
            String pass = scanner.nextLine();
            System.out.println("Incorrect username or password!");
        }
    }
}
