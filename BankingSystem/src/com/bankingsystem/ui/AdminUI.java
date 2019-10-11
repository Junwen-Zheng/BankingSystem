package com.bankingsystem.ui;

import com.bankingsystem.model.BankingSystem;
import java.util.Scanner;

/**
 * This class implements the interface for all the admin level functionality
 * on the banking system.
 * 
 * @author
 */
public class AdminUI {
    
    private BankingSystem bankSystem;
    private Scanner input = new Scanner(System.in);
    
    public AdminUI(BankingSystem bankSystem) {
        this.bankSystem = bankSystem;
    }
    
    private void showMenu(){
        System.out.println("\nADMIN MENU:");
        System.out.println("1. Create a new Bank");
        System.out.println("2. Create a new Account");
        System.out.println("0. Logout");
        System.out.println("\nEnter your choice [0 - 2]: ");
    }
    
    public void run(){
        int choice;
        boolean done = false;
        
        while(!done){
            showMenu();
            choice = input.nextInt();
            switch(choice){
                case 0:
                    done = true;
                    break;
                case 1:
                    System.out.println("-- Not yet implemented --");
                    break;
                case 2:
                    System.out.println("-- Not yet implemented --");
                    break;
                default:
                    System.out.println("\nInvalid choice ! Must be between 0 - 2.");
                    break;
            }
        }
    }
}
