public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public String toString() {
        return super.toString() + "\n  Study credits " + this.credits;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        credits++;
    }
}
