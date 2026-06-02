package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.*;

public class Program {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement stmt = null;

        try{
            con=DB.getConnection();
            stmt=con.prepareStatement("DELETE FROM department where id=?");

            stmt.setInt(1,1);

            int rowsAffected=stmt.executeUpdate();

            System.out.println(rowsAffected);

        }catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }
        finally{
            DB.closeStatement(stmt);
            DB.closeConnection();
        }


    }
}
