import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (this.storage.get(unit) == null) {
            this.storage.put(unit, new ArrayList<>());
        }

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.get(storageUnit) != null) {
            this.storage.get(storageUnit).remove(item);
            if (this.storage.get(storageUnit).isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }

    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storage.keySet());
    }
}
