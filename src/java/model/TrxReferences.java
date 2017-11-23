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
public class TrxReferences implements Serializable{
    private int trxID;
    public double amount;
    public double interest;
    public double totalAmount;
    public Date trxDate;
    
    public TrxReferences(){}
    public TrxReferences(int trxID,double amount, double interest, double totalAmount, Date trxDate){
        this.trxID=trxID;
        this.amount=amount;
        this.interest=interest;
        this.totalAmount=totalAmount;
        this.trxDate=trxDate;
    }
    
    public void setTrxID(int trxID){
        this.trxID=trxID;
    }
    
    public int getTrxID(){
        return trxID;
    }
    
}
