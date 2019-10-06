package com.bankingsystem;

import com.bankingsystem.db.DB;

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
        // instantiate database
        DB db = DB.getInstance();
        System.out.println("Connected to Banking System database.");
        System.out.println("*********************************************");
        System.out.println("* Welcome to the Banking System Application *");
        System.out.println("*********************************************");
    }
    
}
