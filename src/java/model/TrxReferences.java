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
public class TrxReferences implements Serializable{
    private int trxID;
    public float amount;
    public float interest;
    public float totalAmount;
    public date trxDate;
    
    public TrxReferences(){}
    public TrxReferences(int trxID){
        this.trxID=trxID;
    }
    
    public void setTrxID(int trxID){
        this.trxID=trxID;
    }
    
    public int getTrxID(){
        return trxID;
    }
    
}
