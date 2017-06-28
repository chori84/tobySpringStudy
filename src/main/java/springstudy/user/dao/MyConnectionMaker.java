package springstudy.user.dao;

import springstudy.user.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by chori on 2017. 6. 28..
 */
public class MyConnectionMaker implements ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/spring_study", Account.getUserId(), Account.getUserPw());
        return c;
    }
}
