package com.bankingsystem.ui;

import com.bankingsystem.model.Account;
import com.bankingsystem.model.BankingSystem;
import java.util.Scanner;

/**
 * This class implements the interface for a customer to operate on its selected
 * bank account.
 * 
 * @author
 */
public class CustomerUI {
    
    private BankingSystem bankSystem;
    private Account account;
    private Scanner input = new Scanner(System.in);

    
    public CustomerUI(BankingSystem bankSystem, Account account) {
        this.bankSystem = bankSystem;
        this.account = account;
    }
    
    
    private void showMenu(){
        System.out.println("\nCUSTOMER MENU:");
        System.out.println("1. Check account Balance");
        System.out.println("2. Deposit money to account");
        System.out.println("3. Withdraw money from account");
        System.out.println("4. Transfer money to another account");
        System.out.println("5. Dusplay bank statement.");
        System.out.println("0. Logout");
        System.out.println("\nEnter your choice [0 - 5]: ");
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
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("-- Not yet implemented --");
                    break;
                default:
                    System.out.println("\nInvalid choice ! Must be between 0 - 5.");
                    break;
            }
        }
    }
}
