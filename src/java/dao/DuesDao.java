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
public class DuesDao {
    
    public static ArrayList<MonthlyDues>md()throws SQLException
    {
        ArrayList<MonthlyDues>md=new ArrayList();
        Connection connect=dbconnect.getDBConnection();
            String sql="SELECT * FROM Transaction_Journal";
            try
            {
            
            PreparedStatement pStmt=connect.prepareCall(sql);
            ResultSet rs=pStmt.executeQuery();
             while (rs.next()){
                 md.add(new MonthlyDues(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getDouble(4),rs.getInt(5)));
                 
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
        return md;
    }
    
}
