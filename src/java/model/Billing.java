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
public class Billing implements Serializable{
    /**
     * Billing Class model that
     * 
     * 
     */
    
    private int billingID;
    protected int blockNum;
    protected int lotNum;
    private int precedentBilling;
    public double totalDue;
    public double totalPaid;
    
    public Billing(){}
    /**
     * Main Constructor for the model
     * 
     * @param billingID
     * @param blockNum
     * @param lotNum
     * @param precedentBilling
     * @param totalDue
     * @param totalPaid 
     */
    public Billing(int billingID, int blockNum, int lotNum, int precedentBilling,double totalDue,double totalPaid)
    {
        this.billingID=billingID;
        this.blockNum=blockNum;
        this.lotNum=lotNum;
        this.precedentBilling=precedentBilling;
        this.totalDue=totalDue;
        this.totalPaid=totalPaid;             
    }
    public Billing(int blockNum, int lotNum, int precedentBilling,double totalDue,double totalPaid)
    {
        this.blockNum=blockNum;
        this.lotNum=lotNum;
        this.precedentBilling=precedentBilling;
        this.totalDue=totalDue;
        this.totalPaid=totalPaid;             
    }
    /**
     * This method will set the value of blockNum
     * @param blockNum 
     */
    
    
    
    public void setBlockNum(int blockNum)
    {
        this.blockNum=blockNum;
           
    }
    /**
     * This method returns the value blockNum
     * 
     * 
     * @return blockNum 
     */
    
    public int getBlockNum()
    {
        return blockNum;
    }
    public void setLotNum(int lotNum)
    {
        this.lotNum=lotNum;
           
    }
    /**
     * This method returns the value blockNum
     * 
     * 
     * @return blockNum 
     */
    
    public int getLotNum()
    {
        return lotNum;
    }
    
    
 
    
}
