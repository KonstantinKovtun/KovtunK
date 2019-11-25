package ru.job4j.bank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class UserTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class UserTest {
    /**
     * Test whenAddNewUsers.
     */
    @Test
    public void addUser(User user) {
        user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        bank.addUser(user);
        assertThat(result, is(expect));
    }
    /**
     * Test deleteUser.
     */
    @Test
    public void deleteUser(User user) {
        user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        bank.addUser(user);
        assertThat(result, is(expect));
    }
}
