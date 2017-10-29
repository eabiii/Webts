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
    
    public void setRef_Properties(Ref_Properties blockNum){this.}
    
}
