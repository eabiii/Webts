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
public class Ref_Street {
    
    private String street;
    
    public Ref_Street(){}
    
    public Ref_Street( String street){
        this.street=street;
    
    }
    public void setStreet(String street){
        this.street=street;
    }
    public String getStreet(){
        return street;
    }
    
}
