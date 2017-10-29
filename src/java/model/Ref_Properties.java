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
    
    
    public void setBlockNum(int blockNum){
        this.blockNum=blockNum;
    }
    
    public int getBlockNum(){
        return blockNum;
    }
    
    public void setLotNum(int lotNum){
        this.lotNum=lotNum;
    }
    
    public int getLotNum(){
        return lotNum;
    }
    
    public void setStreet(Ref_Street street){
        this.street=street;
    }
    
    public Ref_Street getStreet(){
        return street;
    }
    
    public void setPropertyStatusID(Ref_PropertyStatus propertyStatusID){
        this.propertyStatusID=propertyStatusID;
    }
    
    public Ref_PropertyStatus getPropertyStatusID(){
        return propertyStatusID;
    }
    
    public void setMappointID(Mappoint mappointID){
        this.mappointID=mappointID;
    }
    
    public Mappoint getMappointID(){
        return mappointID;
    }
}
