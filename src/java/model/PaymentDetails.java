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
public class PaymentDetails implements Serializable {
    
    protected Billing billingID;
    protected TrxList journalID;
    protected TrxList trxID;
    
    public PaymentDetails(){}
    /**
     * Constructor for the PaymentDetails Model
     * @param billingID
     * @param journalID
     * @param trxID 
     */
    public PaymentDetails(Billing billingID, TrxList journalID,TrxList trxID)
    {
        this.billingID=billingID;
        this.journalID=journalID;
        this.trxID=trxID;
    }
    /**
     * This method will set the value of billingID
     * @param billingID 
     */
    public void setBillingID(Billing billingID)
    {
        this.billingID=billingID;
    }
    /**
     * This method will return the value of billingID
     * @return billingID
     */
    public Billing getBillingID()
    {
        return billingID;
    }
    /**
     * This method will set the value of journalID
     * @param journalID 
     */
    public void setJournalID(TrxList journalID)
    {
        this.journalID=journalID;
    }
    /**
     * This method will get the value of blockNum
     * @return journalID
     */
    
    public TrxList getJournalID()
    {
        return journalID;
    }
    
    /**
     * This method will set the value of trxID
     * @param trxID 
     */
    public void setTrxID(TrxList trxID)
    {
        this.trxID=trxID;
    }
    
    /**
     * This method will get the value of blockNum
     * @return 
     */
    public TrxList getTrxID()
    {
        return trxID;
    }
    
    
    
}
