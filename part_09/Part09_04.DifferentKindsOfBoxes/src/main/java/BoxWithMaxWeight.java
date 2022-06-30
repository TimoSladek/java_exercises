import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> boxWithMaxWeight;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.boxWithMaxWeight = new ArrayList<>();
    }


    @Override
    public void add(Item item) {
        if (item.getWeight() >= 0 && item.getWeight() <= this.capacity) {
            boxWithMaxWeight.add(item);
            this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item items : this.boxWithMaxWeight) {
            if (items.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
