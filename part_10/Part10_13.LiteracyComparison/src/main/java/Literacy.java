public class Literacy {
    private String gender;
    private String country;
    private int year;
    private double literacyRate;

    public Literacy(String gender, String country, int year, double literacyRate) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }

    public String toString() {
        String[] pieces = this.gender.split(" ");
        return this.country + " (" + this.year + "), " + pieces[0] + ", " + this.literacyRate;
    }
}
