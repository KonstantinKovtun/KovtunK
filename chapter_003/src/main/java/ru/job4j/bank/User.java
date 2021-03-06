package ru.job4j.bank;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Class User. This class contains information about bank user.
 * @author Kovtun Konstantin (kovtun.kostya@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class User {
    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User))  {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }
    public String getPassport() {
        return this.passport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
}
