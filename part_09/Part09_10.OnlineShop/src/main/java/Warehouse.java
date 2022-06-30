import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> pricesOfProducts;
    private Map<String, Integer> stocksOfProducts;

    public Warehouse() {
        this.pricesOfProducts = new HashMap<>();
        this.stocksOfProducts = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.pricesOfProducts.put(product, price);
        this.stocksOfProducts.put(product, stock);
    }

    public int price(String product) {
        if (this.pricesOfProducts.get(product) != null) {
            return this.pricesOfProducts.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stocksOfProducts.get(product) != null) {
            return this.stocksOfProducts.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.stocksOfProducts.get(product) != null && this.stocksOfProducts.get(product) > 0) {
            int a = this.stocksOfProducts.get(product);
            this.stocksOfProducts.put(product, a - 1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        return new HashSet<>(pricesOfProducts.keySet());
    }
}
