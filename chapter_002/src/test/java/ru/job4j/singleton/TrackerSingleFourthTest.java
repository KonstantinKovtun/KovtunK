package ru.job4j.singleton;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleFourthTest {

    @Test
    public void whenFirstSingleton() {
        TrackerSingleFourth tracker1 = TrackerSingleFourth.getInstance();
        TrackerSingleFourth tracker2 = TrackerSingleFourth.getInstance();

        assertThat(tracker1, is(tracker2));
    }
}