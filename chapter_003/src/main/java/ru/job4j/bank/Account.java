package ru.job4j.bank;

import java.util.Objects;

public class Account {
    /**
     * Amount sum of money.
     */
    private double value;
    /**
     * A requisites of user.
     */
    private String requisites;

    public double getValue() {
        return this.value;
    }
    public void setValue(Double value) {
        this.value = value;
    }

    public String getRequisites() {
        return this.requisites;
    }
    public Account(int value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return value == account.value
                &&
                Objects.equals(requisites, account.requisites);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, requisites);
    }
}
