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
public class BillingDao {
    /*
        public static ArrayList<Billing>getAllBilling(Connection connect)throws SQLException{
            ArrayList<Billing>billing=new ArrayList();
            String sql="SELECT REF_PROPERTIES.BLOCKNUM,REF_PROPERTIES.LOTNUM,MONTHLYDUES.amount,MONTHLYDUES.MONTH,MONTHLYDUES.YEAR \n" +
                        "FROM REF_PROPERTIES\n" +
                        "JOIN HOUSEMONTHLYDUES\n" +
                        "ON REF_PROPERTIES.blocknum=HOUSEMONTHLYDUES.BLOCKNUM\n" +
                        "JOIN MONTHLYDUES\n" +
                        "ON HouseMonthlyDues.mdID=MONTHLYDUES.mdID;";
            PreparedStatement pStmt=connect.prepareCall(sql);
        ResultSet rs=pStmt.executeQuery();
       while (rs.next()){
            billing.add(new Billing(rs.getInt(1),(rs.getInt(2),(rs.))));
        }
          
        }
   */     
        public static ArrayList<Billing>getBilling()throws SQLException{
            ArrayList<Billing>billing=new ArrayList();
            Connection connect=dbconnect.getDBConnection();
            String sql="SELECT * FROM BILLING";
            try
            {
            
            PreparedStatement pStmt=connect.prepareCall(sql);
            ResultSet rs=pStmt.executeQuery();
             while (rs.next()){
                 billing.add(new Billing(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5),rs.getDouble(6),rs.getString(7),rs.getString(8)));
                 
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
        return billing;
        }
        
        
        
        
        public static int getBillingID(int bid)
        {
            int bID=-1;
            System.out.println("billid");
            //Billing bill=null;
            String sql="SELECT BILLINGID FROM BILLING WHERE BILLINGID = ?";
            Connection c=dbconnect.getDBConnection();
            
            try
            {
                PreparedStatement p=c.prepareCall(sql);
                p.setInt(1, bid);
                ResultSet rs=p.executeQuery();
                
                while(rs.next())
                {
                    bID=rs.getInt(1);

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
        /**
         * Add a new bill to the database
         * @param b
         * @return 
         */
        public static boolean addNewBill(Billing b)
        {
            boolean boo=false;
            Connection c=dbconnect.getDBConnection();
            String sql ="INSERT INTO BILLING (BILLINGID,BLOCKNUM,LOTNUM,TOTALDUE,TOTALPAID,DESCRIPTION,STATUS)VALUES(?,?,?,?,?,?,?)";
            
            try{
                int id=BillingDao.getMaxID()+1;
            PreparedStatement p=c.prepareCall(sql);
            p.setInt(1, id);
            p.setInt(2, b.getBlockNum());
             p.setInt(3, b.getLotNum());
             p.setDouble(4, b.getTotalDue()); 
             p.setDouble(5,  b.getTotalPaid()); 
             p.setString(6, b.getDesc());
             p.setString(7, b.getStatus());
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
        
        public static boolean updateBill(int id, double total,double interest,String status)
        {
            boolean boo=false;
            Connection c=dbconnect.getDBConnection();
            String sql ="UPDATE BILLING SET TOTALPAID=?, STATUS=? WHERE BILLINGID=? ";
            try{
            PreparedStatement p=c.prepareCall(sql);
            p.setDouble(1, total);
            p.setString(2, status);
             p.setInt(3,  id); 
             
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
        public static int getMaxID()
    {
         int bID=-1;
        String sql="SELECT max(billingID)  FROM Billing";
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
        

    
    
}
