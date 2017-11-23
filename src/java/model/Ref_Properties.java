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
public class Ref_Properties implements Serializable{
    private int blockNum;
    private int lotNum;
    public int endLotNum;
    protected Ref_Street street;
    protected Ref_PropertyStatus propertyStatusID;
    protected Mappoint mappointID;
    
    public Ref_Properties(){}
    
    /**
     * Constructor for the Ref_Properties Model
     * @param blockNum
     * @param lotNum
     * @param endLotNum
     * @param street
     * @param propertyStatusID
     * @param mappointID 
     */
    public Ref_Properties(int blockNum, int lotNum, int endLotNum, Ref_Street street, Ref_PropertyStatus propertyStatusID, Mappoint mappointID)
    {
        this.blockNum=blockNum;
        this.lotNum=lotNum;
        this.street=street;
        this.propertyStatusID=propertyStatusID;
        this.mappointID=mappointID;
        
                
    }
    /**
     * This method will set the value of blockNum
     * @param blockNum 
     */
    
    public void setBlockNum(int blockNum){
        this.blockNum=blockNum;
    }
    
    /**
     * This method will get the value of blockNum
     * @return 
     */
    public int getBlockNum(){
        return blockNum;
    }
    
    /**
     * This method will set the value of lotNum
     * @param lotNum 
     */
    public void setLotNum(int lotNum){
        this.lotNum=lotNum;
    }
    
    /**
     * This method will get the value of lotNum
     * @return 
     */
    public int getLotNum(){
        return lotNum;
    }
    
    /**
     * This method will set the value of street
     * @param street 
     */
    public void setStreet(Ref_Street street){
        this.street=street;
    }
    
    /**
     * This method will get the value of street
     * @return 
     */
    public Ref_Street getStreet(){
        return street;
    }
    
    /**
     * This method will set the value of propertyStatusID
     * @param propertyStatusID 
     */
    public void setPropertyStatusID(Ref_PropertyStatus propertyStatusID){
        this.propertyStatusID=propertyStatusID;
    }
    
    /**
     * This method will return the value of propertyStatusID
     * @return 
     */
    public Ref_PropertyStatus getPropertyStatusID(){
        return propertyStatusID;
    }
    
    /**
     * This method will set the value of mappoint
     * @param mappointID 
     */
    public void setMappointID(Mappoint mappointID){
        this.mappointID=mappointID;
    }
    /**
     * This method will return the value of mappoint
     * @return 
     */
    
    public Mappoint getMappointID(){
        return mappointID;
    }
}
