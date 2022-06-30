import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;

    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.owners.get(licensePlate) == null) {
            this.owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.owners.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.owners.get(licensePlate) == null) {
            return false;
        }
        this.owners.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : this.owners.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        ArrayList<String> a = new ArrayList<>();
        for (String owner : this.owners.values()) {
            if (!a.contains(owner)) {
                a.add(owner);
                System.out.println(owner);
            }
        }
    }
}
