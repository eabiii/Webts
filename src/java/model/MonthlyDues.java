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
public class MonthlyDues implements Serializable{
    private int mdID;
    public int month;
    public int year;
    public double amount;
    protected Ref_MonthlyDues mDues;
    
    public MonthlyDues(){}
    
    public void setMdID(int mdID){
        this.mdID=mdID;
    }
    
    public int getMdID(){
        return mdID;
    }
    
    public void setMonth(int month){
        this.month=month;
    }
    
    public int getMonth(){
        return month;
    }
    
 
    
    
     
     
    
    
}
