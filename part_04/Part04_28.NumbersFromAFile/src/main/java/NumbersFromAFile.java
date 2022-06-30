


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(Integer.valueOf(reader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        for (Integer integer : list) {
            if (integer >= lowerBound && integer <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }
}
