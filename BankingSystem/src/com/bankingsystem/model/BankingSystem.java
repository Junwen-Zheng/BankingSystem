
package com.bankingsystem.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
     * Add a new bank to the banking system.
     * @param bank the new Bank to be added.
     * @return true if bank added successfully, else return false
     */
    public boolean addBank(Bank bank){
        if(banks.containsKey(bank.getName())){
            return false;
        }
        else{
            banks.put(bank.getName(), bank);
            return true;
        }
    }
    
    /**
     * Get the bank with the given name.
     * @param bankName the name of the bank
     * @return The Bank with given name if exists, else return null
     */
    public Bank getBank(String bankName){
        if(banks.containsKey(bankName)){
            return banks.get(bankName);
        }
        else{
            return null;
        }
    }
    
    /**
     * Get the list of all banks in the banking system.
     * @return the List of all Bank objects in the system.
     */
    public List<Bank> getAllBanks(){
        List<Bank> banksList = new ArrayList<>();
        for(String bankName : banks.keySet()){
            Bank bank = banks.get(bankName);
            banksList.add(bank);
        }
        return banksList;
    }
    
    
    /**
     * Load the whole BankingSystem data from a serialised data file.
     * 
     * @param filename the name of the serialised data file.
     * @return the BankingSystem retrieved from the file
     */
    public static BankingSystem loadFromFile(String filename){
        try {
            FileInputStream fs = new FileInputStream(new File(filename));
            ObjectInputStream ois = new ObjectInputStream(fs);
            BankingSystem bankSystem = (BankingSystem)ois.readObject();
            return bankSystem;
        } catch (FileNotFoundException ex) {
            System.out.println("Could not found databse file " + filename);
            return null;
        } catch (IOException ex) {
            System.out.println("IO Error: " + ex.getMessage());
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("System Error: " + ex.getMessage());
            return null;
        }
    }
    
    /**
     * Save the whole BankingSystem data to a serialised data file.
     * 
     * @param filename the name of the serialised data file.
     */
    public void saveToFile(String filename){
        try {
            FileOutputStream fout = new FileOutputStream(new File(filename));
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(this);
            oos.flush();
            oos.close();
            System.out.println("BankingSystem data saved to file " + filename);
        } catch (FileNotFoundException ex) {
            System.out.println("Could not save to file " + filename);
        } catch (IOException ex) {
            System.out.println("IO Error: " + ex.getMessage());
        }
    }
}
