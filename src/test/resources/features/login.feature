Feature: Bank operations
  In order to manage my bank accounts
  As a user
  I want to be able to deposit, withdraw and transfer money

  Scenario: Deposit money into account
    Given a user "Gabriel" with account "12345" and balance 100
    When the user deposits 50 into account "12345"
    Then the account "12345" balance should be 150

  Scenario: Withdraw money from account
    Given a user "Gabriel" with account "12345" and balance 150
    When the user withdraws 70 from account "12345"
    Then the account "12345" balance should be 80

  Scenario: Transfer money between accounts
    Given a user "Gabriel" with account "12345" and balance 200
    And a user "Lucas" with account "67890" and balance 100
    When the user transfers 50 from account "12345" to account "67890"
    Then the account "12345" balance should be 150
    And the account "67890" balance should be 150
