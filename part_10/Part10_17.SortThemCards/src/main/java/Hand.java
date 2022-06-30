import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        for (Card card : this.hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        this.hand.sort(comparator);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = 0;
        for (Card value1 : this.hand) {
            sum1 += value1.getValue();
        }
        int sum2 = 0;
        for (Card value2 : o.hand) {
            sum2 += value2.getValue();
        }
        return sum1 - sum2;
    }

    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuit)
                .thenComparing(Card::getValue);

        this.hand.sort(comparator);
    }
}
