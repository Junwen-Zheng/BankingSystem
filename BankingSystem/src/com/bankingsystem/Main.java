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
        
        BankingSystem bankSystem = new BankingSystem();
        LoginUI login = new LoginUI(bankSystem);
        login.run();
    }
    
}
