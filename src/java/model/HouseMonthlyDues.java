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
    
    /**
     * Constructor for the HouseMonthlyDues Model
     * 
     * @param blockNum
     * @param lotNum
     * @param mdID
     * @param trxID 
     */
    
    public HouseMonthlyDues(Ref_Properties blockNum,Ref_Properties lotNum,MonthlyDues mdID,TrxReferences trxID)
    {
        this.blockNum=blockNum;
        this.lotNum=lotNum;
        this.mdID=mdID;
        this.trxID=trxID;
    }
    
    
    /**
     * This method will set the value of blockNum
     * @param blockNum 
     */
    
     public void setBlockNum(Ref_Properties blockNum){
        this.blockNum=blockNum;
    }
     /**
      * This method returns the value of blockNum
      * @return blockNum
      */
    
    public Ref_Properties getBlockNum(){
        return blockNum;
    }
    
    /**
     * This method will set the value of lotNum
     * @param lotNum 
     */
    
    public void setLotNum(Ref_Properties lotNum){
        this.lotNum=lotNum;
    }
    
    /**
     * This method will return the value of blockNum
     * @return lotNum
     */
    
    public Ref_Properties getLotNum(){
        return lotNum;
    }
    /**
     * This method will set the value of MdID
     * @param mdID 
     */
    
    public void setMdID(MonthlyDues mdID){
        this.mdID=mdID;
    }
    /**
     * This method will return the value of MdID
     * @return 
     */
    
    public MonthlyDues getMdID(){
        return mdID;
    }
    /**
     * This method will set the value of trxID
     * @param trxID 
     */
    
    public void setTrxID(TrxReferences trxID){
        this.trxID=trxID;
    }
    
    /**
     * This method will return the value of trxID
     * @return 
     */
    
    public TrxReferences getTrxID(){
        return trxID;
    }
            
    
}
