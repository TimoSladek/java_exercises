public class Song {
    private int length;
    private String name;

    public Song(String name, int length) {
        this.length = length;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
