import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeights = 0;
        for (Suitcase value : this.suitcases) {
            totalWeights += value.totalWeight();
        }
        if (totalWeights + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        if (this.suitcases.isEmpty()) {
            return null;
        }
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.suitcases.get(0).totalWeight() + " kg)";
        }
        int totalWeights = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeights += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + totalWeights + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
