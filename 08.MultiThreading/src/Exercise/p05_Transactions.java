package Exercise;

public class p05_Transactions {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                acc.deposit(1);
            }
        };
        Thread[] threads = new Thread[100];
        for (Thread t : threads) {
            t = new Thread(task);
            t.start();
        }

        System.out.println(acc.getBalance());
    }

}



