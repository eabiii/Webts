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
public class HouseMonthlyDues implements Serializable{
    protected Ref_Properties blockNum;
    protected Ref_Properties lotNum;
    protected MonthlyDues mdID;
    protected TrxReferences trxID;
    
    public HouseMonthlyDues(){}
    
    public HouseMonthlyDues(Ref_Properties blockNum,Ref_Properties lotNum,MonthlyDues mdID,TrxReferences trxID)
    {
        this.blockNum=blockNum;
        this.lotNum=lotNum;
        this.mdID=mdID;
        this.trxID=trxID;
    }
    
    
    
    
     public void setBlockNum(Ref_Properties blockNum){
        this.blockNum=blockNum;
    }
    
    public Ref_Properties getBlockNum(){
        return blockNum;
    }
    
    public void setLotNum(Ref_Properties lotNum){
        this.lotNum=lotNum;
    }
    
    public Ref_Properties getLotNum(){
        return lotNum;
    }
    
    public void setMdID(MonthlyDues mdID){
        this.mdID=mdID;
    }
    
    public MonthlyDues getMdID(){
        return mdID;
    }
    
    public void setTrxID(TrxReferences trxID){
        this.trxID=trxID;
    }
    
    public TrxReferences getTrxID(){
        return trxID;
    }
            
    
}
