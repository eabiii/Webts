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
    
    public PaymentDetails(Billing billingID, TrxList journalID,TrxList trxID)
    {
        this.billingID=billingID;
        this.journalID=journalID;
        this.trxID=trxID;
    }
    
    
    
}
