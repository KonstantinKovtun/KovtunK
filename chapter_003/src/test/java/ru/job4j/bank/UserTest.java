package ru.job4j.bank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
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
    public void whenAddNewUsers() {
        User user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        User expect;
        expect = bank.addUser(user);
        assertThat(user, is(expect));
    }
    /**
     * Test whenDeleteUser.
     */
    @Test
    public void whenDeleteUser() {
        User user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        User result, expect;
        result = bank.addUser(user);
        expect = bank.deleteUser(user);
        assertThat(result, is(expect));
    }
    /**
     * Test whenAddAccountToUser.
     */
    @Test
    public void whenAddAccountToUser() {
        Account account = new Account(800, "UAH525dh");
        User user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        bank.addAccountToUser(user.getpassport(), account);
        assertThat(result, is(expect));
    }
}
