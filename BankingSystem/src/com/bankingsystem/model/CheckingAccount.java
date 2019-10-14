package com.bankingsystem.model;

/**
 * This class is a subclass of Account and represents a checking account in a bank.
 * @author
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String accNumber, Customer customer, double initialBalance, String password) {
        super(accNumber, customer, initialBalance, password);
    }

    @Override
    public AccountType getType() {
        return Account.AccountType.CHECKING;
    }

    @Override
    public boolean deposit(double amount) {
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        return true;
    }

    @Override
    public boolean transfer(Account toAccount, double amount) {
        return true;
    }
    
    
}
