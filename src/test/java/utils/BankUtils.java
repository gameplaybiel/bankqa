package utils;


import bank.Account;

public class BankUtils {
    public static void depositMultiple(Account account, double[] amounts){
        for(double amount : amounts){
            account.deposit(amount);
        }
    }
}
