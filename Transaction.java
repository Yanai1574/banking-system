public class Transaction {

    private double bankbalance;

    public Transaction(double bankBalance) {
        this.bankbalance = bankBalance;
    }

    public double getBankBalance() {
        return bankbalance;
    }

    public void deposit(double amount) {
        bankbalance += amount;
    }

    public void withdraw(double amount) {
        bankbalance -= amount;
    }

    public void makeZero() {
        bankbalance = 0;
    }
}