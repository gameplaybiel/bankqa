package steps;

import bank.*;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class BankSteps {
    private BankSystem bankSystem = new BankSystem();
    private User currentUser;
    private Account currentAccount;

    // --- Criação de usuário e conta ---
    @Given("a user {string} with account {string} and balance {double}")
    public void a_user_with_account_and_balance(String name, String accountNumber, Double balance) {
        currentUser = new User(name, name.toLowerCase());
        currentAccount = new Account(accountNumber, balance);
        currentUser.addAccount(currentAccount);
        bankSystem.addUser(currentUser);
    }

    // --- Depósito ---
    @When("the user deposits {double} into account {string}")
    public void the_user_deposits_into_account(Double amount, String accountNumber) {
        Account account = bankSystem.findAccount(accountNumber);
        account.deposit(amount);
    }

    // --- Saque ---
    @When("the user withdraws {double} from account {string}")
    public void the_user_withdraws_from_account(Double amount, String accountNumber) {
        Account account = bankSystem.findAccount(accountNumber);
        account.withdraw(amount);
    }

    // --- Transferência ---
    @When("the user transfers {double} from account {string} to account {string}")
    public void the_user_transfers_from_account_to_account(Double amount, String fromAccountNumber, String toAccountNumber) {
        bankSystem.transfer(fromAccountNumber, toAccountNumber, amount);
    }

    // --- Verificação de saldo ---
    @Then("the account {string} balance should be {double}")
    public void the_account_balance_should_be(String accountNumber, Double expectedBalance) {
        Account account = bankSystem.findAccount(accountNumber);
        assertEquals(expectedBalance, account.getBalance(), 0.01);
    }
}

