
public class YourFirstAccount {

    public static void main(String[] args) {
        Account acc = new Account("mine", 100.00);

        acc.deposit(20.0);
        System.out.println(acc);
    }
}
