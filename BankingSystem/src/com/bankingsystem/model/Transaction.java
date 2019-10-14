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
    
    
}
