public class Timer {
    private final ClockHand seconds;
    private final ClockHand hundredthsOfASecond;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsOfASecond = new ClockHand(100);
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundredthsOfASecond;
    }
}
