
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int x = 0;
        int y = size / 2;
        square.placeValue(x, y, 1);
        for (int i = 1; i < size * size; i++) {

            int newX = x;
            int newY = y;
            if (newX == 0) {
                newX = square.getHeight() - 1;
            } else {
                newX--;
            }
            if (newY == square.getWidth() - 1) {
                newY = 0;
            } else {
                newY++;
            }
            if (square.readValue(newX, newY) == 0) {
                square.placeValue(newX, newY, i + 1);
                x = newX;
                y = newY;
            } else {
                x++;
                square.placeValue(x, y, i + 1);
            }

        }

        return square;
    }

}
