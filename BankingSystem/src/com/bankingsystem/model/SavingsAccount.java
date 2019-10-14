package com.bankingsystem.model;


/**
 * This class is a subclass of Account and represents a savings account in a bank.
 * 
 * @author
 */
public class SavingsAccount extends Account {

    /**
     * Class constructor that creates a new Savings account with given
     * parameters.
     * 
     * @param accId unique ID of the account
     * @param customer the Customer who owns this account
     * @param initialBalance the initial balance of the account
     */
    public SavingsAccount(String accId, Customer customer, double initialBalance, String password) {
        super(accId, customer, initialBalance, password);
    }

    
    @Override
    public AccountType getType() {
        return Account.AccountType.SAVINGS;
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
