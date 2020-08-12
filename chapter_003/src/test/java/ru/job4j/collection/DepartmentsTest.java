package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test class DepartmentsTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class DepartmentsTest {
    /**
     * Test whenMissed.
     */
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/k2"); //Arrays.asList("k1/sk1");
        List<String> expect = List.of("k1", "k1/k2"); //Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    /**
     * Test whenNonChange.
     */
    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1"); //Arrays.asList("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1"); //Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    /**
     * Test whenSortAscending.
     */
    @Test
    public void whenSortAscending() {
        List<String> input = List.of(//Arrays.asList(
                "k2/sk1",
                "k1/sk1/ssk2",
                "k2",
                "k2/sk1/ssk1",
                "k1",
                "k2/sk1/ssk2",
                "k1/sk1",
                "k1/sk2",
                "k1/sk1/ssk1"
        );
        List<String> expect = List.of(//Arrays.asList(
                "k1",
                "k1/sk1",
                "k1/sk1/ssk1",
                "k1/sk1/ssk2",
                "k1/sk2",
                "k2",
                "k2/sk1",
                "k2/sk1/ssk1",
                "k2/sk1/ssk2"
        );
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    /**
     * Test whenSortDescending.
     */
    @Test
    public void whenSortDescending() {
        List<String> input = Arrays.asList(
                "k1",
                "k1/sk1",
                "k1/sk1/ssk1",
                "k1/sk1/ssk2",
                "k1/sk2",
                "k2",
                "k2/sk1",
                "k2/sk1/ssk1",
                "k2/sk1/ssk2"
        );
        List<String> expect = List.of(//Arrays.asList(
                "k2",
                "k2/sk1",
                "k2/sk1/ssk1",
                "k2/sk1/ssk2",
                "k1",
                "k1/sk1",
                "k1/sk1/ssk1",
                "k1/sk1/ssk2",
                "k1/sk2"
        );
        Departments.sortDesc(input);
        assertThat(input, is(expect));
    }
}
