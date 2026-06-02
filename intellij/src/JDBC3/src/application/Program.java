package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DB.getConnection();
            pstmt=conn.prepareStatement(
                "INSERT INTO seller(name,email,BirthDate,BaseSalary,DepartmentId)"
                   +"VALUES(?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS
            );
            pstmt.setString(1,"Leonardo");
            pstmt.setString(2,"Leozin@gmail.com");
            pstmt.setDate(3,new java.sql.Date(sdf.parse("13/06/2003").getTime()));
            pstmt.setDouble(4,3000);
            pstmt.setInt(5,2);

            int rowsAffected=pstmt.executeUpdate();
            if(rowsAffected>0){
                ResultSet rs=pstmt.getGeneratedKeys();
                while(rs.next()){
                    int id=rs.getInt(1);
                    System.out.println("Done! Id= "+id);
                }
            }else {
                System.out.println("No rows affected");
            }




        }catch (SQLException e){
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            DB.closeConnection();
            DB.closeStatement(pstmt);
        }
    }
}
