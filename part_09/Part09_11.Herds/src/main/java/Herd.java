import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public String toString() {
        String print = "";
        for (Movable organism : this.herd) {
            print = print + organism + "\n";
        }
        return print;
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : this.herd) {
            movable.move(dx, dy);
        }
    }
}
