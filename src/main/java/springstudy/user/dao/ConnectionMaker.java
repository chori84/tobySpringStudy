package springstudy.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by chori on 2017. 6. 28..
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
