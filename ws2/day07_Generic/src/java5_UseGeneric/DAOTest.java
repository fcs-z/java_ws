package java5_UseGeneric;

import org.junit.Test;

import java.util.List;

/**
 * @author Fcs
 * @description
 * @date 2024-10-29 19:40
 */
public class DAOTest {

    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();
        dao1.add(new Customer());
        List<Customer> forList = dao1.getForList(1);

        StudentDAO dao2 = new StudentDAO();
        dao2.add(new Student());
        dao2.get(1);
    }
}
