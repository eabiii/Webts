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
    public float amountpaid;
    
    public TrxList(){}
    
    public TrxList(Transaction_Journal journalID,TrxReferences trxID){
        this.journalID=journalID;
        this.trxID=trxID;
    }
    public void setJournalID(Transaction_Journal journalID){
        this.journalID=journalID;
    }
    
    public Transaction_Journal getJournalID(){
        return journalID;
    }
    
    public void setTrxID(TrxReferences trxID){
        this.trxID=trxID;
    }
    
    public TrxReferences getTrxID(){
        return trxID;
    }
    
}
