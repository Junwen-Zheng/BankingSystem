package com.bankingsystem.model;

/**
 * This class is a subclass of Account and represents a checking account in a bank.
 * @author
 */
public class CheckingAccount extends Account {

    
    /**
     * Class constructor that creates a new Checkings account with given
     * parameters.
     * 
     * @param accId unique ID of the account
     * @param customer the Customer who owns this account
     * @param initialBalance the initial balance of the account
     * @param  password the account password
     * @param branch the account branch
     */
    public CheckingAccount(String accId, Customer customer, double initialBalance, String password, Branch branch) {
        super(accId, customer, initialBalance, password, branch);
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
