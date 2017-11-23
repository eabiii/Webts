/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author eabiii
 */

import java.io.*;
import java.util.*;
public class TrxList implements Serializable{
    
    protected Transaction_Journal journalID;
    protected TrxReferences trxID;
    public double amountpaid;
    
    public TrxList(){}
    
    /**
     * Constructor for the TrxList Model
     * @param journalID
     * @param trxID
     * @param amountPaid 
     */
    public TrxList(Transaction_Journal journalID,TrxReferences trxID,double amountPaid)
    {
        this.journalID=journalID;
        this.trxID=trxID;
        this.amountpaid=amountPaid;
        
    }
    /**
     * This method will set the value of journalID
     * @param journalID 
     */
    
    public void setJournalID(Transaction_Journal journalID){
        this.journalID=journalID;
    }
    
    /**
     * This method will return the value of journalID
     * @return 
     */
    public Transaction_Journal getJournalID(){
        return journalID;
    }
    
    /**
     * This method will set the value of trxID
     * @param trxID 
     */
    public void setTrxID(TrxReferences trxID){
        this.trxID=trxID;
    }
    
    /**
     * This method will return the value of trxID
     * @return 
     */
    public TrxReferences getTrxID(){
        return trxID;
    }
    
}
