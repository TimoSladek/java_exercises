import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private String file;
    private ArrayList<Recipe> recipes;
    private ArrayList<String> ingredients;

    public FileReader(String file) {
        this.file = file;
        this.recipes = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }

    public void readFile() {
        int a = 0;
        String name = "a";
        int cookingTime = 0;
        try (Scanner reader = new Scanner(Paths.get(this.file))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (a == 0) {
                    name = line;
                }
                if (a == 1) {
                    cookingTime = Integer.valueOf(line);
                    this.recipes.add(new Recipe(name, cookingTime));
                }
                if (a > 1) {
                    this.ingredients.add(line);
                }
                a++;
                if (line.isEmpty()) {
                    a = 0;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printMeals() {
        for (int i = 0; i < this.recipes.size(); i++) {
            System.out.println(this.recipes.get(i).toString());
        }
        System.out.println("");
    }

    public void printByName(String word) {
        for (int i = 0; i < this.recipes.size(); i++) {
            if (this.recipes.get(i).getName().contains(word)) {
                System.out.println(this.recipes.get(i).toString());
            }
        }
        System.out.println("");
    }

    public void printByTime(int time) {
        for (int i = 0; i < this.recipes.size(); i++) {
            if (this.recipes.get(i).getCookingTime() <= time) {
                System.out.println(this.recipes.get(i).toString());
            }
        }
        System.out.println("");
    }

    public void printByIngredient(String ingredient) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < this.ingredients.size(); i++) {
            if (this.ingredients.get(i).equals(ingredient)) {
                a++;
            }
            if (this.ingredients.get(i).equals("") || i == this.ingredients.size() - 1) {
                if (a > 0) {
                    System.out.println(this.recipes.get(b).toString());
                }
                b++;
                a = 0;
            }
        }
        System.out.println("");
    }

    public void printEverything() {
        for (int i = 0; i < this.ingredients.size(); i++) {
            System.out.println(this.ingredients.get(i));
        }
    }
}
