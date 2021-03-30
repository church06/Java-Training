

public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int amount) {
        balance = balance - amount;
    }
}
