package ru.job4j.bank;

import java.util.Objects;

public class User {
    private String name;
    private String passort;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof User)) {
            return false;
        }

        User user = (User) obj;

        return this.name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
        //return name.hashCode();
    }
}
