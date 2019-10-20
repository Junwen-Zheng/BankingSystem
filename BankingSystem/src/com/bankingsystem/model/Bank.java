package com.bankingsystem.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class model a bank in the banking system application which maintains multiple
 * accounts.
 * 
 * @author
 */
public class Bank implements Serializable {
    
    /** name of the bank */
    private String name;
    
    /** list of all accounts in this bank grouped by branch */
    private Map<Branch, List<Account>> accounts;

    /**
     * Class constructor that creates a new bank with given name.
     * 
     * @param name the name of the bank
     */
    public Bank(String name) {
        this.name = name;
        accounts = new HashMap<Branch, List<Account>>();        
    }

    /**
     * Get the name of the bank.
     * @return the name of the bank
     */
    public String getName() {
        return name;
    }

    /**
     * Get the list of all accounts in this bank
     * @return the List of all Account in this bank as a map with Branch as key
     */
    public Map<Branch, List<Account>> getAccounts() {
        return accounts;
    }
    
    /**
     * Add a new account to the bank.
     * @param acc the new Account
     */
    public void addAccount(Account acc){
        Branch accBranch = acc.getBranch();
        List<Account> branchAccounts;
        if(!accounts.containsKey(accBranch)){
            branchAccounts = new ArrayList<>();
        }
        else{
            branchAccounts = accounts.get(accBranch);
        }
        branchAccounts.add(acc);
    }
    
    /**
     * Check login of a customer with given account number and password with this
     * bank.
     * 
     * @param accNum the input account number
     * @param password the input password
     * @return true if login matches with any account in this bank, else return false
     */
    public boolean validateLogin(String accNum, String password){
        for(Branch br : accounts.keySet()){
            List<Account> branchAccounts = accounts.get(br);
            for(Account acc : branchAccounts){
                if(acc.checkLogin(accNum, password)){
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
