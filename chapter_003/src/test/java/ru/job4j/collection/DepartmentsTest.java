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
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    /**
     * Test whenNonChange.
     */
    @Test
    public void whenNonChange() {
//        List<String> input = Arrays.asList("k1", "k1/sk1");
//        List<String> expect = Arrays.asList("k1", "k1/sk1");
//        List<String> result = Departments.fillGaps(input);
//        assertThat(result, is(expect));
    }
}
