package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Bank makes operation with users' account.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
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
                for (Account userAccount : entry.getValue()) {
                    if (userAccount.getRequisites().equals(account.getRequisites())) {
                        return;
                    }
                    entry.getValue().add(account);
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
        User user = (User) usersAccounts.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getPassport().equals(passport))
                .findFirst()
                .orElse(null);
        if (user != null) {
            list = usersAccounts.get(user);
        } else {
            list = Collections.emptyList();
        }

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
    public Account getUserAccount(String passport, String requisite) {
        List<Account> userAccounts = this.getUserAccounts(passport);

        if (userAccounts.size() == 0) {
            return null;
        }

        return userAccounts.stream()
                .filter(userAcc -> userAcc.getRequisites().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    /**
     * transferMoney. Transfer money from srcPassport user list of bill accounts to destPassport user.
     * @param srcPassport, an src user's passport data.
     * @param srcRequisite, a user's requisite of account.
     * @param destPassport, a dest user's passport data.
     * @param dstRequisite, a dest user's requisite of account.
     * @param amount, amount which will be transfer.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Account srcAccount = this.getUserAccount(srcPassport, srcRequisite);

        if (srcAccount == null && srcAccount.getValue() < amount) {
            return false;
        }

        Account destAccount = this.getUserAccount(destPassport, dstRequisite);

        if (destAccount == null) {
            return false;
        }

        srcAccount.setValue(srcAccount.getValue() - amount);
        destAccount.setValue(destAccount.getValue() + amount);

        return true;
    }
}