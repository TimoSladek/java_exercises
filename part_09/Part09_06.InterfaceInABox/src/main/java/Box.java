import java.util.ArrayList;

public class Box implements Packable {
    private double maximumWeight;
    private ArrayList<Packable> items;

    public Box(double maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (item.weight() + weight() <= maximumWeight) {
            items.add(item);
        }
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }

    public double weight() {
        double weight = 0;

        for (Packable weights : this.items) {
            weight += weights.weight();
        }
        return weight;
    }
}
