
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {

        List<Literacy> literacy = readLiteracy();

        Comparator<Literacy> comparator = Comparator
                .comparing(Literacy::getLiteracyRate);

        Collections.sort(literacy, comparator);

        for (Literacy row : literacy) {
            System.out.println(row);
        }

    }

    public static List<Literacy> readLiteracy() {
        List<Literacy> literacyList = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[2].trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(literacy -> literacyList.add(literacy));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return literacyList;
    }
}
