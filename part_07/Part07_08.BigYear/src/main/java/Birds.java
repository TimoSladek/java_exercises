public class Birds {
    private String name;
    private String latinName;
    private int number;

    public Birds(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.number = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinName() {
        return this.latinName;
    }

    public int getNumber() {
        return this.number;
    }

    public String toString() {
        return this.name + " (" + this.latinName + ") : " + this.number + " observations";
    }

    public void observation() {
        this.number++;
    }
}
