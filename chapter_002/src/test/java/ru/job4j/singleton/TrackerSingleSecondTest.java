package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleSecondTest {

    @Test
    public void whenFirstSingleton() {
        TrackerSingleSecond tracker1 = TrackerSingleSecond.getInstance();
        TrackerSingleSecond tracker2 = TrackerSingleSecond.getInstance();

        assertThat(tracker1, is(tracker2));
    }
}
