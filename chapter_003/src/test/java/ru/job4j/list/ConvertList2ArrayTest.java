package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test class ConvertList2ArrayTest
 *
 * @author Kovtun Konstantin (kovtun.kostya@gmai.com)
 * @version $Id$
 * @since 0.1
 */
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7),
//                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenAddArraysToListThenGetOneList() {
        ConvertList2Array list = new ConvertList2Array();
        List<int[]> listAr = new ArrayList<>();

        listAr.add(new int[]{1, 2});
        listAr.add(new int[]{3, 4});
        listAr.add(new int[]{5, 6});

        List<Integer> result = list.convert(listAr);
        List<Integer> expect = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6)/*Arrays.asList(1, 2, 3, 4, 5, 6)*/);

        assertThat(result, is(expect));
    }
}