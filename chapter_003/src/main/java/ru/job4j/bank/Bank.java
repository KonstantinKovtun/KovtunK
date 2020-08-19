package ru.job4j.bank;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Bank makes operation with users' account.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 18.08.2020
 */
public class Bank {

    /**
     * A variable of mathematical operations value.
     */
    private Map<User, List<Account>> usersAccounts;

    /**
     * Bank. Builds the Bank objects.
     */
    public Bank() {
        this.usersAccounts = new HashMap<User, List<Account>>();
    }

    /**
     * addUser. Adds user to map.
     * @param user, first value.
     */
    public void addUser(User user) {
        this.usersAccounts.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * deleteUser. Deletes user from map.
     * @param user, first value.
     */
    public void deleteUser(User user) {
        this.usersAccounts.remove(user);
    }

    /**
     * findByPassport. Return user by passport.
     * @param passport, first value.
     */
    public Optional<User> findByPassport(String  passport) {
        Optional<User> rsl = Optional.empty();

        for (User user : usersAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = Optional.of(user);
                break;
            }
        }
//        return usersAccounts.keySet().stream()
//                .filter(user -> user.getPassport().equals(passport))
//                .findFirst()
//                .orElse(null);
        return rsl;
    }

    /**
     * addAccountToUser. Adds account to current user.
     * @param passport, a user's passport data.
     * @param account, a user's bill account.
     */
    public void addAccountToUser(String passport, Account account) {
        if (account == null) {
            return;
        }

        for (Map.Entry<User, List<Account>> entry : this.usersAccounts.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                if (entry.getValue().size() == 0) {
                    entry.getValue().add(account);
                } else {
                    for (Account userAccount : entry.getValue()) {
                        if (userAccount.getRequisites().equals(account.getRequisites())) {
                            return;
                        }
                        entry.getValue().add(account);
                    }
                }
            }
        }
    }

    /**
     * getUserAccounts. Gets a list of user's account.
     * @param passport, a user's passport data.
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> list = new ArrayList<Account>();
        list = usersAccounts.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getPassport().equals(passport))
                .findFirst().get().getValue(); ///тут падает ошибка когда лист пустой.
        return list;
    }

    /**
     * deleteAccountFromUser. Delete account from user's list of accounts.
     * @param passport, a user's passport data.
     * @param account, a user's bill account.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        if (account == null) {
            return;
        }

        for (Map.Entry<User, List<Account>> entry : this.usersAccounts.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    if (entry.getValue().get(i).equals(account)) {
                        this.usersAccounts.remove(account);
                        break;
                    }
                }
            }
        }
    }

    /**
     * getUserAccount. Gets account from user's list of accounts.
     * @param passport, a user's passport data.
     * @param requisite, a user's requisite of account.
     */
    public Optional<Account> getUserAccount(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);

        if (user.isEmpty()) {
            return Optional.empty();
        }

        return usersAccounts
                .get(user.get())
                .stream()
                .filter(a -> a.getRequisites().equals(requisite))
                .findFirst();
    }

    /**
     * transferMoney. Transfer money from srcPassport user list of bill accounts to destPassport user.
     * @param srcPassport, an src user's passport data.
     * @param srcRequisite, a user's requisite of account.
     * @param destPassport, a dest user's passport data.
     * @param dstRequisite, a dest user's requisite of account.
     * @param amount, amount which will be transfer.
     */
    public Optional<Boolean> transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Optional<Account> srcAccount = this.getUserAccount(srcPassport, srcRequisite);

        if (srcAccount.isEmpty()) {
            return Optional.empty();
        }
        if (srcAccount.get().getValue() < amount) {
            return Optional.empty();
        }

        Optional<Account> destAccount = this.getUserAccount(destPassport, dstRequisite);

        if (destAccount == null) {
            return Optional.empty();
        }

        srcAccount.get().setValue(srcAccount.get().getValue() - amount);
        destAccount.get().setValue(destAccount.get().getValue() + amount);

        return Optional.of(true);
    }
}