package ru.job4j.sort;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void whenListConvertToMap() {
        List<User> list = new ArrayList<>();

        list.add(new User("Poroshenko", 54));
        list.add(new User("Kravchur", 85));
        list.add(new User("Kuchma", 81));
        list.add(new User("Zelenkiy", 4));
        list.add(new User("Dubilet", 34));

        Set<User> result = new SortUser().sort(list);
        Set<User> expect = new TreeSet<User>();

        expect.add(new User("Dubilet", 34));
        expect.add(new User("Kravchur", 85));
        expect.add(new User("Kuchma", 81));
        expect.add(new User("Poroshenko", 54));
        expect.add(new User("Zelenkiy", 34));

        assertThat(result, is(expect));
    }
}
