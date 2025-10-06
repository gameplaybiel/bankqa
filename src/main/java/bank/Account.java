package bank;

public class Account {
    private String number;
    private double balance;

    public Account(String number, double initialBalance){
        this.number = number;
        this.balance = initialBalance;
    }


    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Deposit must be psoitive");
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Withdraw must be positive");
        if(amount > balance) throw new IllegalArgumentException("Insufficient fund");
        balance -= amount;
    }
}
