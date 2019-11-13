package ru.job4j.sort;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void whenSortLenghtAgeByComparable() {

        List<User> list = new ArrayList<>();

        list.add(new User("Poroshenko", 54));
        list.add(new User("Kravchur", 85));
        list.add(new User("Kuchma", 81));
        list.add(new User("Zelenkiy", 41));
        list.add(new User("Dubilet", 34));

        Set<User> result = new SortUser().sort(list);
        Set<User> expect = new TreeSet<User>();

        expect.add(new User("Dubilet", 34));
        expect.add(new User("Kravchur", 85));
        expect.add(new User("Kuchma", 81));
        expect.add(new User("Poroshenko", 54));
        expect.add(new User("Zelenkiy", 41));

        assertThat(result, is(expect));
    }

    @Test
    public void whenSortLenghtNameByComparator() {
        List<User> list = new ArrayList<>();
        List<User> expect = new ArrayList<>();

        list.add(new User("Poroshenko", 54));
        list.add(new User("Kravchur", 85));
        list.add(new User("Kuchma", 81));
        list.add(new User("Zelenkiya", 41));
        list.add(new User("Dubilet", 34));

        List<User> result = new SortUser().sortNameLength(list);

        expect.add(new User("Kuchma", 81));
        expect.add(new User("Dubilet", 34));
        expect.add(new User("Kravchur", 85));
        expect.add(new User("Zelenkiya", 41));
        expect.add(new User("Poroshenko", 54));

        assertThat(result, is(expect));
    }

    @Test
    public void whenSortLenghtNameAndAgeByComparator() {
        List<User> list = new ArrayList<>();
        List<User> expect = new ArrayList<>();

        list.add(new User("Dubilet", 78));
        list.add(new User("Poroshenko", 44));
        list.add(new User("Poroshenko", 55));
        list.add(new User("Dubilet", 37));

        List<User> result = new SortUser().sortByAllFields(list);

        expect.add(new User("Dubilet", 37));
        expect.add(new User("Dubilet", 78));
        expect.add(new User("Poroshenko", 44));
        expect.add(new User("Poroshenko", 55));

        assertThat(result, is(expect));
    }
}
