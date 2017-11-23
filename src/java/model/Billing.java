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
    
    private int billingID;
    protected Ref_Properties blockNum;
    protected Ref_Properties lotNum;
    private int precedentBilling;
    public double totalDue;
    public double totalPaid;
    
    public Billing(){}
    
    public Billing(int billingID, Ref_Properties blockNum, Ref_Properties lotNum, int precedentBilling,double totalDue,double totalPaid)
    {
        this.billingID=billingID;
        this.blockNum=blockNum;
        this.lotNum=lotNum;
        this.precedentBilling=precedentBilling;
        this.totalDue=totalDue;
        this.totalPaid=totalPaid;
    }
    
    public void setBlockNum(Ref_Properties blockNum)
    {
        this.blockNum=blockNum;
    }
    
    public Ref_Properties getBlockNum()
    {
        return blockNum;
    }
    
}
