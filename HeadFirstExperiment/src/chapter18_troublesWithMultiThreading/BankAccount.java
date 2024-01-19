package chapter18_troublesWithMultiThreading;

public class BankAccount {

    private int balance = 100;

    synchronized public int getBalance(){
        return this.balance;
    }

    synchronized public void spend(int amount){

        this.balance -= amount;
    }

}
