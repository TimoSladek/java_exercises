import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.items.get(product) != null) {
            this.items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for (String key : this.items.keySet()) {
            sum += this.items.get(key).price();
        }
        return sum;
    }

    public void print() {
        for (Item value : this.items.values()) {
            System.out.println(value.toString());
        }
    }
}
