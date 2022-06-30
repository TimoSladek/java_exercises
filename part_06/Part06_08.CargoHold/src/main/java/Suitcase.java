import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (int i = 0; i < this.items.size(); i++) {
            totalWeight += this.items.get(i).getWeight();
        }
        if (totalWeight + item.getWeight() <= maximumWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0kg)";
        }
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.items.get(0).getWeight() + " kg)";
        }
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return this.items.size() + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        String print = "";
        for (int i = 0; i < this.items.size(); i++) {
            if (i == this.items.size() - 1) {
                print = print + this.items.get(i).getName() + " (" + this.items.get(i).getWeight() + " kg)";
            }
            print = print + this.items.get(i).getName() + " (" + this.items.get(i).getWeight() + " kg)" + "\n";
        }
        System.out.println(print);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
