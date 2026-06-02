package application;

import db.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection con = null;

        Statement stmt = null;
        ResultSet rs = null;

        try{
            con=DB.getConnection();
            stmt= con.createStatement();
            rs=stmt.executeQuery("SELECT * from department");

            while (rs.next()){
                System.out.println(rs.getInt("Id")+ ", "+rs.getString("Name"));
            }

        }catch (SQLException e){
            e.printStackTrace();;
        }
        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(stmt);
            DB.closeConnection();
        }


    }
}
