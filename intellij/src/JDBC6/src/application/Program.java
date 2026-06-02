package application;

import db.DB;
import db.DbException;

import java.sql.*;

public class Program {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            con = DB.getConnection();
            con.setAutoCommit(false);
            stmt=con.createStatement();

            int rows1= stmt.executeUpdate("UPDATE seller SET BaseSalary=2090 WHERE DepartmentId=1");

           // int x=1;
            //if (x<2){
            //    throw new SQLException("Fake error");
           // }

            int rows2= stmt.executeUpdate("UPDATE seller SET BaseSalary=3090 WHERE DepartmentId=2");

            con.commit();
            System.out.println("rows1="+rows1);
            System.out.println("rows2="+rows2);

        }catch (SQLException e){
            try{
            con.rollback();
            throw new DbException("Transaction Rollback error! Cause by: "+e.getMessage());
        }catch (SQLException ex){
            throw new DbException("Error rolling back transaction! Cause by: "+ex.getMessage());}
        }
        finally{
            DB.closeStatement(stmt);
            DB.closeConnection();
        }


    }
}
