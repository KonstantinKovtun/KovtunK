package ru.job4j.lambda;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test class TestMathFunctions
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 26.04.2020
 */
public class TestMathFunctions {
    /**
     * Test whenLinearFunctionThenLinearResults.
     */
    @Test
    public void whenLinearFunctionThenLinearResults() {
        MathFunctions function = new MathFunctions();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    /**
     * Test whenLinearFunctionThenLinearResults.
     */
    @Test
    public void whenSquareFunctionThenSquareResults() {
        MathFunctions function = new MathFunctions();
        List<Double> result = function.diapason(5, 8, x -> 3 * x * x + 2 * x + 1);
        List<Double> expected = Arrays.asList(86D, 121D, 162D);
        assertThat(result, is(expected));
    }

    /**
     * Test whenLinearFunctionThenLinearResults.
     */
    @Test
    public void whenIndicateFunctionThenIndicateResults() {
        MathFunctions function = new MathFunctions();
        List<Double> result = function.diapason(5, 8, x -> 3 * x * x);
        List<Double> expected = Arrays.asList(75D, 108D, 147D);
        assertThat(result, is(expected));
    }
}
