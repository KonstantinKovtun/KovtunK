package ru.job4j.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleThirdTest {

    @Test
    public void whenFirstSingleton() {
        TrackerSingleThird tracker1 = TrackerSingleThird.getInstance();
        TrackerSingleThird tracker2 = TrackerSingleThird.getInstance();

        assertThat(tracker1, is(tracker2));
    }
}
