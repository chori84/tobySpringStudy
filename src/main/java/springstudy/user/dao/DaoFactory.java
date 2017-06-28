package springstudy.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        userDao.setConnectionMaker(connectionMaker());

        return userDao;
    }

    // 여러 DAO에서 사용할 수 있기 때문에 중복을 피하기 위해 메소드로 빼놓음.
    @Bean
    public ConnectionMaker connectionMaker() {
        return new MyConnectionMaker();
    }
}
