
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (this.meals.size() == 0) {
            this.meals.add(meal);
        }
        for (int i = 0; i < this.meals.size(); i++) {
            if (meal.equals(this.meals.get(i))) {
                break;
            }
            if (i == this.meals.size() - 1) {
                this.meals.add(meal);
            }
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        for (int i = this.meals.size() - 1; i >= 0; i--) {
            this.meals.remove(i);
        }
    }
}
