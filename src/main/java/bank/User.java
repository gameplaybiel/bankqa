package bank;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;
    private List<Account> accounts;

    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
