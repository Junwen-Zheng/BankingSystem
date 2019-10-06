package com.bankingsystem.db;

import org.dizitart.no2.Nitrite;

/**
 * This class maintains connection to the Nitrite NoSQL embedded database for storing
 * data of the banking system application.
 * 
 * @author
 */
public class DB {
    
    /** name of the embedded file to store the database */
    static final String DATABASE_FILENAME = "bankingsystem.db";
    
    /** username to connect the database */
    static final String DB_USERNAME = "admin";
    
    /** password to connect the database */
    static final String DB_PASSWD = "admin";
    
    
    /** singleton instance of DB class */
    static DB db;
    
    /** instance of the Nitrite database */
    private Nitrite nitriteDb;
    
    /**
     * Class constructor that creates the connection to the embedded Nitrite
     * database file.
     */
    private DB(){
        nitriteDb = Nitrite.builder()
                .compressed()
                .filePath(DATABASE_FILENAME)
                .openOrCreate(DB_USERNAME, DB_PASSWD);
        
    }
    
    /**
     * Get the singleton instance of the DB class
     * @return singleton instance of the DB class
     */
    public static DB getInstance(){
        if(db == null){
            db = new DB();
        }
        return db;
    }
    
    /**
     * Close the database connection.
     */
    public void close(){
        nitriteDb.close();
    }
}
