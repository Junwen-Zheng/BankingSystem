package com.bankingsystem;

import com.bankingsystem.db.DB;
import com.bankingsystem.model.BankingSystem;
import com.bankingsystem.ui.LoginUI;

/**
 * This is the main driver class for running the console based Banking System
 * application.
 * 
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("*********************************************");
        System.out.println("* Welcome to the Banking System Application *");
        System.out.println("*********************************************");
        
        BankingSystem bankSystem = BankingSystem.loadFromFile("BankingSystem.dat");
        if(bankSystem == null){
            bankSystem = new BankingSystem();
            System.out.println("Database could not be loaded from file BankingSystem.dat");
            System.out.println("Creating empty database.\n");
        }
        else{
            System.out.println("Database successfully loaded from file BankingSystem.dat\n");
        }
        LoginUI login = new LoginUI(bankSystem);
        login.run();
    }
    
}
