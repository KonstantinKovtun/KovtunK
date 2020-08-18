package ru.job4j.bank;

import org.junit.Test;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Optional;
//import java.util.Map;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
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
        bank.addUser(user);
        Optional<User> opt = bank.findByPassport("ME451296");
        assertThat(opt.get(), is(user));
    }
    /**
     * Test whenEnterInvalidPassport.
     */
    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("Petr Arsentev", "3434");
        Bank bank = new Bank();
        Optional<Account> result;
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), new Account(150D, "5546"));
        result = bank.getUserAccount("34", "5546");
        assertNull(result.get());
    }
    /**
     * Test whenDeleteUser.
     */
    @Test
    public void whenDeleteUser() {
        User user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        bank.addUser(user);
        bank.deleteUser(user);
        assertThat(bank.findByPassport("ME451296"), is(nullValue()));
    }
    /**
     * Test whenAddAccountToUser.
     */
    @Test
    public void whenAddAccountToUser() {
        Account account = new Account(800, "UAH525dh");
        User user = new User("Tommy", "TFG888888");
        Bank bank = new Bank();
        Account expect, result;
        result = account;
        expect = account;
        bank.addAccountToUser(user.getPassport(), account);
        assertThat(result, is(expect));
    }
    /**
     * Test whenGetsListOfAccountsToUser.
     */
    @Test
    public void whenGetsListOfAccountsToUser() {
        User user = new User("Mickey", "ME451296");
        Account account = new Account(800, "UAH525dh");
        Account expect;
        expect = account;
        Bank bank = new Bank();
        int count = 0;

        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);

        List<Account> result = bank.getUserAccounts(user.getPassport());

        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).equals(account)) {
                count = i;
                break;
            }
        }
        assertThat(result.get(count), is(expect));
    }
    /**
     * Test whenGetUserAccount.
     */
    @Test
    public void whenGetUserAccount() {
        User user = new User("Mickey", "ME451296");
        Bank bank = new Bank();
        Account account = new Account(800, "UAH525dh");
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        Optional<Account> result = bank.getUserAccount(user.getPassport(), "UAH525dh");
        assertThat(result.get(), is(account));
    }
    /**
     * Test whenDeleteAccountFromUser.
     */
    @Test
    public void whenDeleteAccountFromUser() {
        User user = new User("Mickey", "ME451296");
        Account account = new Account(800, "UAH525dh");
        Bank bank = new Bank();
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        bank.deleteAccountFromUser(user.getPassport(), account);
        assertThat(null, is(nullValue()));
    }
    /**
     * Test whenTransferMoneyFromOneUserAccountToAnotherUserAccount.
     */
    @Test
    public void whenTransferMoneyFromOneUserAccountToAnotherUserAccount() {
        User userSrc = new User("Erich", "NA782253");
        User userDest = new User("Paul", "GF493527");
        Bank bank = new Bank();
        bank.addUser(userSrc);
        bank.addUser(userDest);
        bank.addAccountToUser(userSrc.getPassport(), new Account(10500, "UAH525dh"));
        bank.addAccountToUser(userDest.getPassport(), new Account(7000, "SSD111fh"));
        bank.transferMoney(userSrc.getPassport(), "UAH525dh", userDest.getPassport(), "SSD111fh", 10500);
        assertThat((bank.getUserAccount(userDest.getPassport(), "SSD111fh")).get().getValue(), is(17500D));
    }
}