
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account acc = new Account("Matthews account", 1000.0);
        Account accc = new Account("My account", 0.0);
        acc.withdrawal(100.0);
        accc.deposit(100.0);
        System.out.println(acc);
        System.out.println(accc);
    }
}
