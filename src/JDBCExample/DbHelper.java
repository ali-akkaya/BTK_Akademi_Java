package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private   String _dbUserName = "root";
    private   String _dbUserPassword = "root1234";
    private String _dbUrl = "jdbc:mysql://localhost:3306/classicmodels";

    public Connection getConnection()throws SQLException {

        return DriverManager.getConnection(_dbUrl,_dbUserName,_dbUserPassword);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error Code: "+exception.getErrorCode());
    }
}
