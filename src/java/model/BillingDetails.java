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
public class BillingDetails implements Serializable{
    /**
     * Billing Details Model
     * 
     */
    protected Billing billingID;
    protected TrxReferences trxID;
    
    public BillingDetails(){}
    /**
     * Contructor for the Billing Details
     * @param billingID
     * @param trxID 
     */
    public BillingDetails(Billing billingID, TrxReferences trxID){
        this.billingID=billingID;
        this.trxID=trxID;
    }
    /**
     * This method sets the billing id
     * 
     * @param billingID 
     */
    
    public void setBillingID(Billing billingID){
        this.billingID=billingID;
    }
    /**
     * This method returns the value BillingID
     * 
     * @return  
     */
    
    public Billing getBillingID(){
        return billingID;
    }
    
    /**
     * This method sets the trxID
     * 
     * @param trxID 
     */
    
    
    public void setTrxID(TrxReferences trxID){
        this.trxID=trxID;
    }
    
    /**
     * This method returns trxID
     * 
     * @return trxID
     */
    
    public TrxReferences getTrxID(){
        return trxID;
    }
    
}
