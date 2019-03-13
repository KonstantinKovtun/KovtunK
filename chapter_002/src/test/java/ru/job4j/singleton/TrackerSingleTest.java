package ru.job4j.singleton;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {

//    public static void main(String[] args) {
//        TrackerSingle tracker = TrackerSingle.getInstance();
//        tracker.add(new Item("name1", "desc1", 13032019));
//    }

    @Test
    public void whenFirstSingleton() {
        TrackerSingle tracker = TrackerSingle.getInstance();
        assertThat(tracker.add(new Item("123", "name1", "dest1", 13092)),
                is(tracker.add(new Item("123", "name1", "dest1", 13092))));
    }
}
