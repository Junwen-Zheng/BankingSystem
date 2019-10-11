package com.bankingsystem.model;

/**
 * This class model a specific branch details of a bank.
 * 
 * @author
 */
public class Branch {
    
    private String name;
    private String address;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Branch))
            return false;
        Branch other = (Branch)obj;
        return this.name.equals(other.name);
    }
    
    
}
