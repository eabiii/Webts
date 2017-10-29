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
    protected Billing billingID;
    protected TrxReferences trxID;
    
    public BillingDetails(){}
    
    public BillingDetails(Billing billingID, TrxReferences trxID){
        this.billingID=billingID;
        this.trxID=trxID;
    }
    
    public void setBillingID(Billing billingID){
        this.billingID=billingID;
    }
    
    public Billing getBillingID(){
        return billingID;
    }
    
    public void setTrxID(TrxReferences trxID){
        this.trxID=trxID;
    }
    
    public TrxReferences getTrxID(){
        return trxID;
    }
    
}
