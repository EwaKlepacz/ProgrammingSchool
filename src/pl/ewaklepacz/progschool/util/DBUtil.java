package pl.ewaklepacz.progschool.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {


    public static final String DB_URL = "jdbc:mysql://localhost:3306/programming_school";
    public static final String DB_PROPERTIES = "?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "coderslab";
    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";

    public static Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/programming_school?useSSL=false&serverTimezone=UTC&characterEncoding=UTF-8", "root", "coderslab");

        return connection;
    }
}
