package springstudy.user.dao;

/**
 * Created by chori on 2017. 6. 28..
 */
public class DaoFactory {
    public UserDao userDao() {
        // UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지 결정
        ConnectionMaker connectionMaker = new MyConnectionMaker();
        UserDao userDao = new UserDao(connectionMaker);

        return userDao;
    }
}
