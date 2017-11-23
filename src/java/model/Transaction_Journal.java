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
import java.sql.Date;
public class Transaction_Journal implements Serializable{
    private int journalID;
    public Date trxDate;
    public double trxAmt;
    public double trxAmtPaid;
    
    public Transaction_Journal(){}
    
    /**
     * Constructor for the Transaction_Journal Model
     * @param journalID
     * @param trxDate
     * @param trxAmt
     * @param trxAmtPaid 
     */
    public Transaction_Journal(int journalID, Date trxDate, double trxAmt, double trxAmtPaid){
        this.journalID=journalID;
        this.trxDate=trxDate;
        this.trxAmt=trxAmt;
        this.trxAmtPaid=trxAmtPaid;
    }
    
    /**
     * This method will set the value of journalID
     * @param journalID 
     */
    public void setJournalID(int journalID){
        this.journalID=journalID;
    }
    /**
     * This method will return the value of journalID
     * @return journalID
     */
    public int getJournalID(){
        return journalID;
    }
    
    
}
