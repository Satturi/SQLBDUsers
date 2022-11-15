package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "1234567890");
            System.out.println("successful_connect");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("failed_connect");
        }
        return connection;
    }
}
