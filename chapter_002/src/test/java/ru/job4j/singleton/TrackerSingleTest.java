package ru.job4j.singleton;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleTest {

    @Test
    public void whenFirstSingleton() {
        TrackerSingleFourth tracker = TrackerSingleFourth.getInstance();

        Item item;
        assertThat(tracker.add(new Item("123", "name1", "dest1", 13092)),
                is(tracker.add(new Item("123", "name1", "dest1", 13092))));
    }
}