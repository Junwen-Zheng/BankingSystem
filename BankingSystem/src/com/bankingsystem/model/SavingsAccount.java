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
     * @param  password the account password
     * @param branch the account branch
     */
    public SavingsAccount(String accId, Customer customer, double initialBalance, String password, Branch branch) {
        super(accId, customer, initialBalance, password, branch);
    }

    
    @Override
    public AccountType getType() {
        return Account.AccountType.SAVINGS;
    }

    @Override
    public boolean deposit(double amount) {
        balance += amount;
        Transaction t = new Transaction(amount, Transaction.TransactionType.DEPOSIT);
        transactions.add(t);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance < amount) return false;
        balance -= amount;
        Transaction t = new Transaction(amount, Transaction.TransactionType.WITHDRAW);
        transactions.add(t);
        return true;
    }

    @Override
    public boolean transfer(Account toAccount, double amount) {
        if(balance < amount) return false;
        balance -= amount;
        Transaction t = new Transaction(amount, Transaction.TransactionType.TRANSFER, toAccount);
        transactions.add(t);
        return true;
    }
    
}
