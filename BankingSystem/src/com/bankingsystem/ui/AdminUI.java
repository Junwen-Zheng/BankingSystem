package com.bankingsystem.ui;

import com.bankingsystem.model.Bank;
import com.bankingsystem.model.BankingSystem;
import com.bankingsystem.model.Branch;
import java.util.List;
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
        System.out.println("3. List all Banks");
        System.out.println("0. Logout");
        System.out.println("\nEnter your choice [0 - 2]: ");
    }
    
    public void run(){
        int choice;
        boolean done = false;
        
        while(!done){
            showMenu();
            choice = input.nextInt();
            input.nextLine();
            switch(choice){
                case 0:
                    done = true;
                    break;
                case 1:
                    doCreateBank();
                    break;
                case 2:
                    doCreateAccount();
                    break;
                case 3:
                    doListBanks();
                    break;
                default:
                    System.out.println("\nInvalid choice ! Must be between 0 - 2.");
                    break;
            }
        }
    }
    
    private void doListBanks() {
        List<Bank> banks = bankSystem.getAllBanks();
        System.out.println("\nList of banks:");
        for (int i = 0; i < banks.size(); i++) {
            System.out.println(banks.get(i).getName());
        }
    }
    
    private void doCreateBank(){
        int choice;
        String name;
        String brName, brAddr;
        System.out.print("\n1. Add a new bank\n2. Add a new branch to an existing bank.\n3. Cancel");
        choice = input.nextInt();
        input.nextLine();
        if(choice == 1){
            System.out.print("Enter name of the Bank: ");
            name = input.nextLine();
            Bank b = new Bank(name);
            bankSystem.addBank(b);
            System.out.print("Bank '" + name + "' has been added.\n");
        }
        else if(choice == 2){
            List<Bank> banks = bankSystem.getAllBanks();
            System.out.println("\nChoose a bank:");
            for(int i = 0; i < banks.size(); i++){
                System.out.println(i+": " + banks.get(i).getName());
            }
            System.out.print("Enter index of bank: ");
            choice = input.nextInt();
            input.nextLine();
            Bank b = banks.get(choice);
            System.out.print("\nEnter name of new branch: ");
            brName = input.nextLine();
            System.out.print("\nEnter address of new branch: ");
            brAddr = input.nextLine();
            Branch br = new Branch(brName, brAddr);
            b.addBranch(br);
            System.out.println("Following branch has been added to bank '" + b.getName() + ":");
            System.out.println("Branch Name: " + brName);
            System.out.println("Branch Adress: " + brAddr);
        }
        else if(choice == 3){
            return;
        }
        else{
            
        }
    }
    
    private void doCreateAccount(){
        
    }
}
