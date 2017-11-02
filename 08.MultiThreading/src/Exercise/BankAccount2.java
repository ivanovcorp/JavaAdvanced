package Exercise;

public class BankAccount2 {
    private volatile int balance;

    public BankAccount2() {
        this.balance = 0;
    }

    public synchronized void deposit(int sum) {

        this.balance += sum;

    }

    public int getBalance()
    {
        return this.balance;
    }
}



