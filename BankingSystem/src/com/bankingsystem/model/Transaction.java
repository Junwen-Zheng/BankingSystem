package com.bankingsystem.model;

import java.io.Serializable;

/**
 * This class model a single transaction of a bank account which is either deposit or
 * withdraw or transfer.
 * 
 * @author
 */
public class Transaction implements Serializable {
    
    public enum TransactionType { DEPOSIT, WITHDRAW, TRANSFER };
    
    private double amount;
    private TransactionType type;
    private Account destAccount;

    public Transaction(double amount, TransactionType type) {
        this.amount = amount;
        this.type = type;
        destAccount = null;
    }
    
    public Transaction(double amount, TransactionType type, Account destAccount) {
        this.amount = amount;
        this.type = type;
        this.destAccount = destAccount;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public Account getDestAccount() {
        return destAccount;
    }
        
}
