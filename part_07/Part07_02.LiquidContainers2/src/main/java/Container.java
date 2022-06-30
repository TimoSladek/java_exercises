public class Container {
    private int first;
    private int second;
    private int container;

    public Container() {
        this.first = 0;
        this.second = 0;
        this.container = 0;
    }

    public int contains() {
        return this.container;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + this.first <= 100) {
                this.first += amount;
            } else {
                this.first = 100;
            }
            if (amount + this.container <= 100) {
                this.container += amount;
            } else {
                this.container = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.second - amount >= 0) {
                this.second -= amount;
            } else {
                this.second = 0;
            }
            if (this.container - amount >= 0) {
                this.container -= amount;
            } else {
                this.container = 0;
            }
        }
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount + this.second <= 100) {
                if (this.first - amount >= 0) {
                    this.first -= amount;
                    this.second += amount;
                } else {
                    this.second += this.first;
                    this.first = 0;
                }
            } else {
                if (this.first - amount >= 0) {
                    this.first -= amount;
                    this.second = 100;
                } else {
                    this.second += this.first;
                    this.first = 0;
                }
            }
        }
    }

    public String toString() {
        return this.container + "/100";
    }

    public String output() {
        return "First: " + this.first + "/100\n" + "Second: " + this.second + "/100";
    }
}
