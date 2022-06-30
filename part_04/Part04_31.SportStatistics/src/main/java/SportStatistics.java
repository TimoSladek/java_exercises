


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int win = 0, lose = 0;
        int count = 0;
        System.out.println("File:");
        String file = scanner.nextLine();

        System.out.println("Team:");
        String team = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                String team1 = parts[0];
                String team2 = parts[1];
                int number1 = Integer.valueOf(parts[2]);
                int number2 = Integer.valueOf(parts[3]);

                if (team1.equals(team)) {
                    count++;
                    if (number1 > number2) {
                        win++;
                    } else {
                        lose++;
                    }
                }
                if (team2.equals(team)) {
                    count++;
                    if (number1 > number2) {
                        lose++;
                    } else {
                        win++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
