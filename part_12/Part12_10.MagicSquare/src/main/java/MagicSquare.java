
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rows = new ArrayList<>();
        for (int i = 0; i < this.square.length; i++) {
            int sum = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                sum += this.square[i][j];
            }
            rows.add(sum);
        }
        return rows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> columns = new ArrayList<>();
        for (int i = 0; i < this.square.length; i++) {
            int sum = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                sum += this.square[j][i];
            }
            columns.add(sum);
        }
        System.out.println(columns);
        return columns;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagonals = new ArrayList<>();
        int position = 0;
        int position2 = this.square.length - 1;
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < this.square.length; i++) {
            sum += this.square[i][position];
            sum2 += this.square[i][position2];
            position2--;
            position++;
        }
        diagonals.add(sum);
        diagonals.add(sum2);
        return diagonals;
    }

    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return -1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
