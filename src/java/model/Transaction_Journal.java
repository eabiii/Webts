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
public class Transaction_Journal implements Serializable{
    private int journalID;
    public date trxDate;
    public float trxAmt;
    public float trxAmtPaid;
    
    public Transaction_Journal(){}
    
    public Transaction_Journal(int journalID){
        this.journalID=journalID;
    }
    
    public void setJournalID(int journalID){
        this.journalID=journalID;
    }
    
    public int getJournalID(){
        return journalID;
    }
    
    
}
