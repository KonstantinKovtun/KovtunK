package ru.job4j.list;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class UserConvertTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class UserConvertTest {
    @Test
    public void whenListConvertToMap() {
        User user1 = new User("Poroshenko", "Kiev", 38);
        User user2 = new User("Kuchma", "Kharkiv", 30);
        User user3 = new User("Kravchuk", "Dnepr", 25);
        List<User> list = (Arrays.asList(user1, user2, user3));
        UserConvert userConvert = new UserConvert();

        HashMap<Integer, User> result = userConvert.process(list);
        Map<Integer, User> expect = new HashMap<Integer, User>() { {
            put(38, user1);
            put(30, user2);
            put(25, user3);
        } };

        assertThat(result, is(expect));
    }
}
