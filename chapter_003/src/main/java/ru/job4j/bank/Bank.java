package ru.job4j.bank;

        import java.util.*;

public class Bank {
    private Map<User, List<Account>> usersAccounts;

    public Bank() {
        this.usersAccounts = new HashMap<User, List<Account>>();
    }

    public void addUser(User user) {
        this.usersAccounts.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(User user) {
        this.usersAccounts.remove(user);
    }
//Как мне этот метод проверить ? При дебаге он даже не заходит в цикл фор, ибо мапа пустая
    public void addAccountToUser(String passport, Account account) {
        if (account == null) {
            return;
        }

        for (Map.Entry<User, List<Account>> entry : this.usersAccounts.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                {
                    entry.getValue().add(account);
                }
            }
        }
    }

    public List<Account> getUserAccounts(String passport) {
        for (Map.Entry<User, List<Account>> entry : this.usersAccounts.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getValue();
            }
        }
        return null;
    }

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

    public Account getUserAccount(String passport, String requisite) {
        List<Account> userAccounts = this.getUserAccounts(passport);
        int k = 0;

        if (userAccounts == null) {
            return null;
        }

        for (int i = 0; i < userAccounts.size(); i++) {
            if (userAccounts.get(i).getRequisites().equals(requisite)) {
                userAccounts.get(i);
                k = i;
                break;
            }
        }
        return userAccounts.get(k);
    }

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