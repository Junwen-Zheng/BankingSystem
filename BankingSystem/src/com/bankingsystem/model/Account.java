
package com.bankingsystem.model;

import java.io.Serializable;
import java.util.List;

/**
 * This is the base abstract model class for an account in a bank.
 * 
 * @author
 */
public abstract class Account implements Serializable {

    /** enum constants for all types of accounts */
    public enum AccountType { SAVINGS, CURRENT, CHECKING };
    
    /** unique ID of the account */
    private String accNumber;
    
    /** customer who owns this account */
    private Customer customer;
    
    /** login password for this account */
    private String password;
    
    /** balance of the account */
    private double balance;
    
    /** branch to which this account belongs */
    private Branch branch;
    
    /** list of transactions made from this account */
    private List<Transaction> transactions;
    
    /**
     * Class constructor that creates a new bank account.
     * @param accNumber the unique account number
     * @param customer the customer of the account
     * @param initialBalance initial balance of the account
     * @param password the account password
     * @param branch the account branch
     */
    public Account(String accNumber, Customer customer, double initialBalance, String password, Branch branch) {
        this.accNumber = accNumber;
        this.customer = customer;
        this.balance = initialBalance;
        this.password = password;
        this.branch = branch;
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

    public String getPassword() {
        return password;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Branch getBranch() {
        return branch;
    }
        
    /**
     * Check account number and password with given parameters.
     * 
     * @param accNumber the account number 
     * @param password the password
     * @return true if given account number and password matches with this account, 
     * else return false 
     */
    public boolean checkLogin(String accNumber, String password){
        if(accNumber == null)
            return false;
        if(password == null)
            return false;
        return this.accNumber.equals(accNumber) && this.password.equals(password);
    }
    
    public abstract AccountType getType();
    public abstract boolean deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract boolean transfer(Account toAccount, double amount);
}
