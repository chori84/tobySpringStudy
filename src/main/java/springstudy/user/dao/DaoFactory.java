package springstudy.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import springstudy.user.Account;

import javax.sql.DataSource;

/**
 * Created by chori on 2017. 6. 28..
 */

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        // UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지 결정
        // 수정자 적용
        UserDao userDao = new UserDao();
        // DataSource로 변경
        userDao.setDataSource(dataSource());

        return userDao;
    }

    // 여러 DAO에서 사용할 수 있기 때문에 중복을 피하기 위해 메소드로 빼놓음.
    @Bean
    public ConnectionMaker connectionMaker() {
        return new MyConnectionMaker();
    }

    // DataSource의 구현체인 SimpleDriverDataSource 객체를 반환해주는 메소드 추가
    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost/spring_study");
        dataSource.setUsername(Account.getUserId());
        dataSource.setPassword(Account.getUserPw());

        return dataSource;
    }
}
