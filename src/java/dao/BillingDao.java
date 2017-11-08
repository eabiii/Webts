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
            
        }
            
        }

    
    
}
