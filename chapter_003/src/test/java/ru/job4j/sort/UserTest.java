package ru.job4j.sort;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void whenSortLenghtAgeByComparable() {

//        List<User> list = new ArrayList<>();
        List<User> list = List.of(
                new User("Poroshenko", 54),
                new User("Kravchur", 85),
                new User("Kuchma", 81),
                new User("Zelenkiy", 41),
                new User("Dubilet", 34)
        );
        Set<User> result = new SortUser().sort(list);
//        Set<User> expect = new TreeSet<User>();
        Set<User> expect = Set.of(
                new User("Dubilet", 34),
                new User("Kravchur", 85),
                new User("Kuchma", 81),
                new User("Poroshenko", 54),
                new User("Zelenkiy", 41)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortLenghtNameByComparator() {
        List<User> list = new ArrayList<>();

        list.add(new User("Poroshenko", 54));
        list.add(new User("Kravchur", 85));
        list.add(new User("Kuchma", 81));
        list.add(new User("Zelenkiya", 41));
        list.add(new User("Dubilet", 34));

        List<User> result = new SortUser().sortNameLength(list);

//        List<User> expect = new ArrayList<>();
        List<User> expect = List.of(
                new User("Kuchma", 81),
                new User("Dubilet", 34),
                new User("Kravchur", 85),
                new User("Zelenkiya", 41),
                new User("Poroshenko", 54)
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortLenghtNameAndAgeByComparator() {
        List<User> list = new ArrayList<>();

        list.add(new User("Dubilet", 78));
        list.add(new User("Poroshenko", 44));
        list.add(new User("Poroshenko", 55));
        list.add(new User("Dubilet", 37));

        List<User> result = new SortUser().sortByAllFields(list);
        List<User> expect = List.of(
        new User("Dubilet", 37),
        new User("Dubilet", 78),
        new User("Poroshenko", 44),
        new User("Poroshenko", 55)
        );
        
        assertThat(result, is(expect));
    }
}
