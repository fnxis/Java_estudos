package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DB.getConnection();
            pstmt=conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary+? WHERE DepartmentId=?"
            );

            pstmt.setDouble(1,400);
            pstmt.setInt(2,1);

            int rowsAffected=pstmt.executeUpdate();
            System.out.println("Done ! "+rowsAffected + " rows affected.");


        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DB.closeConnection();
            DB.closeStatement(pstmt);
        }

    }
}
