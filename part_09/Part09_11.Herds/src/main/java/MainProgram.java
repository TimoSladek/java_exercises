

public class MainProgram {

    public static void main(String[] args) {

        Herd herd = new Herd();
        herd.addToHerd(new Organism(5, 10));
        herd.addToHerd(new Organism(2, 8));
        herd.move(1, 0);
        System.out.println(herd);
    }
}
