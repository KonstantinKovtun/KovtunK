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
    /**
     * Test whenGetsListOfAccountsToUser.
     */
    @Test
    public void whenGetsListOfAccountsToUser() {
        User user = new User("Mickey", "ME451296");
        Account account = new Account(800, "UAH525dh");
        Bank bank = new Bank();
        List<Account> result = bank.getUserAccounts(user.getPassport());
        Account expect = account;
        assertThat(result, is(expect));
    }
    /**
     * Test whenDeleteAccountFromUser.
     */
    @Test
    public void whenDeleteAccountFromUser() {
        User user = new User("Mickey", "ME451296");
        Account account = new Account(800, "UAH525dh");
        Bank bank = new Bank();
        bank.deleteAccountFromUser(user.getPassport(), account);
        assertThat(result, is(expect));
    }
    /**
     * Test whenDeleteAccountFromUser.
     */
    @Test
    public void whenTransfareMoneyFromOneUserAccountToAnotherUserAccount() {
        User userSrc = new User("Erich", "NA782253");
        User userDest = new User("Paul", "GF493527");
        Account accountSrc = new Account(100500, "UAH525dh");
        Account accountDest = new Account(7000, "UAH525dh");
        Bank bank = new Bank();
        bank.transferMoney(userSrc.getPassport(), accountSrc.getRequisites(), userDest.getPassport(), accountDest.getRequisites(), accountSrc.getValue());
        assertThat(result, is(expect));
    }
}