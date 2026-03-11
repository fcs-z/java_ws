package java7_GenericPractice;

import java.util.List;

/**
 * @author Fcs
 * @description
 * @date 2024-10-30 16:54
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
//        DAO<Student> dao1 = new DAO<>();

        dao.save("1001",new User(1001,34,"Tom"));
        dao.save("1002",new User(1002,24,"Jerry"));

        System.out.println(dao.get("1001"));

        dao.update("1002",new User(1002,25,"J"));

        dao.delete("1002");

        System.out.println("-----------------");
        List<User> list = dao.list();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
