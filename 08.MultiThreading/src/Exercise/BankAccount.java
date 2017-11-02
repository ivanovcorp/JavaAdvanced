package Exercise;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int sum) {
        this.balance += sum;
    }

    public int getBalance()
    {
        return this.balance;
    }
}



