package chapter18_troublesWithMultiThreading;

public class RyanAndMonicaJob implements Runnable {
    private String person;
    private BankAccount account;

    private int amount;

    public RyanAndMonicaJob(String person, BankAccount account, int amount) {
        this.person = person;
        this.account = account;
        this.amount = amount;
    }

    public synchronized void goShopping(){
//        synchronized (account){
            if (account.getBalance() >= amount) {
                System.out.println(amount + " is about to spend!");
                account.spend(amount);
                System.out.println("You have spent " + amount + "!");
            } else {
                System.out.println("Sorry, not enough money");
            }
//        }
    }
    @Override
    public void run() {
     goShopping();
    }
}
