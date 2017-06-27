package springstudy.user.dao;

import springstudy.user.domain.User;

import java.sql.SQLException;

/**
 * Created by chori on 2017. 6. 28..
 */
public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 테스트 클래스의 목적인 UserDao의 테스트 역할만을 위해 Connection 객체 생성을 DaoFactory에게 넘겼다.
        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}