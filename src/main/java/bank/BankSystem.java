package bank;

import java.util.HashMap;
import java.util.Map;

public class BankSystem {
    private Map<String, User> users;

    public BankSystem() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        if (fromAccount == null || toAccount == null) {
            throw new IllegalArgumentException("Account not found");
        }

        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }

    // --- Método público para localizar qualquer conta ---
    public Account findAccount(String accountNumber) {
        for (User user : users.values()) {
            for (Account account : user.getAccounts()) {
                if (account.getNumber().equals(accountNumber)) {
                    return account;
                }
            }
        }
        return null;
    }
}