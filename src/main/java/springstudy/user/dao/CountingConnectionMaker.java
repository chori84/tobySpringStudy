package springstudy.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by chori on 2017. 6. 28..
 *
 * 프록시 패턴을 이용한 DB 연결 횟수 카운팅 클래스
 */
public class CountingConnectionMaker implements ConnectionMaker {
    int counter = 0;
    private ConnectionMaker realConnectionMaker;

    public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
        this.realConnectionMaker = realConnectionMaker;
    }

    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        this.counter++;
        return realConnectionMaker.makeConnection();
    }

    public int getCounter() {
        return this.counter;
    }
}
