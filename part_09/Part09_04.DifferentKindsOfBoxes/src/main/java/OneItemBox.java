import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItemBox;

    public OneItemBox() {
        this.oneItemBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.oneItemBox.isEmpty()) {
            this.oneItemBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item items : this.oneItemBox) {
            if (items.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
