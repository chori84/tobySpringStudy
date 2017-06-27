package springstudy.user.dao;

/**
 * Created by chori on 2017. 6. 28..
 */
public class DaoFactory {
    public UserDao userDao() {
        // UserDao 타입의 오브젝트를 어떻게 만들고, 어떻게 준비시킬지 결정
        UserDao userDao = new UserDao(connectionMaker());

        return userDao;
    }

//    public AccountDao accountDao() {
//        return new AccountDao(connectionMaker());
//    }

    // 여러 DAO에서 사용할 수 있기 때문에 중복을 피하기 위해 메소드로 빼놓음.
    public ConnectionMaker connectionMaker() {
        return new MyConnectionMaker();
    }
}
