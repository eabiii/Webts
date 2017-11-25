/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author eabiii
 */
import java.util.*;
import java.sql.*;
import model.*;
public class TransactionDao {
    
    
   
    
    public static boolean addTransactionReference( TrxReferences tx )
    {
        boolean boo=false;
            Connection c=dbconnect.getDBConnection();
            String sql ="INSERT INTO TRXREFERENCES (TRXID,AMOUNT,INTEREST,TOTALAMOUNT,TRXDATE)VALUES(?,?,?,?,?)";
            
            try{
            PreparedStatement p=c.prepareCall(sql);
            p.setInt(1, tx.getTrxID());
            p.setDouble(2, tx.getAmount());
             p.setDouble(3, tx.getInterest());
             p.setDouble(4, tx.getTotalAmount()); 
              java.sql.Date sqlDate = new java.sql.Date(tx.getDate().getTime());
             p.setDate(5,  sqlDate); 
             
             int added=p.executeUpdate();
             if(added!=0)
             {
                 boo=true;
             }
            }catch(Exception e){
                boo=false;
                e.printStackTrace();
            }
            return boo;
    }
    
     public static int getMaxTrxID()
    {
         int bID=-1;
        String sql="SELECT max(trxID)  FROM trxReferences";
        Connection c=dbconnect.getDBConnection();
          try
            {
                PreparedStatement p=c.prepareCall(sql);
                ResultSet rs=p.executeQuery();
                
                while(rs.next())
                {
                    bID=rs.getInt(1);
                   // bill=new Billing();
                   // bill.setID(rs.getInt(1));
                   // bill.setBlockNum(rs.getInt(2));
                   // bill.setLotNum(rs.getInt(3));
                    //bill.setTotalDue(rs.getInt(4));
                                       //  System.out.println("billiswqd");
                }
                
           }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(c!=null)
                { 
                    try
                    {
                        c.close();
                    }catch(Exception e){}
                }
            }
                                 System.out.println("The id "+bID);
            return bID;
    }
    
    public static int getJournalID(int bill)
    {
         int bID=-1;
            System.out.println("billid");
            String sql="SELECT JOURNALID FROM PAYMENTDETAILS WHERE BILLING_BILLINGID=? ";
            Connection c=dbconnect.getDBConnection();
            
            try
            {
                PreparedStatement p=c.prepareCall(sql);
                p.setInt(1, bill);
                p.setInt(2, bID);
                ResultSet rs=p.executeQuery();
                
                while(rs.next())
                {
                    bID=rs.getInt(1);
                   // bill=new Billing();
                   // bill.setID(rs.getInt(1));
                   // bill.setBlockNum(rs.getInt(2));
                   // bill.setLotNum(rs.getInt(3));
                    //bill.setTotalDue(rs.getInt(4));
                                       //  System.out.println("billiswqd");
                }
                
           }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(c!=null)
                { 
                    try
                    {
                        c.close();
                    }catch(Exception e){}
                }
            }
                                 System.out.println("The id "+bID);
            return bID; 
    }
    
    
    
    public static int getTrxID(int jid, int bif)
    {
        int bID=-1;
        System.out.println("joun is"+jid);
            System.out.println("billid is"+bif);
            String sql="select trxreferences.trxid from trxReferences join BILLINGDETAILS on trxReferences.trxID=BILLINGDETAILS.trxID where trxReferences.trxID=? and BILLINGDETAILS.billingID=?";
            Connection c=dbconnect.getDBConnection();
            
            try
            {
                PreparedStatement p=c.prepareCall(sql);
                p.setInt(1, jid);
                p.setInt(2, bif);
                ResultSet rs=p.executeQuery();
                
                while(rs.next())
                {
                    bID=rs.getInt(1);
                    System.out.println("value of bid "+bID);
                   // bill=new Billing();
                   // bill.setID(rs.getInt(1));
                   // bill.setBlockNum(rs.getInt(2));
                   // bill.setLotNum(rs.getInt(3));
                    //bill.setTotalDue(rs.getInt(4));
                                       //  System.out.println("billiswqd");
                }
                
           }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(c!=null)
                { 
                    try
                    {
                        c.close();
                    }catch(Exception e){}
                }
            }
                                 System.out.println("The id "+bID);
            return bID;
    }
    
    public static int getJTransactionID(int id)
    {
        int bID=-1;
            System.out.println("billid");
            //Billing bill=null;
            String sql="SELECT JOURNALLID FROM TRANSACTION_JOURNAL WHERE JOURNALLID = ?";
            Connection c=dbconnect.getDBConnection();
            
            try
            {
                PreparedStatement p=c.prepareCall(sql);
                p.setInt(1, id);
                ResultSet rs=p.executeQuery();
                
                while(rs.next())
                {
                    bID=rs.getInt(1);
                   // bill=new Billing();
                   // bill.setID(rs.getInt(1));
                   // bill.setBlockNum(rs.getInt(2));
                   // bill.setLotNum(rs.getInt(3));
                    //bill.setTotalDue(rs.getInt(4));
                                       //  System.out.println("billiswqd");
                }
                
           }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(c!=null)
                { 
                    try
                    {
                        c.close();
                    }catch(Exception e){}
                }
            }
                                 System.out.println("The id "+bID);
            return bID;
            
    }
    
    
    
    public static ArrayList<Transaction_Journal>getJournal()throws SQLException
    {
        ArrayList<Transaction_Journal>j=new ArrayList();
            Connection connect=dbconnect.getDBConnection();
            String sql="SELECT * FROM Transaction_Journal";
            try
            {
            
            PreparedStatement pStmt=connect.prepareCall(sql);
            ResultSet rs=pStmt.executeQuery();
             while (rs.next()){
                 j.add(new Transaction_Journal(rs.getInt(1),rs.getDate(2),rs.getInt(3),rs.getInt(4)));
                 
             }
             System.out.println("good1");
            }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(connect!=null)
                { 
                    try
                    {
                        connect.close();
                    }catch(Exception e){}
                }
            }
        return j;
    }
    
       public static ArrayList<TrxReferences>getTransactionReferences()throws SQLException
    {
        ArrayList<TrxReferences>tr=new ArrayList();
            Connection connect=dbconnect.getDBConnection();
            String sql="SELECT * FROM TrxReferences";
            try
            {
            
            PreparedStatement pStmt=connect.prepareCall(sql);
            ResultSet rs=pStmt.executeQuery();
             while (rs.next()){
                 tr.add(new TrxReferences(rs.getInt(1),rs.getDouble(2),rs.getDouble(3),rs.getDouble(4),rs.getDate(5)));
                 
             }
             System.out.println("good1");
            }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(connect!=null)
                { 
                    try
                    {
                        connect.close();
                    }catch(Exception e){}
                }
            }
        return tr;
    }
    
    public static ArrayList<PaymentDetails>getPaymentDetails()throws SQLException
    {
        ArrayList<PaymentDetails>p=new ArrayList();
            Connection connect=dbconnect.getDBConnection();
            String sql="SELECT * FROM PaymentDetails";
            try
            {
            
            PreparedStatement pStmt=connect.prepareCall(sql);
            ResultSet rs=pStmt.executeQuery();
             while (rs.next()){
                 p.add(new PaymentDetails(rs.getInt(1),rs.getInt(2),rs.getInt(3)));
                 
             }
             System.out.println("good1");
            }catch(Exception e){
            
                e.printStackTrace();
            }finally
            {
                if(connect!=null)
                { 
                    try
                    {
                        connect.close();
                    }catch(Exception e){}
                }
            }
        return p;
    }
    
    
}
