public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = name;
    }

    public void growOlder() {
        this.age++;
    }

    public String toString() {
        return this.name + " is " + this.age;
    }
}
