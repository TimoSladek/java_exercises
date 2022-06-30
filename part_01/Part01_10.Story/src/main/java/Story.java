
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String message = scanner.nextLine();
        System.out.println("What is their job?");
        String string = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+message+", who was "+string+".");
        System.out.println("On the way to work, "+message+" reflected on life.");
        System.out.println("Perhaps "+message+" will not be "+ string + " forever.");
    }
}
