package pl.ewaklepacz.progschool.app;

import pl.ewaklepacz.progschool.dao.UserDAO;
import pl.ewaklepacz.progschool.model.User;
import pl.ewaklepacz.progschool.util.DBUtil;
import java.sql.SQLException;

public class TestApp {
    public static void main(String[] args)throws SQLException {

        User user = new User ();
        System.out.println(user);

        UserDAO userDAO = new UserDAO();
        user = userDAO.create(user);

        System.out.println(user);

    }
private static void testConnect () throws SQLException {
        DBUtil.connect();
        UserDAO userDAO = new UserDAO();
        User user = userDAO.read(1);
    System.out.println(user);
    User user2 = userDAO.read(101);
    System.out.println(user2);

    }

}
