
package com.bankingsystem.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * This class model the entire banking system information that holds data for all banks and 
 * their accounts and customers.
 * 
 * @author
 */
public class BankingSystem implements Serializable {
    
    /** collection of all bank details data */
    private Map<String, Bank> banks;

    /**
     * Class constructor that creates an empty BankingSystem.
     */
    public BankingSystem() {
        banks = new HashMap<String, Bank>();
    }
    
    
    
    /**
     * Load the whole BankingSystem data from a serialised data file.
     * 
     * @param filename the name of the serialised data file.
     * @return the BankingSystem retrieved from the file
     */
    public static BankingSystem loadFromFile(String filename){
        return null;
    }
}
