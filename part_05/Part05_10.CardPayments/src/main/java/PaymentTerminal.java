
public class PaymentTerminal {


    private double money;
    private int affordableMeals;
    private int heartyMeals;


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            this.money += 2.5;
            affordableMeals++;
            return payment - 2.5;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            this.money += 4.3;
            heartyMeals++;
            return payment - 4.3;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (2.5 <= card.balance()) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (4.3 <= card.balance()) {
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum>=0){
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
