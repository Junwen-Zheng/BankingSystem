
package com.bankingsystem.model;

import java.io.Serializable;

/**
 * This class model all customer details associated with a bank account.
 * 
 * @author
 */
public class Customer implements Serializable {
    
    private String firstName;
    private String lastName;
    private String address;

    public Customer(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
    
    
}
