import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return "" + this.history;
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double maximum = 0.0;
        for (double max : this.history) {
            if (max > maximum) {
                maximum = max;
            }
        }
        return maximum;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double minimum = this.history.get(0);
        for (double min : this.history) {
            if (min < minimum) {
                minimum = min;
            }
        }
        return minimum;
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double sum = 0.0;
        int count = 0;
        for (Double aDouble : this.history) {
            sum += aDouble;
            count++;
        }
        return sum / count;
    }
}
