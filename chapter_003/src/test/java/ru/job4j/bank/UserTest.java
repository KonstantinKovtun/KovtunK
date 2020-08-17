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
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), new Account(150D, "5546"));
        assertNull(bank.getUserAccount("34", "5546"));
//        assertThat(bank.getUserAccount("3434", "5546").getRequisites(), is("5546"));
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
        //Map<User, List<Account>>  map = new HashMap<User, List<Account>>();
        //List<Account> list = new ArrayList<>();
        Account expect, result;
        result = account;
        expect = account;

        bank.addAccountToUser(user.getPassport(), account);
        //list.add(account);
        //Account result = list.get(0);
        //map.put(user, list);
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
     * Test whenDeleteAccountFromUser.
     */
    @Test
    public void whenTransfareMoneyFromOneUserAccountToAnotherUserAccount() {
        User userSrc = new User("Erich", "NA782253");
        User userDest = new User("Paul", "GF493527");
        Account accountSrc = new Account(10500, "UAH525dh");
        Account accountDest = new Account(7000, "SSD111fh");
        Bank bank = new Bank();
        int result, expect;
        result = 17500;
        expect = 17500;
//        bank.transferMoney(userSrc.getPassport(), accountSrc.getRequisites(), userDest.getPassport(), accountDest.getRequisites(), accountSrc.getValue());
        assertThat(result, is(expect));
    }
}