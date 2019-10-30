package com.bankingsystem.ui;

import com.bankingsystem.model.BankingSystem;
import java.util.Scanner;

/**
 * This class implements the login interface that starts up when the banking system
 * application is run.
 * 
 * @author
 */
public class LoginUI {

    private BankingSystem bankSystem;
    private Scanner input = new Scanner(System.in);
    
    public LoginUI(BankingSystem bankSystem) {
        this.bankSystem = bankSystem;
    }
    
    private void showMenu(){
        System.out.println("\nLOGIN MENU:");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Customer");
        System.out.println("0. Exit");
        System.out.println("\nEnter your choice [0 - 2]: ");
    }
    
    /**
     * Run the login interface which prints options for user to login as a customer
     * or as Admin of the whole banking system
     */
    public void run(){
        int choice;
        boolean done = false;
        String username, password;
        
        while(!done){
            showMenu();
            choice = input.nextInt();
            switch(choice){
                case 0:
                    done = true;
                    break;
                case 1:
                    System.out.print("Enter admin username: ");
                    username = input.nextLine();
                    System.out.print("Enter admin password: ");
                    password = input.nextLine();
                    if(username.equals("admin") && password.equals("admin123")){
                        AdminUI adminUI = new AdminUI(bankSystem);
                        adminUI.run();
                    }
                    else{
                        System.out.println("\nInvalid Login!");
                    }
                    break;
                case 2:
                    System.out.println("-- Not yet implemented --");
                    break;
                default:
                    System.out.println("\nInvalid choice ! Must be between 0 - 2.");
                    break;
            }
        }
        System.out.println("\nThanks for using the Banking System.");
        System.out.println("Have a nice day! Goodbye.\n");
    }
}
