
package com.bankingsystem.model;

import java.util.List;

/**
 * This is the base abstract model class for an account in a bank.
 * 
 * @author
 */
public abstract class Account {

    /** enum constants for all types of accounts */
    public enum AccountType { SAVINGS, CURRENT, CHECKING };
    
    /** unique ID of the account */
    private String accNumber;
    
    /** customer who owns this account */
    private Customer customer;
    
    /** balance of the account */
    private double balance;
    
    /** list of transactions made from this account */
    private List<Transaction> transactions;
    
    /**
     * Class constructor that creates a new bank account.
     * @param accNumber the unique account number
     * @param customer the customer of the account
     * @param initialBalance initial balance of the account
     */
    public Account(String accNumber, Customer customer, double initialBalance) {
        this.accNumber = accNumber;
        this.customer = customer;
        this.balance = initialBalance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
    
    public abstract AccountType getType();
    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract boolean transfer(Account toAccount, double amount);
}
