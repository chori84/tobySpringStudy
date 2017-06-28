package springstudy.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chori on 2017. 6. 28..
 */

@Configuration
public class CountingDaoFactory {
    @Bean
    public UserDao userDao() {
        // 수정자 적용
        UserDao userDao = new UserDao();
        // userDao의 의존관계가 ConnectionMaker > DataSource로 변경 되어 주석 처리
        // userDao.setConnectionMaker(connectionMaker());
        return userDao;
    }

    @Bean
    public ConnectionMaker connectionMaker() {
        return new CountingConnectionMaker(realConnectionMaker());
    }

    @Bean
    public ConnectionMaker realConnectionMaker() {
        return new MyConnectionMaker();
    }
}
