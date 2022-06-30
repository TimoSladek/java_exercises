public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.balance = initialBalance;
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            super.balance = super.balance + amount;
        } else {
            super.balance = this.getCapacity();
        }
        this.history.add(super.balance);
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > super.balance) {
            double allThatWeCan = super.balance;
            super.balance = 0.0;
            this.history.add(super.balance);
            return allThatWeCan;
        }

        super.balance = super.balance - amount;
        this.history.add(super.balance);
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
