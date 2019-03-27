package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleFirstTest {

    @Test
    public void whenFirstSingleton() {
        TrackerSingleFirst tracker1 = TrackerSingleFirst.INSTANCE;
        TrackerSingleFirst tracker2 = TrackerSingleFirst.INSTANCE;

        assertThat(tracker1, is(tracker2));
    }
}
