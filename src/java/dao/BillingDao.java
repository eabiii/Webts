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
import model.Billing;
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
                 billing.add(new Billing(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5),rs.getDouble(6)));
                 
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
        
        public static boolean addNewBill(Billing b)
        {
            boolean boo=false;
            Connection c=dbconnect.getDBConnection();
            String sql ="INSERT INTO BILLING (BILLINGID,BLOCKNUM,LOTNUM,TOTALDUE,TOTALPAID)VALUES(?,?,?,?,?)";
            
            try{
            PreparedStatement p=c.prepareCall(sql);
            p.setInt(1, b.getID());
            p.setInt(2, b.getBlockNum());
             p.setInt(3, b.getLotNum());
             p.setDouble(4, b.getTotalDue()); 
             p.setDouble(5,  b.getTotalPaid()); 
             
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
        
        

    
    
}
