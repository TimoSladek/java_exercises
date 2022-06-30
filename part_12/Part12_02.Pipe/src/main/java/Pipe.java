import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {
    ArrayList<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }
        T a = this.values.get(0);
        this.values.remove(0);
        return a;
    }

    public boolean isInPipe() {
        return !this.values.isEmpty();
    }
}
