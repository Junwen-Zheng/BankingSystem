package com.bankingsystem.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class model a bank in the banking system application which maintains multiple
 * accounts.
 * 
 * @author
 */
public class Bank {
    
    private Map<Branch, List<Account>> accounts;

    public Bank() {
        accounts = new HashMap<Branch, List<Account>>();        
    }
    
    
}
