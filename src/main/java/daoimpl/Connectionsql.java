package daoimpl;

import java.sql.*;

public class Connectionsql {

    Connection conn;
    Statement stmt;
    ResultSet rs = null;
    public ResultSet jdbc(String sql){

        String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;database=HOTEL";
        String user = "sa";
        String password = "123456";

        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet jdbc1(String sql){

        String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost:1433;database=HOTEL";
        String user = "sa";
        String password = "123456";

        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
