package com.bankingsystem.model;

import java.io.Serializable;
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

    public Bank() {
        accounts = new HashMap<Branch, List<Account>>();        
    }
    
    
}
